package kr.or.ddit.service.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.or.ddit.mapper.UsersMapper;
import kr.or.ddit.service.UsersService;
import kr.or.ddit.vo.MembersVO;
import kr.or.ddit.vo.UsersVO;

@Service
public class UsersServiceImpl implements UsersService {

	@Inject
	UsersMapper usersMapper;
	
	@Override
	public int createPost(UsersVO usersVO) {
		return this.usersMapper.createPost(usersVO);
	}
	
	@Override
	public UsersVO detail(UsersVO usersVO) {
		return this.usersMapper.detail(usersVO);
	}
	
	@Override
	public int updatePost(UsersVO usersVO) {
		return this.usersMapper.updatePost(usersVO);
	}
	
	@Override
	public int deletePost(UsersVO usersVO) {
		return this.usersMapper.deletePost(usersVO);
	}
	
	@Override
	public List<UsersVO> list(Map<String, Object> map) {
		return this.usersMapper.list(map);
	}
}
