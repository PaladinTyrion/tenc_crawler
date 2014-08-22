package cn.com.paladintyrion.client.bean;

import lombok.Getter;
import lombok.Setter;

public class TaskJsonBean {
	
	/**
	 * 需要爬取的url
	 */
	@Getter
	@Setter
	private String url;
	
	/**
	 * 视频类型：电视剧、电影、综艺
	 */
	@Getter
	@Setter
	private String type;
	
	/**
	 * 网站类型：0优酷, 1爱奇艺, 2乐视网, 4sohu, 5迅雷看看, 6腾讯视频
	 */
	@Getter
	@Setter
	private int site;
	
	/**
	 * 处理类型：0抓取单个剧集，1更新标准库列表
	 */
	@Getter
	@Setter
	private int taskType;
}
