package kr.co.dozn.org_api_server.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Getter
@Setter
public class FirmInqBeneReqLayer {

    private String clientMessageId;
    private String transactionId;
    private String orgCode;
    private String providerId;
    private String merchantId;
    private String serviceId;
    private String sendDT;
    private String channelId;
    private String walletId;
    private String debitBankId;
    private Integer processedRecord;
    private String debitResourceNumber;
    private String creditBankId;
    private String creditType;
    private String creditResourceNumber;
    private String remittanceType;

    public FirmInqBeneReqLayer() {
        init();
    }

    private void init(){
        this.setClientMessageId("");
        this.setTransactionId("");
        this.setOrgCode("");
        this.setProviderId("");
        this.setMerchantId("");
        this.setServiceId("");
        this.setSendDT("");
        this.setChannelId("");
        this.setWalletId("");
        this.setDebitBankId("");
        this.setProcessedRecord(1);
        this.setDebitResourceNumber("");
        this.setCreditBankId("");
        this.setCreditType("");
        this.setCreditResourceNumber("");
        this.setRemittanceType("");
    }

    @SuppressWarnings("static-access")
    public String toString(){
        return new ToStringBuilder(this).reflectionToString (this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
