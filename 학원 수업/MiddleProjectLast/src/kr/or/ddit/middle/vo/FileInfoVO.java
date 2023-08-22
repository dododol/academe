package kr.or.ddit.middle.vo;

public class FileInfoVO {

	private int file_no;
	private String origin_file_name;
	private String save_file_name;
	private String file_date;
	private long file_size;
	private String file_writer;
	private String mem_id;
	private int b_no;
	
	public int getFile_no() {
		return file_no;
	}
	public void setFile_no(int file_no) {
		this.file_no = file_no;
	}
	public String getOrigin_file_name() {
		return origin_file_name;
	}
	public void setOrigin_file_name(String origin_file_name) {
		this.origin_file_name = origin_file_name;
	}
	public String getSave_file_name() {
		return save_file_name;
	}
	public void setSave_file_name(String save_file_name) {
		this.save_file_name = save_file_name;
	}
	public String getFile_date() {
		return file_date;
	}
	public void setFile_date(String file_date) {
		this.file_date = file_date;
	}
	public long getFile_size() {
		return file_size;
	}
	public void setFile_size(long file_size) {
		this.file_size = file_size;
	}
	public String getFile_writer() {
		return file_writer;
	}
	public void setFile_writer(String file_writer) {
		this.file_writer = file_writer;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	@Override
	public String toString() {
		return "FileInfoVO [file_no=" + file_no + ", origin_file_name=" + origin_file_name + ", save_file_name="
				+ save_file_name + ", file_date=" + file_date + ", file_size=" + file_size + ", file_writer="
				+ file_writer + "]";
	}

	
}
