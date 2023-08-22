package kr.or.ddit.middle.dao;

import java.util.List;

import kr.or.ddit.middle.vo.FileInfoVO;

public interface IFileInfoDao {
	
	/**
	 * fileVo에 저장된 자료를 DB에 insert하는 메서드
	 * 
	 * @param fileVo insert할 자료가 저장된FileInfoVO객체
	 * @return 작업성공 :1 , 작업실패 :0
	 */
	public int insertFileinfo(FileInfoVO fileVo);
	
	
	/**
	 * DB에 있는 전체 파일 목록을 가져와 List에 담아서 반화하는 메서드
	 * 
	 * @return 전체 FileInfoVO 저장된 List객체 
	 */
	public List<FileInfoVO> getAllFileInfo();
	
	/**
	 *파일번호를 매개변수로 받아서 해당 파일 정보를 VO에 담아서 반환하는 메서드 
	 * 
	 * @param file_writer 검색할 파일 번호
	 * @return 검색된 결과가 저장된 FileInfoVO객체
	 */
	public List<FileInfoVO> getFileInfo(String file_writer);
	
	/**
	 *파일번호를 매개변수로 받아서 해당 파일 정보를 VO에 담아서 반환하는 메서드 
	 * 
	 * @param file_writer 검색할 파일 번호
	 * @return 검색된 결과가 저장된 FileInfoVO객체
	 */
	public List<FileInfoVO> getNoticeFileinfo(String file_writer);

	
}
