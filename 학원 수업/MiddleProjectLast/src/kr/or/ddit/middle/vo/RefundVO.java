package kr.or.ddit.middle.vo;

public class RefundVO {

	private String b_num;
	private String m_date;
	private int r_refund;
	
	
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
	public int getR_refund() {
		return r_refund;
	}
	public void setR_refund(int r_refund) {
		this.r_refund = r_refund;
	}
	
	
	@Override
	public String toString() {
		return "RefundVO [b_num=" + b_num + ", m_date=" + m_date + ", r_refund=" + r_refund + "]";
	}
	
	
	
	
}
