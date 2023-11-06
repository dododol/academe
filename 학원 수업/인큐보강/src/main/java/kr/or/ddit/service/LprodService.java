package kr.or.ddit.service;

import kr.or.ddit.vo.LprodVO;

public interface LprodService {

	// 상품분류 등록
	public int createPost(LprodVO lprodVO);

	// 상세
	public LprodVO detail(LprodVO lprodVO);

	// 업데이트
	public int updatePost(LprodVO lprodVO);
	
	// 삭제
	public int deletePost(LprodVO lprodVO);

}
