package kr.or.ddit.middle.service;

import java.util.List;

import kr.or.ddit.middle.dao.FileInfoDaoImpl;
import kr.or.ddit.middle.dao.IFileInfoDao;
import kr.or.ddit.middle.vo.FileInfoVO;

public class FileInfoServiceImpl implements IFileInfoService {
	
	private IFileInfoDao dao;
	
	private static FileInfoServiceImpl service;
	
	private  FileInfoServiceImpl() {
		dao=FileInfoDaoImpl.getInstance();
	}
	
	public static FileInfoServiceImpl getInstance() {
		if(service == null) service = new FileInfoServiceImpl();
		
		return service;
	}
	
	
	@Override
	public int insertFileinfo(FileInfoVO fileVo) {
		return dao.insertFileinfo(fileVo);
	}

	@Override
	public List<FileInfoVO> getAllFileInfo() {
		return dao.getAllFileInfo();
	}

	@Override
	public List<FileInfoVO> getFileInfo(String file_writer) {

		return  dao.getFileInfo(file_writer);
	}

	@Override
	public List<FileInfoVO> getNoticeFileinfo(String file_writer) {
		
		return dao.getNoticeFileinfo(file_writer);
	}

}
