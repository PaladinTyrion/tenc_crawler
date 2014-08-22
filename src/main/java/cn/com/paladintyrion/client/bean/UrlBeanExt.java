package cn.com.paladintyrion.client.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class UrlBeanExt {

	@Getter
	@Setter
	private List<UrlBean> urlList;
	@Getter
	@Setter
	private VideoCollect videoCollect;
	@Getter
	@Setter
	private String videoCollectType;
}
