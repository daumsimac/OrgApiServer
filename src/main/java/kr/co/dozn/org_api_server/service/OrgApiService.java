package kr.co.dozn.org_api_server.service;

import kr.co.dozn.org_api_server.model.FirmInqBeneRepLayer;
import kr.co.dozn.org_api_server.model.FirmInqBeneReqLayer;

public interface OrgApiService {

    /**
     * 예금주조회 - 베트남
     *
     * @param req
     * @return
     * @throws Exception
     */
    public FirmInqBeneRepLayer execInquireBeneficiary(FirmInqBeneReqLayer req) throws Exception;


}
