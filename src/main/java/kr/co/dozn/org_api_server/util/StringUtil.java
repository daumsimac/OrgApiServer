package kr.co.dozn.org_api_server.util;

import java.io.UnsupportedEncodingException;

public class StringUtil {
	public static final int	FILL_LEFT	= 0;
    public static final int	FILL_RIGHT	= 1;
    
	/**
     * 주어진 문자열을 byte[] 로 변환합니다.
     * @param src 대상 문자열
     * @param charSet 변환시 사용할 케릭터 셋
     * @param size byte[]의 크기... 문자열이 좀더 크면 IllegalArgumentException발생합니다.
     * @param fill 필러
     * @param fillAllow 필링할 방향
     * @return
     * @throws IllegalArgumentException
     * @throws UnsupportedEncodingException
     */
    public static byte[] getBytes(String src, String charSet
    	, int size, byte fill, int fillAllow)
    	throws IllegalArgumentException, UnsupportedEncodingException {
    	byte[]	rv;
    	
    	if(src == null) {
    		src = "";
    	}
		byte[]	work;
    	rv	= src.getBytes(charSet);
    	if (rv.length > size) {
    		//throw new IllegalArgumentException("주어진 크기를 넘는 문자열이 전달 되었습니다.");
			work	= new byte[size];
			System.arraycopy(rv, 0, work, 0, size);
			rv	= work;
    	} else if (rv.length < size) {
        	work	= new byte[size];
        	if (fillAllow == FILL_LEFT) {
        		System.arraycopy(rv, 0, work, size - rv.length, rv.length);
        		for (int i=size - rv.length - 1; i>=0; i--) {
        			work[i]	= fill;
        		}
        	} else {
        		System.arraycopy(rv, 0, work, 0, rv.length);
        		for (int i=rv.length; i<size; i++) {
        			work[i]	= fill;
        		}
        	}
        	rv	= work;
    	}
    	
    	return rv;
    }
    
    public static boolean isNull(String str) {
    	if(str == null || "".equals(str.trim())) {
    		return true;
    	}    	
    	return false;
    }
  
    public static String chkNull(String str) {
    	if(str == null) {
    		return "";    	
    	}else {
    		return str;
    	}
    }
    
    public static Integer chkIntegerNull(Integer integer) {
    	if(integer == null) {
    		return 0;    	
    	}else {
    		return integer;
    	}
    }
    
    public static Long chkLongNull(Long longer) {
    	if(longer == null) {
    		return 0L;    	
    	}else {
    		return longer;
    	}
    }
    
    public static String nToB(String src) {
    	return src == null ? "" : src;
    }
    
  	public static String getStringSize(String str, String fill, int size, int fillAllow){ 
  		int len = StringUtil.chkNull(str).getBytes().length; 
  		
  		if(len == 0)return "";
  		
  		if(len < size){ 
  			if(fillAllow == FILL_LEFT){
  				for(int i =0; i< size - len; i++){
  					str	= fill + str;
  				}
  			}else if(fillAllow == FILL_RIGHT){
  				for(int i =0; i< size - len; i++){
  					str	+= fill;
  				}
  			}
  		}else if(len > size){
  			str	=	str.substring(0,len);
  		}  	
  		return str;
  	}
  	
}
