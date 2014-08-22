package cn.com.paladintyrion.client.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import cn.com.paladintyrion.client.bean.VideoInfo;
import cn.com.paladintyrion.client.bean.VideoProperty;

public class VideoInfoPropertyVO {
	@Getter
	@Setter
	List<VideoInfo> videoInfoList;
	@Getter
	@Setter
	List<VideoProperty> videoPropertyList;
}
