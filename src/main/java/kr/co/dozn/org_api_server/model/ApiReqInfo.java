package kr.co.dozn.org_api_server.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiReqInfo {

    private String clientMessageId;
    private String orgCode;
    private String transactionId;
    private String providerId;
    private String merchantId;
    private String merchantName;
    private String serviceId;
    private String customerType;
    private String debitPersonalType;
    private String debitPersonalId;
    private String debitPhoneNumber;
    private String debitType;
    private String debitResourceNumber;
    private String debitName;
    private String debitIssueDate;
    private String debitAddr;
    private String debitBankId;
    private String debitEmail;
    private String debitBirthDay;
    private String registerSmartBanking;
    private String creditBankId;
    private String creditType;
    private String creditResourceNumber;
    private String creditName;
    private String remittanceType;
    private String transferAmount;
    private String transferFee;
    private String transDesc;
    private String disCountCode;
    private String sendDT;
    private String channelId;
    private String walletToken;
    private String bankRefNo;
    private String walletId;
    private String customerId;
    private String customerLevel;
    private String feeType;
    private String transDate;
    private String verifyByBank;
    private String verifyMethod;
    private String verifyInfor;
    private String otp;
    private String OTPReqId;
    private String linkType;
    private String feeInclYn;
    private String processedRecord;
    private String oldClientMessageId;
    private String orgRequestDate;
    private String userName2;
    private String hmac;
    private String cardID2;
    private String grantType;
    private String responseRefNo;
    private String unlinkAllToken;
    private String otpType;
    private String isRequiredOTP2;
    private String authType;
    private String isByPassOTP;
    private String transType;
    private String refundDate;
    private String refundDesc;
    private String debitPhoneNumber2;
    private String debitPersonalId2;
    private String debitName2;
    private String debitIdentityIssueDate;
    private String debitIdentityIssuedPlace;
    private String debitCountry;
    private String errorType;
    private String businessErrorCode;
    private String businessErrorDesc;
    private String errorFieldLocation;
    private String httpStatus;
    private String httpError;
    private String addInfo;
    private String creditResourceNumber2;
    private List tr_infos;

    @SuppressWarnings("static-access")
    public String toString(){
        return new ToStringBuilder(this).reflectionToString (this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
