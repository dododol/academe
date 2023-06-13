package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {

		public C() {
			A a = new A();
			a.field1 = 1;
			a.field2 = 1;		// (x) <<-- default 필드 접근 불가(컴파일 에러)
			a.field3 = 1;		// (x) <<-- private 필드 접근 불가(컴파일 에러)
			
			a.method1();
			a.method2();		// (x) <<-- default 메소드 접근 불가(컴파일 에러)
			a.method3();		// (x) <<-- default 메소드 접근 불가(컴파일 에러)
			
		}
	}
}
