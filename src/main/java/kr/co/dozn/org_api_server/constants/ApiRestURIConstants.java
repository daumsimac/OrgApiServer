package kr.co.dozn.org_api_server.constants;

public class ApiRestURIConstants {

    /**
     * 예금주 조회
     * - 예금주조회를 통해 계좌주명을 조회
     * - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String INQUIRE_BENE_URI = "/rt/v1/inquireBeneficiary";

    /**
     * 송금
     * - 입금은행의 계좌번호로 송금 요청
     * - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String FUND_TRANSFER = "/rt/v1/fundTransfer";

    /**
     * 이체 확인
     * - 송금, 출금 발생 거래건에 대한 이체 처리여부 조회
     * - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String INVESTIGATE = "/rt/v1/investigate";

    /**
     * OTP 요청
     * - OTP 정보 확인 요청 전문
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String REQUEST_OTP = "/rt/v1/requestOTP";

    /**
     * 카드번호 아이디 변환(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String CONVERT_CARDNUMBER_ID = "/rt/v1/convertCardNumberToId";

    /**
     * 은행 목록 획득(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String GET_BANK_LIST = "/rt/v1/getBankList";

    /**
     * 토큰 획득(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String GET_TOKEN = "/rt/v1/getToken";

    /**
     * 월렛 링크(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String WALLET_LINK = "/rt/v1/walletLink";

    /**
     * 월렛 정보(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String WALLET_INFO = "/rt/v1/walletInformation";

    /**
     * 연결 취소(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String CANCEL_CONN = "/rt/v1/cancelConnection";

    /**
     * 캐쉬 출금(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String CASH_OUT = "/rt/v1/cashOut";

    /**
     * 출금 발송 요청 - 캐쉬 충전?(가칭)
     * - 고객계좌에서 출금해오는 업무
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String CASH_IN = "/rt/v1/cashIn";

    /**
     * 잔액 조회(가칭)
     * - 고객계좌에서 잔액을 조회하는 업무
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String INQUIRY_BALANCE = "/rt/v1/inquiryBalance";

    /**
     * 지불(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String PAYMENT = "/rt/v1/payment";

    /**
     * 환불(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String REFUND_ORIGINAL_TRANSACTION = "/rt/v1/refundForOriginalTransaction";

    /**
     * 한도 증가(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String UPGRADE_TRANSACTION_LIMIT = "/rt/v1/upgradeTransactionLimit";

    /**
     * 월렛 소유주 확인(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String VERIFY_WALLET_OWNER = "/rt/v1/verifyWalletOwner";

    /**
     * 월렛 아이디 확인(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String VERIFY_ID_CARD = "/rt/v1/verifyIdCard";

    /**
     * 계좌 조회(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String INQUIRY_ACCOUNT = "/rt/v1/inquiryAccount";
}
