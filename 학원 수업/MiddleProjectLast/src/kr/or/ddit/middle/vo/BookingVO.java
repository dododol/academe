package kr.or.ddit.middle.vo;

public class BookingVO {

	private String b_num;
	private String m_date;
	private int b_seat;
	private int b_price;
	private String s_section;
	private String mem_id;
	private String b_bdate;
	private String b_stat;
	private int b_totalprice;
	private int b_counttticket;
	private String a_name;
	
	
	public String getB_num() {
		return b_num;
	}
	public void setB_num(String b_num) {
		this.b_num = b_num;
	}
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String m_date) {
		this.m_date = m_date;
	}
	public int getB_seat() {
		return b_seat;
	}
	public void setB_seat(int b_seat) {
		this.b_seat = b_seat;
	}
	public int getB_price() {
		return b_price;
	}
	public void setB_price(int b_price) {
		this.b_price = b_price;
	}
	public String getS_section() {
		return s_section;
	}
	public void setS_section(String s_section) {
		this.s_section = s_section;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getB_bdate() {
		return b_bdate;
	}
	public void setB_bdate(String b_bdate) {
		this.b_bdate = b_bdate;
	}
	public String getB_stat() {
		return b_stat;
	}
	public void setB_stat(String b_stat) {
		this.b_stat = b_stat;
	}
	public int getB_totalprice() {
		return b_totalprice;
	}
	public void setB_totalprice(int b_totalprice) {
		this.b_totalprice = b_totalprice;
	}
	public int getB_counttticket() {
		return b_counttticket;
	}
	public void setB_counttticket(int b_counttticket) {
		this.b_counttticket = b_counttticket;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	
	
	@Override
	public String toString() {
		return "BookingVO [b_num=" + b_num + ", m_date=" + m_date + ", b_seat=" + b_seat + ", b_price=" + b_price
				+ ", s_section=" + s_section + ", mem_id=" + mem_id + ", b_bdate=" + b_bdate + ", b_stat=" + b_stat
				+ ", b_totalprice=" + b_totalprice + ", b_counttticket=" + b_counttticket + ", a_name=" + a_name + "]";
	}
	
	
	
	
}
