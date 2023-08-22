package kr.or.ddit.middle.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.middle.dao.FileInfoDaoImpl;
import kr.or.ddit.middle.dao.IFileInfoDao;
import kr.or.ddit.middle.dao.INoticeDao;
import kr.or.ddit.middle.dao.NoticeDaoImpl;
import kr.or.ddit.middle.vo.FileInfoVO;
import kr.or.ddit.middle.vo.NoticeVO;
import kr.or.ddit.middle.vo.PageVO;

public class NoticeServiceImpl implements INoticeService {
	
	private static INoticeService service;
	
	private INoticeDao dao;
	private IFileInfoDao fileInfoDao;
	
	private NoticeServiceImpl() {
		dao = NoticeDaoImpl.getInstance();
		fileInfoDao = FileInfoDaoImpl.getInstance();
	}
	
	public static INoticeService getInstance() {
		if(service == null) service = new NoticeServiceImpl();
		
		return service;
	}
	
	
	@Override
	public int insertNotice(NoticeVO noticeVO) {
		
		//BOARD테이블 한번 insert(부모) 1
		int result = dao.insertNotice(noticeVO);
				
		List<FileInfoVO> fileInfoVOList = noticeVO.getFileList();
				
		//FILEINFO테이블 여러번 insert(자식) N
		for(FileInfoVO fileInfoVO : fileInfoVOList) {
			result += fileInfoDao.insertFileinfo(fileInfoVO);
		}
						
		return result;
	}

	@Override
	public int getMaxId() {

		return dao.getMaxId();
	}

	@Override
	public List<NoticeVO> selectNoticeList() {

		return dao.selectNoticeList();
	}

	@Override
	public int updateNotice(NoticeVO noticeVO) {

		return dao.updateNotice(noticeVO);
	}

	@Override
	public int deleteNotice(int n_no) {

		return dao.deleteNotice(n_no);
	}

	@Override
	public NoticeVO selectNotice(int n_no) {
		
		int cnt = dao.setCountIncrement(n_no);
		if(cnt==0) {
			return null;
		}
		
		return dao.selectNotice(n_no);
	}

	@Override
	public List<NoticeVO> getSearchNotice(String data) {

		return dao.getSearchNotice(data);
	}

	@Override
	public int setCountIncrement(int n_no) {

		return dao.setCountIncrement(n_no);
	}
	
	@Override
	public int totalCount(Map<String, Object> map) {

		return dao.totalCount(map);
		
	}
	
	@Override
	public List<NoticeVO> selectByPage(Map<String, Object> map) {

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
	
	

}
