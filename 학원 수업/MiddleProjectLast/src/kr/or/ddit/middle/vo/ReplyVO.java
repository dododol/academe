package kr.or.ddit.middle.vo;

public class ReplyVO {

	private int re_no;
	private int q_no;
	private String mem_id;
	private String re_content;
	private String re_date;
	
	
	
	public int getRe_no() {
		return re_no;
	}
	public void setRe_no(int re_no) {
		this.re_no = re_no;
	}
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
	public String getRe_content() {
		return re_content;
	}
	public void setRe_content(String re_content) {
		this.re_content = re_content;
	}
	public String getRe_date() {
		return re_date;
	}
	public void setRe_date(String re_date) {
		this.re_date = re_date;
	}
	
	
	
	@Override
	public String toString() {
		return "ReplyVO [re_no=" + re_no + ", q_no=" + q_no + ", mem_id=" + mem_id + ", re_content=" + re_content
				+ ", re_date=" + re_date + "]";
	}
	
	
	
	
	
	
}
