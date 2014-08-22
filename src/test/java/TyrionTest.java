import java.io.UnsupportedEncodingException;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import com.alibaba.fastjson.JSONObject;

import cn.com.paladintyrion.client.bean.UrlBean;
import cn.com.paladintyrion.client.bean.UrlBeanExt;
import cn.com.paladintyrion.client.controller.crawler.TencentCrawler;
import cn.com.paladintyrion.client.controller.util.HttpRequestUtil;

@Slf4j
public class TyrionTest {

	public static int getCommentCount(String commentId, int pageSize){
		double commentCount = 0;
		int pageCount = 0;
		String COMMENT_COUNT_BASE_URL = "http://video.coral.qq.com/article/";
		String COMMENT_COUNT_LAST_URL = "/commentnum";	
		String commentCountStr = "";
		String commentCountUrl = COMMENT_COUNT_BASE_URL + commentId + COMMENT_COUNT_LAST_URL;
		String getCommentCountJson = HttpRequestUtil.httpGetRequest(commentCountUrl, null);
		if(getCommentCountJson != null){
			JSONObject jsonObjectCC = null;
			jsonObjectCC = JSONObject.parseObject(getCommentCountJson);
			JSONObject jsonObj = jsonObjectCC.getJSONObject("data");
			commentCountStr = jsonObj.getString("commentnum");
		}
		if(!commentCountStr.equals("")){
			commentCount = Double.parseDouble(commentCountStr);
		}
		pageCount = (int)Math.ceil(commentCount/pageSize);
		return pageCount;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String commentId = "1005874548";
//		int pageSize = 30;
//		int a = getCommentCount(commentId,pageSize);
//		log.info(a + "haha");
		String commentContent = "\\xF0\\x9F\\x90\\xB7\\xE6\\x8B";
		log.info(commentContent);
		String gbk;
		try {
			gbk = java.net.URLEncoder.encode(commentContent, "GBK");
			log.info(gbk);
			commentContent = java.net.URLDecoder.decode(gbk, "GBK");
			log.info(commentContent);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
