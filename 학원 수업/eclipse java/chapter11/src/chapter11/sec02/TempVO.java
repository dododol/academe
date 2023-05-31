package chapter11.sec02;

public class TempVO {

	private String empNo;
	private String ename;
	private String job;
	private int deptNo;
	
/*	private static TempVO instance = null;
	private TempVO() {}
	
	public static TempVO getInstance() {
		if(instance == null) instance = new TempVO();
		return instance;
	}
*/
	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	@Override
	public String toString() {
		return empNo + "  " + ename + "  " + job + "  " + deptNo + "  ";
	}
	
}
