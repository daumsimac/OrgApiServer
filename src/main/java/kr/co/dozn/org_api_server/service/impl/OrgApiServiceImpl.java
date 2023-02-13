package kr.co.dozn.org_api_server.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.co.dozn.org_api_server.model.ApiRepInfo;
import kr.co.dozn.org_api_server.model.ApiReqInfo;
import kr.co.dozn.org_api_server.service.OrgApiService;
import kr.co.dozn.org_api_server.util.net.OrgApiTcpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class OrgApiServiceImpl implements OrgApiService {

    @Value("${van.ip}")
    private String ip;

    @Value("${van.port}")
    private Integer port;

    @Value("${van.timeout}")
    private Integer timeout;

    @Value("${van.charset}")
    private String charset;

    @Autowired
    private OrgApiTcpUtil orgApiTcpUtil;

    private String jsonString;
    private ApiRepInfo apiRepInfo;

    @Override
    public ApiRepInfo execInquireBeneficiary(ApiReqInfo info) throws Exception {

        try {
            ObjectMapper mapper = new ObjectMapper();
            String msg = null;
            jsonString = String.valueOf(info);
            msg = orgApiTcpUtil.tcpTransfer(ip, port, timeout, charset, jsonString);
            apiRepInfo = mapper.readValue(msg, ApiRepInfo.class);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        return apiRepInfo;
    }
}
