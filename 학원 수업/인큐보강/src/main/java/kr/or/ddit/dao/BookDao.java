package kr.or.ddit.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.ddit.vo.BookVO;

@Repository
public class BookDao {
	
	//DI(Dependency Injection) : 의존성 주입
	//new 키워드를 통해 직접 생성하지 않고!!!
	//스프링이 미리 만들어 놓은(서버 실행 시 스프링이 미리 xml을 읽어
	//객체를 인스턴스화 해놓음)
	//sqlSessionTemplate 타입 객체를 BookDao 객체에 주입함
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	//<insert id="createPost" parameterType="bookVO">
	public int createPost(BookVO bookVO) {
		//book_SQL.xml 파일의 namespace가 book이고, id가 insert인
		//태그를 찾아 그 안에 들어있는 sql을 실행함
		//bookVO=>{"bookId":"","title":"총알탄 개똥이","category":"소설","price":10000,"insertDate":""}
		//insert,update,delete는 반영된 건수가 return됨
		//insert성공 : 1이상, 실패면 0
		
		//selectKey에 의해 생성된 기본키 값을 리턴해줌
		//bookVO(후)=>{"bookId":"1","title":"총알탄 개똥이","category":"소설","price":10000,"insertDate":""}
		return this.sqlSessionTemplate.insert("book.createPost",bookVO);
	}
	
	//책 상세보기(p.71)
	public BookVO selectDetail(BookVO bookVO) {
		//쿼리를 실행해주는 객체?(힌트 : root_context.xml)
		//selectOne() 메소드 : 1행을 가져올 때 사용 / selectList() 메소드 : 결과 집합 목록 반환(다중행)
		//결과 행 수가 0일 때? null을 반환
		//결과 행 수가 2 이상일 때? TooManyResultsException 예외 발생
		//selectOne("namespace.id", 파라미터)
		return this.sqlSessionTemplate.selectOne("book.select_detail",bookVO);
	}
	
	//책 수정
	//<update id="update" parameterType="bookVO">
	public int update(BookVO bookVO) {
		// update("namespace.id", 파라미터)
		return this.sqlSessionTemplate.update("book.update", bookVO);
	}

	public int deletePost(BookVO bookVO) {
		// delete("namespace.id",파라미터)
		return this.sqlSessionTemplate.delete("book.deletePost", bookVO);
	}

	//책 목록
	public List<BookVO> list(String keyword) {
		//selectList("namespace.id",파라미터)
		return this.sqlSessionTemplate.selectList("book.list",keyword);
	}
}





