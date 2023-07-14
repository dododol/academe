package kr.or.ddit;

public class ClassTest {
	 public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		memberVO.setId("a001");
		
		String mem_id = memberVO.getId();
		System.out.println(memberVO.getId());
		
		MemberVO memberVO1 = new MemberVO("a002", "1234", "태형");
		
		String id1 = memberVO1.getId();
		String pw1 = memberVO1.getMem_pw();
		String name1 = memberVO1.getMem_name();
		System.out.println(id1 + ", " + pw1 + ", " + name1);
		
		memberVO1.setId("a003");
		memberVO1.setMem_pw("12341234");
		memberVO1.setMem_name("정범");
		
		id1 = memberVO1.getId();
		pw1 = memberVO1.getMem_pw();
		name1 = memberVO1.getMem_name();
		System.out.println(id1 + ", " + pw1 + ", " + name1);
	}
}
