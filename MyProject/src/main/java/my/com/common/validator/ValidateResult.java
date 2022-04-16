package my.com.common.validator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

// 사용자 유효성 검사를 하기 위한 객체들을 가지고 원하는 대상에 대한 에러 메시지 지정.
public class ValidateResult {
	
	private Map<String,Object> error;
	
	public ValidateResult() {
		error = new HashMap<String, Object>();
	}
	
	public void addErrors(Errors errors) {
		for (FieldError fieldError : errors.getFieldErrors()) {
			error.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
	}

	public Map<String, Object> getError() {
		return error;
	}
}
