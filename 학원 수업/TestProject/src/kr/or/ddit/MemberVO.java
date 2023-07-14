package kr.or.ddit;

public class MemberVO {
	private int mem_no;
	private String mem_id;
	private String mem_pw;
	private String mem_name;
	
	MemberVO(){}
	
	MemberVO(String id, String pw, String name){
		this.mem_id = id;
		this.mem_pw = pw;
		this.mem_name = name;
	}
	
	// getter & setter
	// getter : 값을 가져올 때 사용하는 함수
	// setter : 값을 저장할 때 사용하는 함수
	public String getId() {
		return mem_id;
	}
	
	public void setId(String mem_id) {
		this.mem_id = mem_id;
	}

	public int getMem_no() {
		return mem_no;
	}

	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_pw() {
		return mem_pw;
	}

	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	
}
