package org.csu.sinojapaneseexchange.translate;

import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Translator {

	// 谷歌翻译(只能翻译比较短的内容)Get
	public static Map<String,String> TranslateGoogleGet(String transalteContente, String fromLanguage, String toLanguage) {
		Map<String,String> map = new HashMap();
		StringBuilder result = new StringBuilder();
		String roma = "";
		StringBuilder url = new StringBuilder();
		try {
			url.append("https://translate.google.cn/translate_a/single?").append("client=t&sl=").append(fromLanguage)
					.append("&tl=").append(toLanguage).append("&hl=zh-CN")
					.append("&dt=at&dt=bd&dt=ex&dt=ld&dt=md&dt=qca&dt=rw")
					.append("&dt=rm&dt=ss&dt=t&ie=UTF-8&oe=UTF-8&otf=2&ssel=0&tsel=0&kc=1&tk=")
					.append(googleToken(transalteContente)).append("&q=")
					.append(URLEncoder.encode(transalteContente, "utf-8"));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 获取请求连接
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			String str = null;
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpGet httpGet = new HttpGet(url.toString());
			CloseableHttpResponse httpResponse = null;
			try {
				httpResponse = httpClient.execute(httpGet);
				HttpEntity httpEntity = httpResponse.getEntity();
				str = EntityUtils.toString(httpEntity, "UTF-8");
				EntityUtils.consume(httpEntity);
				System.out.println(str);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			String string = str.split("]],")[0];
//			System.out.println(string);
			String[] split = string.split(",null,null,[0-9]],");
			for (String string2 : split) {
				String string3 = string2.split("\",\"")[0];
				int start = string3.indexOf("\"") + 1;
				if (!string2.contains("[null,null,")) {
					result.append(string3.substring(start, string3.length()));
				}else {
					roma = string3.substring(start, string3.length());
				}
			}
			
			System.out.println("result" + result.toString());
			System.out.println("roma" + roma);
			
			map.put("result", result.toString());
			map.put("roma", roma);
			return map;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 获取谷歌翻译的tk值
	 * 
	 * @param text
	 * @return
	 */
	private static String googleToken(String text) {
		String tk = "";
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
		try {
			// FileReader reader = new FileReader(ConfigUtil.getString("GoogleJs"));
			URL resource = Translator.class.getResource("");
			String string = resource.getPath().split("/WEB-INF")[0];
			string = string + "google.js";
			FileReader reader = new FileReader(string);
			engine.eval(reader);
			if (engine instanceof Invocable) {
				Invocable invoke = (Invocable) engine;
				tk = String.valueOf(invoke.invokeFunction("token", text));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tk;
	}

}
