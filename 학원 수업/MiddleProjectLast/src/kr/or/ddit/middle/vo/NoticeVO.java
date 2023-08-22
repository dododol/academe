package kr.or.ddit.middle.vo;

import java.util.List;

public class NoticeVO {

	private int n_no;
	private String mem_id;
	private String n_title;
	private String n_content;
	private String n_date;
	private int n_hit;
	
	
	//중첩된 자바빈
	//FanBoardVO : fileList = 1 : N
	private List<FileInfoVO> fileList;
	
	
	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public int getN_no() {
		return n_no;
	}
	
	public void setN_no(int n_no) {
		this.n_no = n_no;
	}
	
	public String getN_title() {
		return n_title;
	}
	public void setN_title(String n_title) {
		this.n_title = n_title;
	}
	public String getN_content() {
		return n_content;
	}
	public void setN_content(String n_content) {
		this.n_content = n_content;
	}
	public String getN_date() {
		return n_date;
	}
	public void setN_date(String n_date) {
		this.n_date = n_date;
	}
	public int getN_hit() {
		return n_hit;
	}
	public void setN_hit(int n_hit) {
		this.n_hit = n_hit;
	}
	
	public List<FileInfoVO> getFileList() {
		return fileList;
	}
	public void setFileList(List<FileInfoVO> fileList) {
		this.fileList = fileList;
	}

	
	@Override
	public String toString() {
		return "NoticeVO [n_no=" + n_no + ", mem_id=" + mem_id + ", n_title=" + n_title + ", n_content=" + n_content
				+ ", n_date=" + n_date + ", n_hit=" + n_hit + ", fileList=" + fileList + "]";
	}
	
	
}
