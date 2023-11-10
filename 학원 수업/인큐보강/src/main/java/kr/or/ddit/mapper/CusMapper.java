package kr.or.ddit.mapper;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.CusVO;
import kr.or.ddit.vo.MembersVO;

public interface CusMapper {

	public int createPost(CusVO cusVO);
	
	public CusVO detail(CusVO cusVO);
	
	public int updatePost(CusVO cusVO);
	
	public int deletePost(CusVO cusVO);

	public List<CusVO> list(Map<String, Object> map);
}
