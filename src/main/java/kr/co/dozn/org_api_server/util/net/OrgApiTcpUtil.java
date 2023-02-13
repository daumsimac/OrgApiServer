package kr.co.dozn.org_api_server.util.net;

import kr.co.dozn.org_api_server.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class OrgApiTcpUtil {

    private final Logger VANTRANSLOG = LoggerFactory.getLogger("VANTRANSLOG");
    private final Logger logger = LoggerFactory.getLogger(OrgApiTcpUtil.class);

    public String tcpTransfer(String ip, int port, int timeout,
                              String charSet, String msg) throws Exception {

        String receiveData = null;
        Socket soc = null;
        PrintWriter pw = null;
        BufferedReader br = null;

        char[] length = new char[4];
        int intMsgLength = 0;
        char[] receive = null;
        int readByte = 0;
        int readSumByte = 0;
        int retry = 3;
        int cnt = 0;

        if (charSet == null) {
            charSet = "UTF-8";
        }

        if (ip == null || port == 0) {
            throw new IllegalArgumentException("Parameter 'sendIp, sendPort' is required.");
        }

        do {
            try {
                soc = new Socket(ip, port);
            } catch (Exception t) {
                this.logger.error(t.getMessage());
            }

            cnt++;
        } while (!this.status(soc) && cnt < retry);

        try {
            soc.setSoTimeout(timeout);

            pw = new PrintWriter(new OutputStreamWriter(soc.getOutputStream(), charSet));
            br = new BufferedReader(new InputStreamReader(soc.getInputStream(), charSet));

            VANTRANSLOG.info("[SEND]" + msg);

            /* ToDo : 자릿수 확인요망 */
            pw.println(StringUtil.getStringSize(Integer.toString(msg.getBytes(charSet).length), "0", 5, StringUtil.FILL_LEFT) + msg);
            pw.flush();

            //length read
            /* ToDo : 자릿수 확인요망 */
            br.read(length, 0, 5);
            intMsgLength = Integer.parseInt(String.valueOf(length));

            if (intMsgLength != 0) {
                receive = new char[intMsgLength];

                readByte = 0;
                readSumByte = 0;
                do {
                    readByte = br.read(receive, readSumByte, intMsgLength - readSumByte);
                    readSumByte += readByte;

                } while (readSumByte < readByte);

                receiveData = new String(receive);

                VANTRANSLOG.info("[RECEIVE]" + receiveData);
            }
        } catch (Exception e) {
            logger.error("tcpTransfer TCP send error.", e);
            throw e;
        } finally {
            if (pw != null) pw.close();
            if (br != null) br.close();

            soc.close();
        }

        return receiveData;
    }

    public boolean status(Socket soc) {
        boolean status = false;

        try {
            status = soc.isConnected();
        }catch(Exception e) {
            status = false;
        }
        return status;
    }

}
