package kr.co.dozn.org_api_server.validate;

import kr.co.dozn.org_api_server.model.FirmInqBeneReqLayer;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ApiReqInqBeneValidate implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return FirmInqBeneReqLayer.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        FirmInqBeneReqLayer req = (FirmInqBeneReqLayer)target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "clientMessageId", "2002", "필수 파라미터: clientMessageId");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "transactionId", "2002", "필수 파라미터: transactionId");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "orgCode", "2002", "필수 파라미터: orgCode");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "providerId", "2002", "필수 파라미터: providerId");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "creditBankId", "2002", "필수 파라미터: creditBankId");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "creditResourceNumber", "2002", "필수 파라미터: creditResourceNumber");


        if(req.getTransactionId() != null && req.getTransactionId().length() > 50) {
            errors.rejectValue("transactionId","2001","잘못된 파라미터: transactionId(길이오류, 최대 50자)");
        }else if(req.getCreditBankId() != null && req.getCreditBankId().length() > 100) {
            errors.rejectValue("creditBankId","2001","잘못된 파라미터: creditBankId(길이오류, 최대 100자)");
        }else if(req.getProviderId() != null && req.getProviderId().length() > 25) {
            errors.rejectValue("providerId","2001","잘못된 파라미터: providerId(길이오류, 최대 25자)");
        }else if(req.getOrgCode() != null && req.getOrgCode().length() > 8) {
            errors.rejectValue("orgCode","2001","잘못된 파라미터: orgCode(길이오류, 최대 8자)");
        }
    }
}
