package kr.or.ddit.mapper;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.CusInfoVO;
import kr.or.ddit.vo.CusVO;

public interface CusInfoMapper {

	public int createPost(CusInfoVO cusInfoVO);
	
	public CusInfoVO detail(CusInfoVO cusInfoVO);
	
	public int updatePost(CusInfoVO cusInfoVO);
	
	public int deletePost(CusInfoVO cusInfoVO);
	
	public List<CusInfoVO> list(Map<String, Object> map);

}
