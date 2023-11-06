package kr.or.ddit.service.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.or.ddit.mapper.MembersMapper;
import kr.or.ddit.service.MembersService;
import kr.or.ddit.vo.MembersVO;

@Service
public class MembersServiceImpl implements MembersService{

	@Inject
	MembersMapper membersmapper; 
	
	@Override
	public int createPost(MembersVO membersVO) {
		return this.membersmapper.createPost(membersVO);
	}
	
	@Override
	public MembersVO detail(MembersVO membersVO) {
		return this.membersmapper.detail(membersVO);
	}
	
	@Override
	public int updatePost(MembersVO membersVO) {
		return this.membersmapper.updatePost(membersVO);
	}

	@Override
	public int deletePost(MembersVO membersVO) {
		return this.membersmapper.deletePost(membersVO);
	}

	@Override
	public List<MembersVO> list(Map<String, Object> map) {
		return this.membersmapper.list(map);
	}
	
}
