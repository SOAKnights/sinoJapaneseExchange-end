package org.csu.sinojapaneseexchange.ocr;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.sun.org.apache.xml.internal.security.utils.Base64;
import org.springframework.web.multipart.MultipartFile;

public class ImageUtils {

	/**
	 * 获得图片的Base64编码
	 * 
	 * @param imgFile
	 * @return
	 */
//	public static String getImageStr(String imgFile) {
//
//		// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
//		InputStream in = null;
//		byte[] data = null;
//		// 读取图片字节数组
//		try {
//			in = new FileInputStream(imgFile);
//			data = new byte[in.available()];
//			in.read(data);
//			in.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		// 对字节数组Base64编码
//		return Base64.encode(data);// 返回Base64编码过的字节数组字符串
//	}


	public static String getImageStr(MultipartFile imgFile) {

		// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
		InputStream in = null;
		byte[] data = null;
		// 读取图片字节数组
		try {
			in = imgFile.getInputStream();
			data = new byte[in.available()];
			in.read(data);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 对字节数组Base64编码
		return Base64.encode(data);// 返回Base64编码过的字节数组字符串
	}


}
