package kr.or.ddit.middle.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.middle.dao.IQnaDao;
import kr.or.ddit.middle.dao.QnaDaoImpl;
import kr.or.ddit.middle.vo.PageVO;
import kr.or.ddit.middle.vo.QnaVO;
import kr.or.ddit.middle.vo.ReplyVO;

public class QnaServiceImpl implements IQnaService {
	
	private static QnaServiceImpl service;
	
	private IQnaDao dao;
	
	private QnaServiceImpl() {
		dao= QnaDaoImpl.getInstance();
	}
	
	public static QnaServiceImpl getInstance() {
		if(service == null) service= new QnaServiceImpl();
		
		return service;
	}
	
	@Override
	public int insertQna(QnaVO qVO) {

		return dao.insertQna(qVO);
	}

	@Override
	public int getMaxId() {

		return dao.getMaxId();
	}

	@Override
	public List<QnaVO> selectQnaList() {

		return dao.selectQnaList();
	}

	@Override
	public int updateQna(QnaVO qVO) {

		return dao.updateQna(qVO);
	}

	@Override
	public int deleteQna(int q_no) {

		return dao.deleteQna(q_no);
	}

	@Override
	public QnaVO selectQna(int q_no) {
		
		int cnt = dao.setCountIncrement(q_no);
		if(cnt==0) {
			return null;
		}
		
		
		return dao.selectQna(q_no);
	}

	@Override
	public List<QnaVO> getSearchQna(String data) {

		return dao.getSearchQna(data);
	}

	@Override
	public int setCountIncrement(int q_no) {

		return dao.setCountIncrement(q_no);
	}

	@Override
	public int totalCount(Map<String, Object> map) {

		return dao.totalCount(map);
	}

	@Override
	public List<QnaVO> selectByPage(Map<String, Object> map) {

		return dao.selectByPage(map);
	}
	
	@Override
	public PageVO pageInfo(int page, String stype, String sword) {
		
		//전체글 갯수 구하기
		Map<String,Object> pageMap= new HashMap<String,Object>();
		pageMap.put("stype", stype);
		pageMap.put("sword", sword);
		
		int count = this.totalCount(pageMap);
		
		//전체페이지 수 구하기
		int perList = PageVO.getPerList(); //10
		int totalPage = (int)Math.ceil(count/(double)perList);
		
		//start, end 구하기
		int start = (page-1)*perList +1;
		int end = start + perList -1;
		if(end > count) end= count;
		
		//시작페이지 끝페이지
		int perPage = PageVO.getPerPage(); //3
		int startPage = ((page-1)/ perPage * perPage) +1;
		int endPage = startPage + perPage -1;
		if(endPage > totalPage) endPage = totalPage;
				
		PageVO vo = new PageVO();
		
		vo.setStart(start);
		vo.setEnd(end);
		vo.setStartPage(startPage);
		vo.setEndPage(endPage);
		vo.setTotalPage(totalPage);
				
		return vo;
	}

	@Override
	public int insertReply(ReplyVO vo) {

		return dao.insertReply(vo);
	}

	@Override
	public int deleteReply(int re_no) {

		return dao.deleteReply(re_no);
	}

	@Override
	public int updateReply(ReplyVO vo) {

		return dao.updateReply(vo);
	}

	@Override
	public List<ReplyVO> selectReplyList(int bo_no) {
		
		return dao.selectReplyList(bo_no);
	}

}
