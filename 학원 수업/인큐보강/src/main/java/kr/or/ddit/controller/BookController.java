package kr.or.ddit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ddit.service.BookService;
import kr.or.ddit.vo.BookVO;
import lombok.extern.slf4j.Slf4j;

/*
 Controller 어노테이션
 스프링 프레임워크에게 " 이 클래스는 웹 브라우저의 요청(request)를
 받아들이는 컨트롤러야"라고 알려주는 것임
 스프링은 servlet-context.xml의 context:component-scan의 설정에 의해
 이 클래스를 자바빈 객체로 등록(메모리에 바인딩)
 */
@Slf4j
@Controller
public class BookController {
	//서비스를 호출하기 위해 의존성 주입(Dependency Injection-DI)
	@Autowired
	BookService bookService;
	
	//요청URI : localhost/create
	//요청방식 : get
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public ModelAndView create() {
		log.info("create");
		
		/* ModelAndView
		 1) Model : Controller가 반환할 데이터(String, int, List, Map, VO..)를 담당
		 2) View  : 화면을 담당(뷰(View : jsp)의 경로)
		 */
		ModelAndView mav = new ModelAndView();
		/* 뷰리졸버
		 <beans:property name="prefix" value="/WEB-INF/views/" />
		<beans:property name="suffix" value=".jsp" />
		 */
		///WEB-INF/views/ + book/create + .jsp
		//forwarding
		mav.setViewName("book/create");
		
		return mav;
	}
	
	/*
	 요청URI : /create
	요청방식 : post
	요청파라미터(HTTP파라미터) : 서버로 전달되는 키:값. {title:개똥이모험,category:소설,price:12000}
	 */
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public ModelAndView createPost(BookVO bookVO, ModelAndView mav) {
		//BookVO(bookId=0, title=개똥이모험, category=소설, price=12000
		//, insertDate=null, content=null)
		log.info("bookVO : " + bookVO);
		
		//BOOK테이블에 insert
		int result = bookService.createPost(bookVO);
		log.info("createPost->result : " + result);
		//BookVO(bookId=1, title=개똥이모험, category=소설, price=12000
		//, insertDate=null, content=null)
		
		// 요청URI인 /detail을 다시 요청
		mav.setViewName("redirect:/detail?bookId="+bookVO.getBookId());
		
		return mav;
	}
	
	//책 상세보기
	//요청된 URI 주소 : http://localhost/detail?bookId=3
	//?bookId=3 : 쿼리 스트링(Query String)
	//bookVO => {"bookId":"3","title":"","category":"","price":0,"insertDate":""}
	@RequestMapping(value="/detail",method=RequestMethod.GET)
	public ModelAndView detail(@ModelAttribute BookVO bookVO,
			ModelAndView mav) {
		log.info("detail->bookVO : " + bookVO);
		//{"bookId":"3","title":"총알탄 개똥이","category":"소설","price":10000,"insertDate":"22/07/19"}
		BookVO data = this.bookService.selectDetail(bookVO);
		//model : 데이터를 jsp로 넘겨줌
		mav.addObject("data", data);
		mav.addObject("bookId", data.getBookId());
		//forwarding => 데이터를 jsp로 넘겨줌 / but, redirect => 데이터를 jsp로 못넘겨줌
		//view : jsp의 경로
		///WEB-INF/views/ + ... + .jsp
		mav.setViewName("book/detail");
		
		return mav;
	}
	
	/*
	요청URI : /updatePost
	요청파라미터 : bookVO{"bookId":"3","title":"총알탄 개똥이","category":"소설"
		,"price":10000,"insertDate":"22/07/19","content":"개똥이의 여행"}
	요청방식 : post
	 */
	@RequestMapping(value="/updatePost",method=RequestMethod.POST)
	public ModelAndView updatePost(BookVO bookVO, ModelAndView mav) {
		log.info("updatePost->bookVO : " + bookVO);
		
		int result = this.bookService.update(bookVO);
		log.info("result : " + result);
		
		//경로
		mav.setViewName("redirect:/detail?bookId="+bookVO.getBookId());
		
		return mav;
	}
	
	//<form id="frm" name="frm" action="/deletePost" method="post">
	/*
	 요청URI : /deletePost
	 요청파라미터 : {"bookId":"3","title":"총알탄 개똥이","category":"소설"
		,"price":10000,"insertDate":"","content":"개똥이의 여행"}
	요청방식 : post
	 */
	@RequestMapping(value="/deletePost",method=RequestMethod.POST)
	public ModelAndView deletePost(BookVO bookVO, ModelAndView mav) {
//		bookVO {"bookId":"75","title":"총알탄 개똥이","category":"소설"
//		,"price":10000,"insertDate":"","content":"개똥이의 여행"}
		log.info("deletePost->bookVO : " + bookVO);
		//스프링은 인터페이스를 좋아해(확장성, 유동성)
		int result = this.bookService.deletePost(bookVO);
		log.info("deletePost->result : " + result);
		
		if(result>0) {//삭제 성공
			//목록으로 이동
			mav.setViewName("redirect:/list");
		}else {//삭제 실패
			mav.setViewName("redirect:/detail?bookId="+bookVO.getBookId());
		}
		
		return mav;
	}
	
	//요청 URI => http://localhost/list?keyword=검색어
	//골뱅이RequestParam(value="파라미터name(keyword)"
	//					, required=false(?keyword=일 때 오류방지))
	//스프링에서 파라미터를 매개변수로 받을 수 있음
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list(ModelAndView mav, 
			@RequestParam(value="keyword", required=false) String keyword) {
		List<BookVO> list = this.bookService.list(keyword);
		//select 결과 목록을 데이터로 넣어줌. jsp로 리턴
		mav.addObject("data", list);
		mav.addObject("keyword", keyword);
		//forwarding
		mav.setViewName("book/list");
		
		return mav;
	}
}








