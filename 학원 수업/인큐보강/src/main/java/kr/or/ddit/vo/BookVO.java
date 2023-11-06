package kr.or.ddit.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BookVO {
	private int bookId;
	private String title;
	private String category;
	private int price;
	private Date insertDate;
	private String content;
}
