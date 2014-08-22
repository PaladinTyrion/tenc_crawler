package cn.com.paladintyrion.client.controller.parse;

public abstract class MatchType {
	private final static String[] source = {"PC", "iPhone", "Android", "iPad"};
	private final static String[] matchtime = {"分钟", "小时", "天", "月", "年"};
	
	public static int getPublishClientType(String text){
		int publishclient = 0;
        for(int j = 0; j < 4; j++){
        	int k = text.indexOf(source[j]);
        	if(k != -1){
        		publishclient = j;
        		break;
        	}	
        }
		return publishclient;
	}
	
	public static int getPublishTimeType(String text){
		int publishtime = 0;
        for(int j = 0; j < 5; j++){
        	int k = text.indexOf(matchtime[j]);
        	if(k != -1){
        		publishtime = j;
        		break;
        	}	
        }
		return publishtime;
	}
}
