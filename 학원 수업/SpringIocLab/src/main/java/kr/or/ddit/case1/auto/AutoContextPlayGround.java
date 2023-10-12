package kr.or.ddit.case1.auto;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import kr.or.ddit.case1.presentation.Case1SamplePresentation;
import kr.or.ddit.case1.service.Case1SampleService;
import kr.or.ddit.case1.service.Case1SampleServiceImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AutoContextPlayGround {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("/kr/or/ddit/case1/conf/auto/auto-context.xml");
		context.registerShutdownHook();
		
		int count = context.getBeanDefinitionCount();
		String[] names = context.getBeanDefinitionNames();

		log.info("빈 갯수 : {}", count);
		log.info("빈 이름들 : {}", Arrays.toString(names));
	}
}
