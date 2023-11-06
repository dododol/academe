package kr.or.ddit.mapper;

import kr.or.ddit.vo.LprodVO;

public interface LprodMapper {

	// 상품분류 등록
	public int createPost(LprodVO lprodVO);

	// 상세
	public LprodVO detail(LprodVO lprodVO);
	
	// <update id="updatePost" parameterType="lprodVO">
	public int updatePost(LprodVO lprodVO);
	
	// <delete id="deletePost" parameterType="lprodVO">
	public int deletePost(LprodVO lprodVO);

}
