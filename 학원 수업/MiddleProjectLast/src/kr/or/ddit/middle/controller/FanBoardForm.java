package kr.or.ddit.middle.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.catalina.tribes.util.Arrays;

import kr.or.ddit.middle.service.FanBoardServiceImpl;
import kr.or.ddit.middle.service.IFanBoardService;
import kr.or.ddit.middle.vo.FanBoardVO;
import kr.or.ddit.middle.vo.FileInfoVO;

/*
	- Servlet 3.0 이상에서 파일 업로드를 하려면 서블릿에 @MultipartConfig 애노테이션을 설정해야 한다.
	
	- @MultipartConfigd 애노테이션에서 설정할 변수들...
	1) location : 업로드한 파일이 임시적으로 저장될 경로를 지정한다.
	2) fileSizeThreshold : 이 곳에 지정한 값보다 큰 파일이 전송되면 location에 지정한
			임시 디렉토리에 파일을 잠시 저장한다.( 단위: byte, 기본값:0 (무조건 임시 디렉토리 사용)
	3) maxFileSize : 1개 파일의 최대 크기 (단위:byte, 기본값 : = -1L(무제한))
	4) maxRequestSize : 전체 파일 크기와 파일 이외의 데이터 크기의 합계의 최대 크기
						(단위:byte, 기본값 : -1L(무제한))
*/

@MultipartConfig(
fileSizeThreshold = 1024*1024*10, maxFileSize=1024*1024*30,
maxRequestSize= 1024*1024*100
)
@WebServlet("/board/fanBoardForm.do")
public class FanBoardForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String uploadPath ="d:/d_other/fanboardfile";

		File f = new File(uploadPath);
		if (!f.exists()) {
			f.mkdirs();
		}

		String userName = request.getParameter("fanboard_writer");//로그인?
		
		String fileName = "";
		List<FileInfoVO> fileList = new ArrayList<FileInfoVO>();

		for (Part part : request.getParts()) {
			fileName = extractFileName(part);
			System.out.println("fileName : " + fileName);

			if (!"".equals(fileName)) {
				FileInfoVO fileVo = new FileInfoVO();
				
				fileVo.setFile_writer(userName);
				fileVo.setOrigin_file_name(fileName);

				String saveFileName = UUID.randomUUID().toString();

				fileVo.setSave_file_name(saveFileName);

				fileVo.setFile_size((long)(Math.ceil(part.getSize() / 1024.0)));
				System.out.println("fileVO :" + fileVo);
				try {
					part.write(uploadPath + File.separator + saveFileName);

				} catch (Exception e) {
					e.printStackTrace();
				}
				
				fileList.add(fileVo);
					
			}
		} 

		String fanTitle = request.getParameter("fanboard_title");
		String fanId = request.getParameter("fanboard_writer");
		String fanContent = request.getParameter("fanboard_content");

		FanBoardVO fanVO = new FanBoardVO();
		
		fanVO.setMem_id(fanId);
		fanVO.setB_title(fanTitle);
		fanVO.setB_content(fanContent);
		//파일목록 처리
		fanVO.setFileList(fileList);
		
		IFanBoardService service = FanBoardServiceImpl.getInstance();
		/*
		 FanBoardVO [b_no=0, mem_id=user002, b_title=언더독스3, b_content=333, b_date=null, a_id=admin001, b_hit=0, 
			 fileList=[FileInfoVO [file_no=0, file_writer=admin001, origin_file_name=토토로.jpg, save_file_name=598b35b2-421d-4b62-8b36-3d8128d262c0, 
			 file_size=4, file_date=null]]]
		 */
		System.out.println("fanVO : " + fanVO);
		
		int cnt = service.insertFanBoard(fanVO);
		System.out.println("FanBoardForm->cnt : " + cnt);
		
		if (cnt > 0) {
			response.sendRedirect(request.getContextPath() + "/board/fanboardlist.do");
		} else {
			request.getRequestDispatcher("/html/board/fanboardform.jsp").forward(request, response);
		}

	}

	private String extractFileName(Part part) {
		String fileName = "";
		
		String conDisposition = part.getHeader("content-disposition");
		String[] items = conDisposition.split(";");
		System.out.println("items==>" + Arrays.toString(items));
		for (String item : items) {
			if (item.trim().startsWith("filename")) {
				fileName = item.substring(item.indexOf("=") + 2, item.length() - 1);
			}
		}
		return fileName;
	}
}