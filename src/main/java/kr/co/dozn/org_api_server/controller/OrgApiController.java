package kr.co.dozn.org_api_server.controller;

import kr.co.dozn.org_api_server.constants.ApiRestURIConstants;
import kr.co.dozn.org_api_server.model.ApiRepInfo;
import kr.co.dozn.org_api_server.model.ApiReqInfo;
import kr.co.dozn.org_api_server.service.OrgApiService;
import kr.co.dozn.org_api_server.validate.ApiReqInqBeneValidate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class OrgApiController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ApiReqInqBeneValidate apiReqInqBeneValidate;

    @Autowired
    OrgApiService orgApiService;

    /**
     * 예금주조회 api 요청
     *
     * @return JSON
     */
    @RequestMapping(value = ApiRestURIConstants.INQUIRE_BENE_URI, method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<?> inquire(@RequestBody ApiReqInfo info, BindingResult bindingResult){
        ApiRepInfo rep = null;

        try{
            apiReqInqBeneValidate.validate(info, bindingResult);

            if (bindingResult.hasErrors()) {
                FieldError error = bindingResult.getFieldError();

                this.logger.error(info.toString() + "[" + error.getDefaultMessage() + "]");

                rep = new ApiRepInfo();

                rep.setStatus(400);
                rep.setBusinessErrorCode(error.getCode());
                rep.setBusinessErrorDesc(error.getDefaultMessage());

                return ResponseEntity.status(400).
                        header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE).body(rep);
            }

            rep = this.orgApiService.execInquireBeneficiary(info);
        }catch (Exception e) {
            this.logger.error("OrgApiController error.", e);

            //시스템 에러
            rep = new ApiRepInfo();

            rep.setStatus(500);
            rep.setBusinessErrorCode("9999");
            rep.setBusinessErrorDesc("서버에러");

            return ResponseEntity.status(500).
                    header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE).body(rep);
        }
        return ResponseEntity.status(rep.getStatus()).
                header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE).body(rep);
    }
}
