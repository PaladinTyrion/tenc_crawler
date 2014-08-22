package cn.com.paladintyrion.client.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class VideoCommentUserInfoVO {
	@Getter
	@Setter
	private List<Comment> commentList;
	@Getter
	@Setter
	private List<UserInfo> userInfoList;

}
