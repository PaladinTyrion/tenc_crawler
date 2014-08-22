package cn.com.paladintyrion.client.thread;

import java.util.concurrent.Callable;

import cn.com.paladintyrion.client.bean.UrlBean;
import cn.com.paladintyrion.client.bean.VideoProperty;
import cn.com.paladintyrion.client.controller.parse.ParseVideoInfoProperty;

public class ParseVideoPropertyTask implements Callable<VideoProperty> {
	private UrlBean urlBean;
	
	public ParseVideoPropertyTask(UrlBean urlBean){
		this.urlBean = urlBean;
	}

	@Override
	public VideoProperty call() throws Exception {
		String urlStr = urlBean.getUrl();
		String videoCollectType = urlBean.getType();
		VideoProperty videoProperty = ParseVideoInfoProperty.getVideoProperty(urlStr, videoCollectType);	
		return videoProperty;
	}

}
