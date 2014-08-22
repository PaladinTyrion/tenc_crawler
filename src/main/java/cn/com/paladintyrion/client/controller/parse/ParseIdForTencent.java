/**
 * 
 */
package cn.com.paladintyrion.client.controller.parse;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import cn.com.paladintyrion.client.controller.util.HttpRequestUtil;

/**
 * @author ZhouBin
 *
 */
public class ParseIdForTencent {

	/**
	 * 
	 */
	public ParseIdForTencent() {
		// TODO Auto-generated constructor stub
	}
	
	public static String getCommentIdforTencent(String vid) {
		String COMMENT_ID_BASE_URL = "http://sns.video.qq.com/fcgi-bin/video_comment_id";
		String commentId = null;
		Map<String,String> params = new HashMap<String,String>();
		params.put("otype", "json");
		params.put("op", "3");
		params.put("vid", vid);
		String getCommentIdJson = HttpRequestUtil.httpGetRequest(COMMENT_ID_BASE_URL, params);
		getCommentIdJson = ToolforRegEx.getInBigbrackets(getCommentIdJson);
		JSONObject jsonObjectCid = JSONObject.parseObject(getCommentIdJson);
		commentId = jsonObjectCid.getString("comment_id");
		return commentId;
	}
	
	public static String getVidforTencent(String htmlStr) {
		String vid = ToolforRegEx.getCuts(htmlStr, "vid:\"", "\",");
		return vid;
	}
	
	public static String getIdforTencent(String htmlStr) {
		String videoId = ToolforRegEx.getCuts(htmlStr, "id :\"", "\",");
		return videoId;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
