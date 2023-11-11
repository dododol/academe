package kr.or.ddit.service.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.or.ddit.mapper.CusInfoMapper;
import kr.or.ddit.service.CusInfoService;
import kr.or.ddit.vo.CusInfoVO;

@Service
public class CusInfoServiceImpl implements CusInfoService {

	@Inject
	CusInfoMapper cusInfoMapper;
	
	@Override
	public int createPost(CusInfoVO cusInfoVO) {
		return this.cusInfoMapper.createPost(cusInfoVO);
	}
	
	@Override
	public CusInfoVO detail(CusInfoVO cusInfoVO) {
		return this.cusInfoMapper.detail(cusInfoVO);
	}
	
	@Override
	public int updatePost(CusInfoVO cusInfoVO) {
		return this.cusInfoMapper.updatePost(cusInfoVO);
	}

	@Override
	public int deletePost(CusInfoVO cusInfoVO) {
		return this.cusInfoMapper.deletePost(cusInfoVO);
	}

	@Override
	public List<CusInfoVO> list(Map<String, Object> map) {
		return this.cusInfoMapper.list(map);
	}
}
