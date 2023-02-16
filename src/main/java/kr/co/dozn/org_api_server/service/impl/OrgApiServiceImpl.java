package kr.co.dozn.org_api_server.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.co.dozn.org_api_server.model.FirmInqBeneRepLayer;
import kr.co.dozn.org_api_server.model.FirmInqBeneReqLayer;
import kr.co.dozn.org_api_server.service.OrgApiService;
import kr.co.dozn.org_api_server.util.net.OrgApiTcpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
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
    private FirmInqBeneRepLayer rep;

    @Override
    public FirmInqBeneRepLayer execInquireBeneficiary(FirmInqBeneReqLayer req) throws Exception {

        try {
            ObjectMapper mapper = new ObjectMapper();
            String msg = null;
            String inqBeneString = req.toString();
            System.out.println("inqBeneString : " + inqBeneString);
//            jsonString = String.valueOf(req);
//            msg = orgApiTcpUtil.tcpTransfer(ip, port, timeout, charset, jsonString);
            msg = orgApiTcpUtil.tcpTransfer(ip, port, timeout, charset, inqBeneString);
            rep = mapper.readValue(msg, FirmInqBeneRepLayer.class);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        return rep;
    }
}
