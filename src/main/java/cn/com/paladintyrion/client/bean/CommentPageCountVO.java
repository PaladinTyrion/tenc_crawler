package cn.com.paladintyrion.client.bean;

import lombok.Getter;
import lombok.Setter;

public class CommentPageCountVO {
	@Getter
	@Setter
	private VideoCommentUserInfoVO videoCommentUserInfoVO;
	@Getter
	@Setter
	private int pageCount;
}
