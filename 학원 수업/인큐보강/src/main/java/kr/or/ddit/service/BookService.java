package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.BookVO;

public interface BookService {
	//메소드 시그니처
	//도서등록
	public int createPost(BookVO bookVO);

	//책 상세보기(p.71)
	public BookVO selectDetail(BookVO bookVO);

	//책 수정
	public int update(BookVO bookVO);

	//책 삭제
	public int deletePost(BookVO bookVO);

	//책 목록
	public List<BookVO> list(String keyword);
	
}
