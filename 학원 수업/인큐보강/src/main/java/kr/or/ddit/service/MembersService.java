package kr.or.ddit.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.MembersVO;

public interface MembersService {

	public int createPost(MembersVO membersVO);

	public MembersVO detail(MembersVO membersVO);

	public int updatePost(MembersVO membersVO);

	public int deletePost(MembersVO membersVO);

	public List<MembersVO> list(Map<String, Object> map);

}
