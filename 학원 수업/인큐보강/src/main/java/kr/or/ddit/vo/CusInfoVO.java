package kr.or.ddit.vo;

import java.util.Date;

import lombok.Data;

@Data
public class CusInfoVO {

	private String cusNo;
	private String cusNm;
	private String addr;
	private String hp;
	private Date   regDate;
}
