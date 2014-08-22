package cn.com.paladintyrion.client.thread;

import java.util.concurrent.Callable;

import cn.com.paladintyrion.client.bean.UrlBean;
import cn.com.paladintyrion.client.bean.VideoInfo;
import cn.com.paladintyrion.client.controller.parse.ParseVideoInfoProperty;


public class ParseVideoInfoTask implements Callable<VideoInfo> {
	private UrlBean urlBean;
	private String videoCollectType;
	
	public ParseVideoInfoTask(UrlBean urlBean, String videoCollectType){
		this.urlBean = urlBean;
		this.videoCollectType = videoCollectType;
	}

	@Override
	public VideoInfo call() throws Exception {
		String urlStr = urlBean.getUrl();
		String collectId = urlBean.getCollectId();
		VideoInfo videoInfo = ParseVideoInfoProperty.getVideoInfo(urlStr, collectId, videoCollectType);
		return videoInfo;
	}

}
