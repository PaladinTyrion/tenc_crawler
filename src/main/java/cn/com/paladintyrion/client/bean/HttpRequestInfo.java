package cn.com.paladintyrion.client.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.apache.http.Header;
import org.apache.http.cookie.Cookie;

public class HttpRequestInfo {
	
	/**
	 * 请求url
	 */
	@Getter
	@Setter
	private String url;
	/**
	 * 请求方法
	 */
	@Getter
	@Setter
	private String method;
	/**
	 * 请求返回状态码
	 */
	@Getter
	@Setter
	private int statusCode;
	/**
	 * 请求头信息
	 */
	@Getter
	@Setter
	private Header[] requestHeaders;
	/**
	 * 返回头信息
	 */
	@Getter
	@Setter
	private Header[] responseHeaders;
	/**
	 * 请求cookie信息
	 */
	@Getter
	@Setter
	private List<Cookie> requestCookies;
	/**
	 * 请求开始时间
	 */
	@Getter
	@Setter
	private Long requestStart;
	/**
	 * 请求结束时间
	 */
	@Getter
	@Setter
	private Long requestEnd;
	/**
	 * 请求关键字，若是评论接口请求，关键字为空
	 */
	@Getter
	@Setter
	private String keyword;
	/**
	 * 网站名
	 */
	@Getter
	@Setter
	private String sitename;
	/**
	 * 请求类型，0 url请求，1 评论api请求
	 */
	@Getter
	@Setter
	private int requestType;
	

}
