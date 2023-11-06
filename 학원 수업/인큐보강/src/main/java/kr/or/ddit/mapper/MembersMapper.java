package kr.or.ddit.mapper;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.MembersVO;

public interface MembersMapper {

	public int createPost(MembersVO membersVO);
	
	// <select id="detail" parameterType="membersVO" resultType="membersVO">
	public MembersVO detail(MembersVO membersVO);
	
	// <update id="updatePost" parameterType="membersVO">
	public int updatePost(MembersVO membersVO);
	
	// <delete id="deletePost" parameterType="membersVO">
	public int deletePost(MembersVO membersVO);

	public List<MembersVO> list(Map<String, Object> map);
}
