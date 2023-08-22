package kr.or.ddit.middle.vo;

public class LoginVO {

	private String mem_id;
	private String mem_pw;
	private String mem_tel;
	private String mem_name;
	private String mem_mail;
	private String mem_addr1;
	private String mem_num;
	private String mem_addr2;
	private int mem_addrnum; 
	
	
	
	@Override
	public String toString() {
		return "LoginVO [mem_id=" + mem_id + ", mem_pw=" + mem_pw + ", mem_tel=" + mem_tel + ", mem_name=" + mem_name
				+ ", mem_mail=" + mem_mail + ", mem_addr1=" + mem_addr1 + ", mem_num=" + mem_num + ", mem_addr2="
				+ mem_addr2 + ", mem_addrnum=" + mem_addrnum + "]";
	}
	public String getMem_addr2() {
		return mem_addr2;
	}
	public void setMem_addr2(String mem_addr2) {
		this.mem_addr2 = mem_addr2;
	}
	public int getMem_addrnum() {
		return mem_addrnum;
	}
	public void setMem_addrnum(int mem_addrnum) {
		this.mem_addrnum = mem_addrnum;
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
	public String getMem_tel() {
		return mem_tel;
	}
	public void setMem_tel(String mem_tel) {
		this.mem_tel = mem_tel;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_mail() {
		return mem_mail;
	}
	public void setMem_mail(String mem_mail) {
		this.mem_mail = mem_mail;
	}
	public String getMem_addr1() {
		return mem_addr1;
	}
	public void setMem_addr1(String mem_addr) {
		this.mem_addr1 = mem_addr;
	}
	public String getMem_num() {
		return mem_num;
	}
	public void setMem_num(String mem_num) {
		this.mem_num = mem_num;
	}
	
	
}
