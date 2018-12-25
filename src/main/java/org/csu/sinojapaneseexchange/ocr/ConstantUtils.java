package org.csu.sinojapaneseexchange.ocr;

public class ConstantUtils {
	
	/** 图片文字识别 **/
	// 网址
	public static String YOUDAO_URL = "http://openapi.youdao.com/ocrapi";
	// 应用ID
	public static String APPKEY = "7b46b056d5d0cb39";
	// 应用密钥
	public static String  KEY= "VenQ4YR0p8YuyTRZRgNiIhuueC1UNNZz";
	// 日语—韩语
	public static String JAPANESE_KOREA = "ja-ko";
	// 识别类型：按字识别
	public static String WORD_OCR = "10011";
	// 识别类型：按行识别
	public static String ROW_OCR = "10012";
	// 图片类型，目前只支持Base64, 为1
	public static String BASE64 = "1";
	// 服务器响应类型，目前只支持json
	public static String DOCTYPE = "json";
}
