package kr.co.dozn.org_api_server.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
public class FirmOtpRepLayout {

    private String clientMessageId;
    private String orgCode;
    private String serviceId;
    private String transactionId;
    private String debitPersonalType;
    private String debitPersonalId;
    private String debitPhoneNumber;
    private String sendDT;
    private String otp;
    private String OTPReqId;
    private String httpStatus;
    private String httpError;
    private String businessErrorCode;
    private String businessErrorDesc;
    private String errorType;
    private String errorFieldLocation;
    private String responseRefNo;
    private String bankRefNo;
    private String isRequiredOTP;
    private String authType;
    private String authDesVN;
    private String authDesEN;
    private String authDesTimeoutVN;
    private String authDesTimeoutEN;
    private String addInfo;

    @SuppressWarnings("static-access")
    public String toString(){

        return new ToStringBuilder(this).reflectionToString (this, ToStringStyle.JSON_STYLE);
    }

}
