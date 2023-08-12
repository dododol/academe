package kr.or.ddit.middle.vo;

public class BatterVO {

	
	private int p_no;
	private int pa;
	private int singles;
	private int doubles;
	private int triples;
	private int hr;
	private int bb;
	private int rbi;
	private int strikeouts;
	private int hbp;
	private int lineup;
	
	
	@Override
	public String toString() {
		return "BatterVO [p_no=" + p_no + ", pa=" + pa + ", singles=" + singles + ", doubles=" + doubles + ", triples="
				+ triples + ", hr=" + hr + ", bb=" + bb + ", rbi=" + rbi + ", strikeouts=" + strikeouts + ", hbp=" + hbp
				+ ", lineup=" + lineup + "]";
	}


	public int getP_no() {
		return p_no;
	}


	public void setP_no(int p_no) {
		this.p_no = p_no;
	}


	public int getPa() {
		return pa;
	}


	public void setPa(int pa) {
		this.pa = pa;
	}


	public int getSingles() {
		return singles;
	}


	public void setSingles(int singles) {
		this.singles = singles;
	}


	public int getDoubles() {
		return doubles;
	}


	public void setDoubles(int doubles) {
		this.doubles = doubles;
	}


	public int getTriples() {
		return triples;
	}


	public void setTriples(int triples) {
		this.triples = triples;
	}


	public int getHr() {
		return hr;
	}


	public void setHr(int hr) {
		this.hr = hr;
	}


	public int getBb() {
		return bb;
	}


	public void setBb(int bb) {
		this.bb = bb;
	}


	public int getRbi() {
		return rbi;
	}


	public void setRbi(int rbi) {
		this.rbi = rbi;
	}


	public int getStrikeouts() {
		return strikeouts;
	}


	public void setStrikeouts(int strikeouts) {
		this.strikeouts = strikeouts;
	}


	public int getHbp() {
		return hbp;
	}


	public void setHbp(int hbp) {
		this.hbp = hbp;
	}


	public int getLineup() {
		return lineup;
	}


	public void setLineup(int lineup) {
		this.lineup = lineup;
	}
	
	
	
	
	
	
	

}