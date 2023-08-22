package kr.or.ddit.middle.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.middle.vo.QnaVO;
import kr.or.ddit.middle.vo.ReplyVO;


public interface IQnaDao {
	
	/**
	 * 고객용 팬게시판 작성용 NoticeVO객체를 이용하여 닮아서 insert
	 * 
	 * @param fanVO 작성자가 입력한 데이터가 저장되는 객체
	 * @return 
	 */
	public int insertQna(QnaVO qVO);
	
	/**
	 * 게시판 번호 등록시에 기존 존재 게시판 번호중에 제일 큰숫자를 입력해주는 메소드
	 * 
	 * @param maxNo b_no에 입력한다.
	 * @return
	 */
	public int getMaxId();
	
	/**
	 *구단소식에 등록된 게시판 목록을 불러오는 select 메소드
	 * 
	 * @return VO객체로 List에 담겨져 보낸다.
	 */
	public List<QnaVO> selectQnaList();
	
	/**
	 * 팬게시판의 목록에 본인 작성된 게시판 글을 수정할수 있는 메서드
	 * 
	 * @param fanVO 
	 * @return
	 */
	public int updateQna(QnaVO qVO);
	
	/**
	 * 구단소식에  본인이 작성한 게시글을 게시번호를 매개변수로 가져와
	 * 삭제하는 메소드
	 * 
	 * @param b_no
	 * @return
	 */
	public int deleteQna(int q_no);
	
	/**
	 * 원하는 게시물의 번호를 불러와 검색한 구단소식 게시물번호의 게시물을 조회하는 메서드
	 * 
	 * @param b_no
	 * @return
	 */
	public QnaVO selectQna(int q_no);
	
	/**
	 * 검색창에 제목 검색을 하여 원하는 구단소식 게시물만을 조회하는 메서드
	 * 
	 * @param b_title
	 * @return
	 */
	public List<QnaVO> getSearchQna(String data);
	
	/**	매개변수로 가서 선택한 구단소식 게시판의 조회수를 증가해주는 메서드
	 * 
	 * @param b_no 게시판 번호가 
	 * @return
	 */
	public int setCountIncrement(int q_no);
	
	
	// 페이지 구성 ------------------------------------------------------------------
	/**
	 * 구단소식 페이지리스트 구성 전체글 갯수 구하는 메서드
	 * 
	 * @param map
	 * @return
	 */
	
	public int totalCount(Map<String, Object> map) ;
	
	/**
	 * 페이지별 리스트
	 * 
	 * @param map
	 * @return
	 */
	public List<QnaVO> selectByPage(Map<String, Object> map);
	
	
	// QNA 댓글 구성 -----------------------------------------------------------------
	
	
	/**
	 * 댓글쓰기 Qna 문의사항에 게시글 개별 댓글 등록하는 메서드
	 * @param vo
	 * @return
	 */
	 public int insertReply(ReplyVO vo);
		
	
	 /**
	  * 댓글 삭제 Qna 문의사항에 게시글 개별 댓글 삭제하는 메서드
	  * @param renum
	  * @return
	  */
	 public int deleteReply(int re_no);
		
	 
	 /**
	  * 댓글 수정 Qna 문의사항에 게시글 개별 댓글 수정하는 메서드
	  * @param vo
	  * @return
	  */
	 public int updateReply(ReplyVO  vo );
		
	 
	 /**
	  * 댓글 리스트  Qna 문의사항에 게시글 개별 댓글 리스트를 출력하는 메서드
	  * @param bonum
	  * @return
	  */
	 public List<ReplyVO>  selectReplyList(int qnano);
	
}






















