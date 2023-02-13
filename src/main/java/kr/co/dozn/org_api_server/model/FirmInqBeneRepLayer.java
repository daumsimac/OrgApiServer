package kr.co.dozn.org_api_server.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Getter
@Setter
public class FirmInqBeneRepLayer {

    private String clientMessageId;
    private String transactionId;
    private String orgCode;
    private String providerId;
    private String merchantId;
    private String serviceId;
    private String businessErrorCode;
    private String businessErrorDesc;
    private Integer processedRecord;
    private String creditBankId;
    private String creditName;

    public FirmInqBeneRepLayer() {
        init();
    }

    private void init(){
        this.setClientMessageId("");
        this.setTransactionId("");
        this.setOrgCode("");
        this.setProviderId("");
        this.setMerchantId("");
        this.setServiceId("");
        this.setBusinessErrorCode("");
        this.setBusinessErrorDesc("");
        this.setProcessedRecord(1);
        this.setCreditBankId("");
        this.setCreditName("");
    }

    @SuppressWarnings("static-access")
    public String toString(){
        return new ToStringBuilder(this).reflectionToString (this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
