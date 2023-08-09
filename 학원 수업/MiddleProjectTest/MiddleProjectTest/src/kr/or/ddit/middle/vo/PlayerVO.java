package kr.or.ddit.middle.vo;

public class PlayerVO {

	private int p_no;
	private String p_name;
	private String p_position;
	private int p_age;
	private int p_sal;
	private String p_stat;
	private String p_hdate;
	private String lr; 
	private int game;
	private String mem_id;
	private String p_img1;
	private String p_img2;
	
	public String getP_role() {
		return p_role;
	}
	public void setP_role(String p_role) {
		this.p_role = p_role;
	}
	private String p_role;
	
	
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
	public int getP_age() {
		return p_age;
	}
	public void setP_age(int p_age) {
		this.p_age = p_age;
	}
	public int getP_sal() {
		return p_sal;
	}
	public void setP_sal(int p_sal) {
		this.p_sal = p_sal;
	}
	public String getP_stat() {
		return p_stat;
	}
	public void setP_stat(String p_stat) {
		this.p_stat = p_stat;
	}
	public String getP_hdate() {
		return p_hdate;
	}
	public void setP_hdate(String p_hdate) {
		this.p_hdate = p_hdate;
	}
	public String getLr() {
		return lr;
	}
	public void setLr(String lr) {
		this.lr = lr;
	}
	public int getGame() {
		return game;
	}
	public void setGame(int game) {
		this.game = game;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getP_img1() {
		return p_img1;
	}
	public void setP_img1(String p_img1) {
		this.p_img1 = p_img1;
	}
	public String getP_img2() {
		return p_img2;
	}
	public void setP_img2(String p_img2) {
		this.p_img2 = p_img2;
	}
	@Override
	public String toString() {
		return "PlayerVO [p_no=" + p_no + ", p_name=" + p_name + ", p_position=" + p_position + ", p_age=" + p_age
				+ ", p_sal=" + p_sal + ", p_stat=" + p_stat + ", p_hdate=" + p_hdate + ", lr=" + lr + ", game=" + game
				+ ", mem_id=" + mem_id + ", p_img1=" + p_img1 + ", p_img2=" + p_img2 + "]";
	}
	
	
	
}
