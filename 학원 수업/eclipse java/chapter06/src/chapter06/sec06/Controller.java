package chapter06.sec06;

public class Controller {

	public static void main(String[] args) {
		new Controller().controller();

	}

	public void controller() {
		MemberService memberService = new MemberService();
		Member member = new Member("ȫ�浿","a001","1234",30);
		boolean result = memberService.login(member.getid(),member.getPasswd());
		if (result) {
			System.out.println(member.getid() + "���� �α��� �߽��ϴ�.");
		} else {
			System.out.println("id�� Ȥ�� password�� �߸� �Է��߽��ϴ�.");
		}
	}
	
	
}
