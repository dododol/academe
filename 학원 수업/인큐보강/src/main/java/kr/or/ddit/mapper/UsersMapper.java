package kr.or.ddit.mapper;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.MembersVO;
import kr.or.ddit.vo.UsersVO;

public interface UsersMapper {

	public int createPost(UsersVO usersVO);
	
	public UsersVO detail(UsersVO usersVO);
	
	public int updatePost(UsersVO usersVO);
	
	public int deletePost(UsersVO usersVO);
	
	public List<UsersVO> list(Map<String, Object> map);
}
