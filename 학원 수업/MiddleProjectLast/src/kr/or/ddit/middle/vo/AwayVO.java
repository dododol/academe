package kr.or.ddit.middle.vo;

public class AwayVO {
	private String a_name     ;
	private String a_image    ;
	private int ap_order   ;
	private String ap_name    ;
	private String ap_position;
	
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public String getA_image() {
		return a_image;
	}
	public void setA_image(String a_image) {
		this.a_image = a_image;
	}
	public int getAp_order() {
		return ap_order;
	}
	public void setAp_order(int ap_order) {
		this.ap_order = ap_order;
	}
	public String getAp_name() {
		return ap_name;
	}
	public void setAp_name(String ap_name) {
		this.ap_name = ap_name;
	}
	public String getAp_position() {
		return ap_position;
	}
	public void setAp_position(String ap_position) {
		this.ap_position = ap_position;
	}
	@Override
	public String toString() {
		return "AwayVO [a_name=" + a_name + ", a_image=" + a_image + ", ap_order=" + ap_order + ", ap_name=" + ap_name
				+ ", ap_position=" + ap_position + "]";
	}
	
	
	
}
