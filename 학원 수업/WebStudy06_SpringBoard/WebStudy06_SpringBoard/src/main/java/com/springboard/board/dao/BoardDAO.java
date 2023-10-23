package com.springboard.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.springboard.board.vo.FreeBoardVO;
import com.springboard.paging.vo.PaginationInfo;

@Mapper
public interface BoardDAO {
	/**
	 * 글 등록
	 * @param board
	 * @return
	 */
	public int insertBoard(FreeBoardVO board);
	/**
	 * 글조회
	 * @param boNo
	 * @return
	 */
	public FreeBoardVO selectBoard(@Param("boNo") int boNo);
	/**
	 * 조회수 증가
	 * @param boNo
	 * @return
	 */
	public int incrementHit(int boNo);
	
	/**
	 * 검색 조건에 맞는 게시글 수 조회
	 * @param paging
	 * @return
	 */
	public int selectTotalRecord(PaginationInfo<FreeBoardVO> paging); 
	/**
	 * 검색 조건에 맞는 게시글목록 조회
	 * @param paging
	 * @return
	 */
	public List<FreeBoardVO> selectBoardList(PaginationInfo<FreeBoardVO> paging);
	
	/**
	 * 게시글 수정과 삭제에서 사용될 인증
	 * @param inputData
	 * @return 인증에 성공했을 경우, 해당 게시글 반환, 실패한 경우, null 반환
	 */
	public int updateBoard(FreeBoardVO board);
	
	public int deleteBoard(int boNo);
}
