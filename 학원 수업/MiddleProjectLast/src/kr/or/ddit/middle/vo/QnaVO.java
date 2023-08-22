package kr.or.ddit.middle.vo;

import java.util.List;

public class QnaVO {

	private int q_no;
	private String mem_id;
	private String q_title;
	private String q_content;
	private String q_date;
	private int q_hit;
	private int q_pass;
	
	
	public int getQ_no() {
		return q_no;
	}
	public void setQ_no(int q_no) {
		this.q_no = q_no;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getQ_title() {
		return q_title;
	}
	public void setQ_title(String q_title) {
		this.q_title = q_title;
	}
	public String getQ_content() {
		return q_content;
	}
	public void setQ_content(String q_content) {
		this.q_content = q_content;
	}
	public String getQ_date() {
		return q_date;
	}
	public void setQ_date(String q_date) {
		this.q_date = q_date;
	}
	public int getQ_hit() {
		return q_hit;
	}
	public void setQ_hit(int q_hit) {
		this.q_hit = q_hit;
	}
	public int getQ_pass() {
		return q_pass;
	}
	public void setQ_pass(int q_pass) {
		this.q_pass = q_pass;
	}
	
	
	@Override
	public String toString() {
		return "QnaVO [q_no=" + q_no + ", mem_id=" + mem_id + ", q_title=" + q_title + ", q_content=" + q_content
				+ ", q_date=" + q_date + ", q_hit=" + q_hit + ", q_pass=" + q_pass + "]";
	}
	
	
	
		
}
