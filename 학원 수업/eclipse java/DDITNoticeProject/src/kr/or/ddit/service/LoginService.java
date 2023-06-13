package kr.or.ddit.service;

import java.util.Map;
import java.util.Scanner;

import kr.or.ddit.controller.NoticeController;
import kr.or.ddit.dao.LoginDao;
import kr.or.ddit.util.View;

// �α��� ����� ����� ���� Ŭ����
public class LoginService {
	
	// �����ϰ��� �ϴ� �ý��ۿ��� LoginService Ŭ������ �ϳ��� ��ü�� �����ϱ� ���ؼ�
	// �̱��� ������ �����Ͽ� �ϳ��� ��ü���� ��� �����Ͱ� ����� �� �ֵ��� ���
	// LoginService ��ü�� ����� ���� ����� instance ������ �����Ѵ�.
	private static LoginService instance = null;
	
	// �ش� Ŭ������ �⺻ �����ڷ� ȣ���Ͽ� �ν��Ͻ��� �������� ���ϵ��� private���� ���´�.
	private LoginService() {}
	
	// �⺻ �����ڷδ� �ν��Ͻ��� ���� �� �����Ƿ� getInstance() �Լ��� �̿��Ͽ�
	// LoginService ��ü�� ���� �� �ֵ��� getInstance) �Լ��� �����մϴ�.
	public static LoginService getInstance() {
		// �⺻������ ��ܿ� ������ LoginService ��ü ������ instance�� null�̴�.
		// ���ʷ� LoginService Ŭ���� �ȿ� �ִ� getInstance() �Լ��� ȣ��Ǵ� ����
		// ���� ó���� instance�� null�̹Ƿ�, new �����ڸ� ���ؼ� LoginService
		// ��ü�� ���������
		// �� ���Ŀ� getInstance() �� ȣ�� �������� �̹� ��ü�� ������� �־
		// instance�� null�� �ƴϹǷ� new �����ڸ� ���� Ŭ������ �������� �ʰ�
		// �̹� ������� �ִ� instance ������ ���ϵȴ�.
		if(instance == null) {
			instance = new LoginService();
		}
		return instance;
	}
	
	// ���񽺴� �����͸� �����ϴ� ������ ������� DAO�� ȣ���մϴ�.
	// DB�� ��û�� ����� DAO���� ��û�ϰ� ����� �ޱ� ���ؼ� DAO�� �θ� �� �ۿ� �����ϴ�.
	// "������ ����� DAO��!, �� �α��� �Ұǵ� idmpw ���״ϱ� ȸ������ ��ġ�ϴ°� ������
	// ���� �����ٷ���??? ����! �˰���?"
	LoginDao loginDao = LoginDao.getInstance();
	
	public int signIn() {
		// ������ ������ ��� ���� ����(�α��� ó���� ������ ��Ʈ�ѷ��� ������ ������ ����)
		int pageNo = 0;
		
		if((boolean)NoticeController.sessionStorage.get("login")) {
			System.out.println("[��SYSTEMLOG] �̹� �α��� �Ǿ� �ֽ��ϴ�!");
			// �α��� �Ǿ� �����Ƿ� �α����� ���̻� �������� �ʾƵ� �ǹǷ� ���� �޴��� �Ѿ�ϴ�.
			return View.MAIN;
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���̵� �Է� >> ");
		String id = sc.nextLine();
		System.out.print("�� ��й�ȣ �Է� >> ");
		String pw = sc.nextLine();
		
		// �Է� ���� ���̵�, ��й�ȣ�� �̿��Ͽ� �α����� ��û�Ѵ�. (������ ������� Dao��)
		// ���񽺿��� �Է¹��� ���̵� ��й�ȣ�� Dao���� �Ѱ��ָ� id, pw�� �ش��ϴ�
		// ȸ�������� MapŸ������ �����ݴϴ�.
		Map<String, Object> member = loginDao.signIn(id,pw);
		
		if(member != null && member.get("MEM_ID").equals(id)) {
			// �α��� ���¸� true�� �α��� ���̤� �����̶�� ���·� ����
			NoticeController.sessionStorage.put("login", true);
			// �α��� ������ ȸ�������� loginInfo�� ����
			NoticeController.sessionStorage.put("loginInfo", member);
			
			System.out.println("��" + member.get("MEM_+NAME") + 
					"�� ȯ���մϴ�!");
			pageNo = View.MAIN; // �α����� �Ϸ�Ǿ����Ƿ� ����ȭ������ �̵��Ѵ�.
		} else {	// ȸ�������� ���� ���� ����!!
			System.out.println("[��SYSTEMLOG] Server Error...! �α��� ����");
			pageNo=View.HOME;
		}
	}
}
