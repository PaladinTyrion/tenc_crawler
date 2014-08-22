package cn.com.paladintyrion.client.controller.parse;

/**
 * 解析网页工具类
 * @author hujb
 */

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HtmlDocUtil {
	
	/**
	 * 从 URL 直接加载 HTML 文档
	 * @param urlstr
	 * @return
	 */
 	public static Document getHtmlDocFromURL(String urlstr){
		 
		Document doc = null;
		try {
			doc = Jsoup.connect(urlstr).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return doc;
	}
 	
 	/**
 	 * 从 Html 字符 直接加载 HTML 文档
 	 * @param htmlstr
 	 * @return Document object
 	 */
 	public static Document getHtmlDocFromStr(String htmlstr){
 		Document doc = Jsoup.parse(htmlstr); 
 		return doc;
 	}
}