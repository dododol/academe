package kr.or.ddit.service.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.or.ddit.mapper.LprodMapper;
import kr.or.ddit.service.LprodService;
import kr.or.ddit.vo.LprodVO;

@Service
public class LprodServiceImpl implements LprodService {

	//Inject = Autowire
	//DI(의존성 주입)
	@Inject
	LprodMapper lprodmapper;
	
	@Override
	public int createPost(LprodVO lprodVO) {
		return this.lprodmapper.createPost(lprodVO);
	}

	@Override
	public LprodVO detail(LprodVO lprodVO) {
		return this.lprodmapper.detail(lprodVO);
	}

	// <update id="updatePost" parameterType="lprodVO">
	@Override
	public int updatePost(LprodVO lprodVO) {
		return this.lprodmapper.updatePost(lprodVO);
	}
	
	@Override
	public int deletePost(LprodVO lprodVO) {
		return this.lprodmapper.deletePost(lprodVO);
	}

	@Override
	public List<LprodVO> list(Map<String, String> map) {
		return this.lprodmapper.list(map);
	}
}
