package chap03;
import java.util.Scanner;

public class Exercies14 {

    public static void main(String[] args) {
    	//1. course 와 score 배열 생성 및 선언
        String course[]= {"Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드"};
        int score[] = {95, 88, 76, 62, 55};
        String name="";
        
        //2. Scanner 생성 및 선언
        Scanner scan=new Scanner(System.in);

        //3. 과목 이름을 입력받아서, "그만" 이라고 입력할 때까지 진행
        //3-1. course 내의 값이라면 매칭되는 score 값을 출력
        //3-2. course 내의 값이 아니라면 "해당 과목은 없습니다" 라고 출력
        while(true){
            System.out.print("과목 이름>>");
            name=scan.next();

            if(name.equals("그만")) {
                System.out.println("프로그램을 종료합니다");
                break; }
            
            // course 값을 순회하면서
            for(int i=0; i<course.length; i++) {
                if(course[i].equals(name)) {
                    System.out.println(course[i]+"의 점수는 "+score[i]);
                    break;
                }

                if(i==course.length-1)
                    System.out.println("없는 과목입니다.");
            }
        }
    }
}