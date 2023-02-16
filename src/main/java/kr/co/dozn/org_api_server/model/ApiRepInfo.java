package kr.co.dozn.org_api_server.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiRepInfo {

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
    private String providerId;
    private String merchantId;
    private String transStatus;
    private String responseTxnCode;
    private String processedRecord;
    private String oldClientMessageId;
    private String orgRequestDate;
    private String creditTransDesc;
    private String walletToken;
    private String cardTransRef;
    private String cardID;
    private String cardID2;
    private String errorObject;
    private String detail;
    private String accessToken;
    private String tokenType;
    private String tokenExpiresIn;
    private String scope;
    private String issuedAt;
    private String merchantName;
    private String debitBankId;
    private String transDesc;
    private String channelId;
    private String walletId;
    private String customerId;
    private String creditType;
    private String creditResourceNumber;
    private String walletTokenList;
    private String balance;
    private String userAuthenticationUrl;
    private String debitPhoneNumber2;
    private String debitPersonalId2;
    private String debitName2;
    private String debitBirthDay;
    private String debitIdentityIssueDate;
    private String debitIdentityIssuedPlace;
    private String debitCountry;
    private String eKycYn;
    private Integer status;

    @SuppressWarnings("static-access")
    public String toString(){
        return new ToStringBuilder(this).reflectionToString (this, ToStringStyle.JSON_STYLE);
    }
}
