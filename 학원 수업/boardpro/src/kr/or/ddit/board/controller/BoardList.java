package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.BoardServiceImpl;
import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.board.vo.BoardVO;
import kr.or.ddit.board.vo.PageVO;

/**
 * Servlet implementation class BoardList
 */
@WebServlet("/BoardList.do")
public class BoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		// 요청시 전송데이터 받기 - page, stype sword
		int page = Integer.parseInt(request.getParameter("page"));
		
		// 최초 실행시 값이 없다
		String stype = request.getParameter("stype");
		String sword = request.getParameter("sword");
		
		// service객체 얻기
		IBoardService service = BoardServiceImpl.getService();
		
		// service 메소드 호출 - page정보 얻기
		PageVO pvo = service.pageInfo(page, stype, sword);
		// start, end, startPage, endPage, totalpage
		
		
		// service메소드 호출 - page정보에 의한 리스트 select - list결과
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", pvo.getStart() );
		map.put("end", pvo.getEnd());
		map.put("stype", stype);
		map.put("sword", sword);
		
		List<BoardVO> list = service.selectByPage(map);
		
		
		// 결과값을 request에 저장
		request.setAttribute("listvalue", list);
		
		// view페이지로 이동
		request.getRequestDispatcher("/boardview/list.jsp").forward(request, response);
		
		
	}

}


































