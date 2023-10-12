package kr.or.ddit.case1.service;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.case1.dao.Case1SampleDAO;
import lombok.extern.slf4j.Slf4j;

@Service("service")
@Slf4j
public class Case1SampleServiceImpl implements Case1SampleService {
	
//	1. new 키워드로 의존 객체를 직접 생성(의존관계에 묶인 두 객체 사이 결합력이 최상)
//	private Case1SampleDAO dao = new Case1SampleDAOImpl_Oracle();
//	2. Factory Object Pattern(factory 객체와 의존 괸계에 묶인 다른 객체들간의 결합력 발생)
//	private Case1SampleDAO dao = Case1SampleDAOFactory.getCase1SampleDAO();
//	3. Strategy Pattern(전략 패턴, Dependency Injection) - 전략의 주입자(모든 결합력의 책임)가 필요함 --> container
	private Case1SampleDAO dao;
	
	public Case1SampleServiceImpl() {
		log.info("{} 생성되엇음! ", 
				this.getClass().getSimpleName(), this.getClass().getSimpleName());
	}
	
	public void init() {
		log.info("{}  객체 생성 후 초기화 완료", this.getClass().getSimpleName());
	}
	public void destory() {
		log.info("{}  객체 소멸", this.getClass().getSimpleName());
	}

//	@Autowired // 주입할 대상으로 type 으로 검색함.
	@Inject
	@Named("Case1SampleDAOImpl_Oracle")
	public void setDao(Case1SampleDAO dao) {
		this.dao = dao;
		log.info("{} 를 setter injection으로 주입받음", dao.getClass().getSimpleName());
	}

	@Override
	public StringBuffer retrieveSample(String pk) {
		String rowData = dao.selectSample(pk);
		StringBuffer model = new StringBuffer();
		model.append(rowData);
		model.append("를 가공한 information");
		return model;
	}

}
