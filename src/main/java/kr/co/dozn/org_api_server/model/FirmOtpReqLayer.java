package kr.co.dozn.org_api_server.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
public class FirmOtpReqLayer {

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

    @SuppressWarnings("static-access")
    public String toString(){

        return new ToStringBuilder(this).reflectionToString (this, ToStringStyle.JSON_STYLE);
    }
}
