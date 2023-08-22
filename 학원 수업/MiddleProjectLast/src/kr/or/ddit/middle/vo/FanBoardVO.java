package kr.or.ddit.middle.vo;

import java.util.List;

public class FanBoardVO {

	private int b_no;
	private String mem_id;
	private String b_title;
	private String b_content;
	private String b_date;
	private String a_id;
	private int b_hit;
	
	//중첩된 자바빈
	//FanBoardVO : fileList = 1 : N
	private List<FileInfoVO> fileList;
	
	
	public int getB_hit() {
		return b_hit;
	}
	public void setB_hit(int b_hit) {
		this.b_hit = b_hit;
	}
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String a_id) {
		this.a_id = a_id;
	}
	public List<FileInfoVO> getFileList() {
		return fileList;
	}
	public void setFileList(List<FileInfoVO> fileList) {
		this.fileList = fileList;
	}
	
	@Override
	public String toString() {
		return "FanBoardVO [b_no=" + b_no + ", mem_id=" + mem_id + ", b_title=" + b_title + ", b_content=" + b_content
				+ ", b_date=" + b_date + ", a_id=" + a_id + ", b_hit=" + b_hit + ", fileList=" + fileList + "]";
	}
	
	
}
