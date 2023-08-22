package kr.or.ddit.middle.vo;


public class LBatterVO {
	
	private double pa        ;
	private double singles   ;
	private double doubles   ;
	private double triples   ;
	private double hr        ;
	private double bb        ;
	private double rbi       ;
	private double strikeouts;
	private double hbp       ;
	private int lineup;
	private int p_no      ;
	private String p_name    ;
	private String p_position;
	
	public double getPa() {
		return pa;
	}
	public void setPa(double pa) {
		this.pa = pa;
	}
	public double getSingles() {
		return singles;
	}
	public void setSingles(double singles) {
		this.singles = singles;
	}
	public double getDoubles() {
		return doubles;
	}
	public void setDoubles(double doubles) {
		this.doubles = doubles;
	}
	public double getTriples() {
		return triples;
	}
	public void setTriples(double triples) {
		this.triples = triples;
	}
	public double getHr() {
		return hr;
	}
	public void setHr(double hr) {
		this.hr = hr;
	}
	public double getBb() {
		return bb;
	}
	public void setBb(double bb) {
		this.bb = bb;
	}
	public double getRbi() {
		return rbi;
	}
	public void setRbi(double rbi) {
		this.rbi = rbi;
	}
	public double getStrikeouts() {
		return strikeouts;
	}
	public void setStrikeouts(double strikeouts) {
		this.strikeouts = strikeouts;
	}
	public double getHbp() {
		return hbp;
	}
	public void setHbp(double hbp) {
		this.hbp = hbp;
	}
	public int getLineup() {
		return lineup;
	}
	public void setLineup(int lineup) {
		this.lineup = lineup;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_position() {
		return p_position;
	}
	public void setP_position(String p_position) {
		this.p_position = p_position;
	}
	@Override
	public String toString() {
		return lineup + "번 타자" + p_name + " 선수 (" + p_position + ")";
	}

	
	

	
}
