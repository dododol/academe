package egovframework.let.temp.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;

@Controller
public class TempController {
	
	@Resource(name = "tempService")
	private TempService tempService;
	
	//임시데이터 가져오기
	@RequestMapping(value = "/temp/select.do")
	public String select(TempVO tempVO, HttpServletRequest request, ModelMap model) throws Exception{
		TempVO result = tempService.selectTemp(tempVO);
		model.addAttribute("result",result);
		return "temp/TempSelect";
	}
	
	//임시데이터 목록 가져오기
	@RequestMapping(value = "/temp/selectList.do")
	public String selectList(TempVO tempVO, HttpServletRequest request, ModelMap model) throws Exception{
		
		//List => java.util
		List<EgovMap> resultList = tempService.selectTempList(tempVO);
		model.addAttribute("resultList",resultList);
		
		return "temp/TempSelectList";
	}
}
