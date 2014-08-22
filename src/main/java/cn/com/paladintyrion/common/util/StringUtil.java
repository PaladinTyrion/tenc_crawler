package cn.com.paladintyrion.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

	private static Random random = new Random();
	private static Pattern mp = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9])|(14[5,7]))\\d{8}$");
	private static NumberFormat nf=NumberFormat.getNumberInstance();
	public static boolean isEmpty(String str){
		return str==null||"".equals(str);
	}
	
	public static String getUUID(){
		return UUID.randomUUID().toString();
	}
	
	public static boolean isMobile(String mobile){
		Matcher matcher=mp.matcher(mobile);
		return matcher.matches();
	}
	
	public static String getRandomPassword(){
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<4;i++){
			sb.append(random.nextInt(10));
		}
		return sb.toString();
	}
        
        /**
         * 转换字符串，防止SQL注入
         * @return SQL查询所用字符串，以在两头添加“'”符号
         */
    public static String sqlEscapeString(String rawStr){
         return "'" + rawStr.replaceAll("\\\\", "\\\\").replaceAll("'", "\\'") + "'";
    }
        
    public static String inputStream2String(InputStream is,String charset) throws IOException {
    	BufferedReader in = new BufferedReader(new InputStreamReader(is,charset));
    	return buffer2String(in);
    }
    
    public static String buffer2String(BufferedReader buf) throws IOException {
    	StringBuffer buffer = new StringBuffer();
    	String line = "";
   		while ((line = buf.readLine()) != null) {
   			buffer.append(line);
   		}
    	return buffer.toString();
    }
    
    public static String compareStrings(String str1,String str2){
    	return str1.compareTo(str2)>0?(str1+str2):(str2+str1);
    }
    
    public static Long parseLong(String str){
    	try {
			return nf.parse(str).longValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
    
    public static void main(String[] args){
    	System.out.println(parseLong("123,456,789"));
    }
}
