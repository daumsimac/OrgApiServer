package kr.co.dozn.org_api_server.service;

import kr.co.dozn.org_api_server.model.ApiRepInfo;
import kr.co.dozn.org_api_server.model.ApiReqInfo;

public interface OrgApiService {

    /**
     * 예금주조회 - 베트남
     * @param info
     * @return
     * @throws Exception
     */
    public ApiRepInfo execInquireBeneficiary(ApiReqInfo info) throws Exception;


}
