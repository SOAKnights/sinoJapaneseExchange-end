package org.csu.sinojapaneseexchange.ocr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class OCR {

	public static List getOCRResult(String imgPath) throws JSONException {
		Map<String, String> map = new HashMap<String, String>();
	    map.put("appKey", ConstantUtils.APPKEY);

	    String img = ImageUtils.getImageStr(imgPath);

	    map.put("img", img);
	    map.put("detectType", ConstantUtils.ROW_OCR);
	    map.put("imageType", ConstantUtils.BASE64);
	    map.put("langType", ConstantUtils.JAPANESE_KOREA);
	    map.put("docType", ConstantUtils.DOCTYPE);
	    String salt = String.valueOf(System.currentTimeMillis());
	    map.put("salt", salt);
	    String sign = MD5Utils.md5(ConstantUtils.APPKEY + img + salt + ConstantUtils.KEY);
	    map.put("sign", sign);
	    String result = null;
		try {
			result = requestOCRForHttp(ConstantUtils.YOUDAO_URL,map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List list = getOCRFormat(result);
	    System.out.println(list);
	    return list;
	}
	
	public static String requestOCRForHttp(String url,Map<String,String> requestParams) throws Exception{
	      String result = null;
	      CloseableHttpClient httpClient = HttpClients.createDefault();
	      /**HttpPost*/
	      HttpPost httpPost = new HttpPost(url);
	      List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
	      params.add(new BasicNameValuePair("appKey", requestParams.get("appKey")));
	      params.add(new BasicNameValuePair("img", requestParams.get("img")));
	      params.add(new BasicNameValuePair("detectType", requestParams.get("detectType")));
	      params.add(new BasicNameValuePair("imageType", requestParams.get("imageType")));
	      params.add(new BasicNameValuePair("langType", requestParams.get("langType")));
	      params.add(new BasicNameValuePair("salt", requestParams.get("salt")));
	      params.add(new BasicNameValuePair("sign", requestParams.get("sign")));
	      params.add(new BasicNameValuePair("docType", requestParams.get("docType")));
	      httpPost.setEntity(new UrlEncodedFormEntity(params,"UTF-8"));
	      /**HttpResponse*/
	      CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
	      try{
	          HttpEntity httpEntity = httpResponse.getEntity();
	          result = EntityUtils.toString(httpEntity, "utf-8");
	          EntityUtils.consume(httpEntity);
	      }finally{
	          try{
	              if(httpResponse!=null){
	                  httpResponse.close();
	              }
	          }catch(IOException e){
	        	  System.out.println("## release resouce error ##" + e);
	          }
	      }
	      return result;
	  }
	
	/**
	 * 处理json数据
	 * @param jsonString
	 * @return
	 */
	public static List getOCRFormat(String jsonString) throws JSONException {
		List list = new ArrayList();
		JSONObject json = new JSONObject(jsonString);
		// 段落
		JSONArray regions = json.getJSONObject("Result").getJSONArray("regions");
		int sizeOfRegions = regions.length();
		for(int i=0; i<sizeOfRegions; i++) {
			// 行
			JSONArray lines = regions.getJSONObject(i).getJSONArray("lines");
			int sizeOfLines = lines.length();
			for(int j=0; j<sizeOfLines; j++) {
				String text = (String) lines.getJSONObject(j).get("text");
				list.add(text);
			}
		}
		return list;
	}
	  
}
