package kr.or.ddit.middle.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.middle.dao.FanBoardDaoImpl;
import kr.or.ddit.middle.dao.FileInfoDaoImpl;
import kr.or.ddit.middle.dao.IFanBoardDao;
import kr.or.ddit.middle.dao.IFileInfoDao;
import kr.or.ddit.middle.vo.FanBoardVO;
import kr.or.ddit.middle.vo.FileInfoVO;
import kr.or.ddit.middle.vo.PageVO;

public class FanBoardServiceImpl implements IFanBoardService {

	private static IFanBoardService service;

	private IFanBoardDao dao;
	private IFileInfoDao fileInfoDao;

	private FanBoardServiceImpl() {
		dao = FanBoardDaoImpl.getInstance();
		fileInfoDao = FileInfoDaoImpl.getInstance();
	}

	public static IFanBoardService getInstance() {
		if (service == null)
			service = new FanBoardServiceImpl();
		
		return service;
	}
	
	@Override
	public int insertFanBoard(FanBoardVO fanVO) {
		//BOARD테이블 한번 insert(부모) 1
		int result = dao.insertFanBoard(fanVO);
		
		List<FileInfoVO> fileInfoVOList = fanVO.getFileList();
		
		//FILEINFO테이블 여러번 insert(자식) N
		for(FileInfoVO fileInfoVO : fileInfoVOList) {
			fileInfoVO.setB_no(fanVO.getB_no());
			fileInfoVO.setMem_id(fanVO.getMem_id());
			result += fileInfoDao.insertFileinfo(fileInfoVO);
		}
				
		return result;
	}

	@Override
	public int getMaxId() {

		return dao.getMaxId();
	}

	@Override
	public List<FanBoardVO> selectFanBoardList() {

		return dao.selectFanBoardList();
	}

	@Override
	public int updateFanBoard(FanBoardVO fanVO) {

		return dao.updateFanBoard(fanVO);
	}

	@Override
	public int deleteFanBoard(int b_no) {

		return dao.deleteFanBoard(b_no);
	}

	@Override
	public FanBoardVO selectFanBoard(int b_no) {
		int cnt = dao.setCountIncrement(b_no);
		if(cnt==0) {
			return null;
		}
		
		return dao.selectFanBoard(b_no);
	}

	@Override
	/**
	 * 검색창에 제목 검색을 하여 원하는 게시물만을 조회하는 메서드
	 * 
	 * @param b_title
	 * @return
	 */
	public List<FanBoardVO> getSearchFanBoard(String data) {
		
		return dao.getSearchFanBoard(data);
	}

	@Override
	public int setCountIncrement(int b_no) {
		
		return dao.setCountIncrement(b_no);
	}

	@Override
	public int totalCount(Map<String, Object> map) {

		return dao.totalCount(map);
	}

	@Override
	public List<FanBoardVO> selectByPage(Map<String, Object> map) {
		
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
