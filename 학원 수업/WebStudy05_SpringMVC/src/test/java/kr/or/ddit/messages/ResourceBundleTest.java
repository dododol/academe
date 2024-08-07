package kr.or.ddit.messages;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.MessageSourceAccessor;

import kr.or.ddit.AbstractRootContextTest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class ResourceBundleTest extends AbstractRootContextTest{
	@Inject
	private MessageSourceAccessor accessor;
	
	@Test
	void test3() {
		String message = accessor.getMessage("hi", new Object[] {"반장"});
		log.info("검색된 메시지 : {}", message);
	}
	
	@Test
	void test2() {
		String message = accessor.getMessage("javax.validation.constraints.NotBlank.message", Locale.ENGLISH);
		log.info("검색된 메시지 : {}", message);
	}
	
	@Test
	void test() {
		ResourceBundle bundle = 
				ResourceBundle.getBundle("org.hibernate.validator.ValidationMessages", Locale.JAPANESE);
		String message = bundle.getString("javax.validation.constraints.AssertFalse.message");
		log.info("검색된 메시지 : {}", message);
	}

}
