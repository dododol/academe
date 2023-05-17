package chapter06.sec01;
//예제 3] 사원번호(int 타입의 정수), 사원명, 전화번호를 보유한 사원클래스(Employees)
//를 작성하시오. 기능은 사원정보 출력 기능
public class Employees {

		int empId;
		String empName;
		String telNum;
		
		public void showEmpInfo() {
			System.out.println("-----------------------");
			System.out.println(" 사원번호     사원명     전화번호   ");
			System.out.println("-----------------------");
			System.out.printf("%6d  %4s  %15s",empId,empName,telNum);		//%6d = 6칸 뒤에서부터 적는데 숫자, %4s = 4칸 뒤에서부터 적는데 문제
		}
		
		

	}

