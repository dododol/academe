package chapter06.sec06;

import java.util.Scanner;

public class MemberService {
	
	public boolean login(String id, String passwd) {
		Scanner sc =new Scanner(System.in);
		System.out.print("id : ");
		String pid = sc.nextLine();
		
		System.out.print("passwd : ");
		String pwd = sc.nextLine();
		
		if(pid.equals(id) && pwd.equals(passwd)) {
			return true;
		} else {
			return false;
		}
		
	}

	public void logout(String id) {
		System.out.println(id+"님이 로그아웃 되었습니다.");
	}
}
