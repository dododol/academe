package com.springboard.board.service;

import org.apache.ibatis.exceptions.PersistenceException;

import com.springboard.board.BoardNotFoundException;
import com.springboard.board.vo.AttatchVO;
import com.springboard.board.vo.FreeBoardVO;
import com.springboard.paging.vo.PaginationInfo;

public interface BoardService {

	/**
	 * 글 등록, 등록시 문제가 발생한다면, mybatis는 {@link PersistenceException}를 throw 함.
	 * @param board
	 */
	public void createBoard(FreeBoardVO board);
	/**
	 * 게시글 상세조회
	 * @param boNo
	 * @return 존재하지 않으면, {@link BoardNotFoundException} 발생, 동시에 404 응답 전송.
	 */
	public FreeBoardVO retrieveBoard(int boNo);
	
	/**
	 * 다운로드를 위해 첨부파일 메타데이터 조회
	 * @param attNo
	 * @return
	 */
	public AttatchVO retrieveAttatch(int attNo);
	
	/**
	 * 게시글 목록 조회(검색 및 페이징 지원)
	 * @param paging
	 */
	public void retrieveBoardList(PaginationInfo<FreeBoardVO> paging);
	
	public FreeBoardVO authenticateBoard(FreeBoardVO inputData);
	
	public void modifyBoard(FreeBoardVO board);
	
	public void removeBoard(FreeBoardVO inputData);
}
