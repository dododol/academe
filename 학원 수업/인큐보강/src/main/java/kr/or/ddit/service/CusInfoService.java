package kr.or.ddit.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.CusInfoVO;

public interface CusInfoService {

	public int createPost(CusInfoVO cusInfoVO);

	public CusInfoVO detail(CusInfoVO cusInfoVO);

	public int updatePost(CusInfoVO cusInfoVO);
	
	public int deletePost(CusInfoVO cusInfoVO);
	
	public List<CusInfoVO> list(Map<String, Object> map);


}
