package kr.or.ddit.middle.vo;

public class PitcherVO {

	private int wins;
	private int era;
	private int ip;
	private int phr;
	private int pso;
	private int phits;
	private int saves;
	private int phbp;
	private int pbb;
	private int hold;
	private int p_no;
	private int loses;
	
	
	public int getHold() {
		return hold;
	}
	public void setHold(int hold) {
		this.hold = hold;
	}
	@Override
	public String toString() {
		return "PitcherVO [wins=" + wins + ", era=" + era + ", ip=" + ip + ", phr=" + phr + ", pso=" + pso + ", phits="
				+ phits + ", saves=" + saves + ", phbp=" + phbp + ", pbb=" + pbb + ", p_no=" + p_no + ", loses=" + loses
				+ "]";
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public double getEra() {
		return era;
	}
	public void setEra(int era) {
		this.era = era;
	}
	public int getIp() {
		return ip;
	}
	public void setIp(int ip) {
		this.ip = ip;
	}
	public int getPhr() {
		return phr;
	}
	public void setPhr(int phr) {
		this.phr = phr;
	}
	public int getPso() {
		return pso;
	}
	public void setPso(int pso) {
		this.pso = pso;
	}
	public int getPhits() {
		return phits;
	}
	public void setPhits(int phits) {
		this.phits = phits;
	}
	public int getSaves() {
		return saves;
	}
	public void setSaves(int saves) {
		this.saves = saves;
	}
	public int getPhbp() {
		return phbp;
	}
	public void setPhbp(int phbp) {
		this.phbp = phbp;
	}
	public int getPbb() {
		return pbb;
	}
	public void setPbb(int pbb) {
		this.pbb = pbb;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	public int getLoses() {
		return loses;
	}
	public void setLoses(int loses) {
		this.loses = loses;
	}

	
	
}
