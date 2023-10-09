package kr.or.ddit.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class StdListVO implements Serializable{
	private String lecCd;
	private String proCd;
	private String subCd;
	private String lecTime;
	private String lecRoom;
	private int lecPerson;
	private String lecWeek;
	
	private String stdNo;
	private int clsScore;
	
	private String proName;
	private String proMajor;
	private String proDeptNo;
	private String proTelNo;
	
	private String stdName;
	private String stdId;
	private String stdTelNo;
	private String stdAdd;

	private String subName;
	private int subGrade;
	

	
}
