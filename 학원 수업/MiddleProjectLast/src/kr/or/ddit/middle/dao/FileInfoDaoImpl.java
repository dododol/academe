package kr.or.ddit.middle.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.middle.vo.FileInfoVO;
import kr.or.ddit.util.MybatisUtil;

public class FileInfoDaoImpl implements IFileInfoDao {
	
	private static FileInfoDaoImpl dao;
	
	private  FileInfoDaoImpl() {}
	
	public static FileInfoDaoImpl getInstance() {
		if(dao==null) dao= new FileInfoDaoImpl();
		
		return dao;
	}
	
	@Override
	public int insertFileinfo(FileInfoVO fileVo) {
		SqlSession session =null;
		int cnt= 0;
		
		try {
			session = MybatisUtil.getSqlSession();
			cnt= session.insert("fileinfo.insertFileinfo",fileVo);
			if(cnt >0) {
				session.commit();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session!=null) session.close();
		}
		
		return cnt;
	}

	@Override
	public List<FileInfoVO> getAllFileInfo() {
		SqlSession session =null;
		List<FileInfoVO> fileList = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			fileList = session.selectList("fileinfo.getAllFileinfo");
					
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session!=null) session.close();
		}
		
		return fileList;
	}
	

	@Override
	public List<FileInfoVO> getFileInfo(String file_writer) {
		SqlSession session =null;
		List<FileInfoVO> fileList = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			fileList=session.selectList("fileinfo.getFileinfo",file_writer);
			System.out.println("fileList : "+fileList);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session!=null) session.close();
		}
		return fileList;
	}

	@Override
	public List<FileInfoVO> getNoticeFileinfo(String file_writer) {
		SqlSession session =null;
		List<FileInfoVO> fileList = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			fileList = session.selectList("fileinfo.getNoticeFileinfo");
					
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session!=null) session.close();
		}
		
		return fileList;
	}

}
