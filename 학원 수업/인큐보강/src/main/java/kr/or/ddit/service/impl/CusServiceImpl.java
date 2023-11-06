package kr.or.ddit.service.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.or.ddit.mapper.CusMapper;
import kr.or.ddit.service.CusService;
import kr.or.ddit.vo.CusVO;
import kr.or.ddit.vo.MembersVO;

@Service
public class CusServiceImpl implements CusService {

	@Inject
	CusMapper cusmapper;
	
	@Override
	public int createPost(CusVO cusVO) {
		return this.cusmapper.createPost(cusVO);
	}

	@Override
	public CusVO detail(CusVO cusVO) {
		return this.cusmapper.detail(cusVO);
	}
	
	@Override
	public int updatePost(CusVO cusVO) {
		return this.cusmapper.updatePost(cusVO);
	}
	
	@Override
	public int deletePost(CusVO cusVO) {
		return this.cusmapper.deletePost(cusVO);
	}

	@Override
	public List<MembersVO> list(Map<String, Object> map) {
		return this.cusmapper.list(map);
	}
}
