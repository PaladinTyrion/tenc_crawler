package cn.com.paladintyrion.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DateUtil {

	private final static SimpleDateFormat formatyyyymmddhhmmss=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private final static SimpleDateFormat formatyyyymmddhhmmsssss=new SimpleDateFormat("yyyyMMddHHmmssSSS");
	private final static SimpleDateFormat formatyyyymmddhhmmssssssplit=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	private final static SimpleDateFormat formatyyyymmdd=new SimpleDateFormat("yyyy-MM-dd");
	private final static SimpleDateFormat formatyyyymm=new SimpleDateFormat("yyyyMM");
	private final static SimpleDateFormat formathhmm=new SimpleDateFormat("HH:mm");
	private final static SimpleDateFormat formatyyyymmddhhmmsschinese=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
	private final static SimpleDateFormat formatyyyymmddchinese=new SimpleDateFormat("yyyy年MM月dd日");
	private final static SimpleDateFormat formathhmmsssss=new SimpleDateFormat("HHmmssSSS");
	private final static SimpleDateFormat formatHHmm=new SimpleDateFormat("HHmm");
	private static Lock dateLock=new ReentrantLock();
	public static String getCurrentDateTime(){
		return formatyyyymmddhhmmss.format(new Date());
	}
	
	public static String date2string(){
		return formatyyyymmddhhmmsssss.format(new Date());
	}
	
	public static String date2string(Date date){
		return formatyyyymmddhhmmss.format(date);
	}
	
	public static String date2shortstr(Date date){
		return formatyyyymmdd.format(date);
	}
	
	public static String getBeforeSecondsDateTime(int ss){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.SECOND, -ss);
		return formatyyyymmddhhmmss.format(cal.getTime());
	}
	
	public static String getCurrentDate(){
		return formatyyyymmdd.format(new Date());
	}
	
	public static java.util.Date string2Date(String dateStr){
		java.util.Date tempDate=null;
		try {
			tempDate=formatyyyymmdd.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tempDate;
	}
	
	public static int parseDate2Int(String date){
		int result=0;
		try {
			dateLock.lock();
			result=(int) (formatyyyymmddhhmmss.parse(date).getTime()/1000);
		} catch (ParseException e) {
			e.printStackTrace();
		} finally{
			dateLock.unlock();
		}
		return result;
	}
	
	public static String parseInt2Date(int i){
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis((long)i*1000);
		String date="";
		synchronized (formatyyyymmddhhmmss) {
			date=formatyyyymmddhhmmss.format(cal.getTime());
		}
		return date;
	}
	
	public synchronized static int parseFullDate(String str){
		int result=0;
		try {
			result=(int)(formatyyyymmddhhmmsssss.parse(str).getTime()/1000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public synchronized static int parseFullSplitDate(String str){
		int result=0;
		try {
			result=(int)(formatyyyymmddhhmmssssssplit.parse(str).getTime()/1000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static String getCurrentTime(){
		String t="0";
		synchronized (formathhmmsssss) {
			t=formathhmmsssss.format(new Date());
		}
		return t;
	}
	
	public static int getBlockStartTime(int i,int blockSize,int before){
		int start=24/blockSize*i;
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE,-before);
		cal.set(Calendar.HOUR_OF_DAY, start);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		return (int) (cal.getTimeInMillis()/1000);
	}
	
	public static int getBlockEndTime(int i,int blockSize,int before){
		int end=24/blockSize*(i+1);
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE,-before);
		cal.set(Calendar.HOUR_OF_DAY, end);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		return (int) (cal.getTimeInMillis()/1000);
	}
	
	public static long getTodayStartTime(){
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}
	
	public static String getCurrentMonth(){
		Calendar cal=Calendar.getInstance();
		return formatyyyymm.format(cal.getTime());
	}
	public static String getMonthBeforeDays(int before){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, -before);
		return formatyyyymm.format(cal.getTime());
	}
	
	public static String getBeforeDay(int before){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, -before);
		return formatyyyymmdd.format(cal.getTime());
	}
	
	public static String getBeforeDayDateTime(int before){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, -before);
		return formatyyyymmddhhmmss.format(cal.getTime());
	}
	
	public static String getCurrentHHmm(){
		Calendar cal=Calendar.getInstance();
		return formathhmm.format(cal.getTime());
	}
	
	public static String getCurrentTimeChinese(){
		Calendar cal=Calendar.getInstance();
		return formatyyyymmddhhmmsschinese.format(cal.getTime());
	}
	
	public static String getBeforeDateChinese(int before){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, -before);
		return formatyyyymmddchinese.format(cal.getTime());
	}
	
	public static String getBeforeDaysMonthEndTime(int before){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, -before);
		int d=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DATE, d);
		cal.set(Calendar.HOUR_OF_DAY,23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		return formatyyyymmddhhmmss.format(cal.getTime());
	}
	
	public static String getCurrentMonthBeginTime(){
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY,0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		return formatyyyymmddhhmmss.format(cal.getTime());
	}
	
	public static String getCurrentMonthEndTime(){
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		cal.set(Calendar.HOUR_OF_DAY,23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		return formatyyyymmddhhmmss.format(cal.getTime());
	}
	
	public static int getMinutesOfDay(){
		int s=0;
		Calendar cal=Calendar.getInstance();
		s=Integer.parseInt(formatHHmm.format(cal.getTime()));
		return s;
	}
	
	/**
	 * 将日期时间加偏移
	 * @Zhoubin
	 * @param 偏移单位current，偏移量offset
	 * @return startDate
	 */
	public static Date offsetAddOrSub(int current,int offset) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(current, offset);
        Date date = calendar.getTime();
        return date;
    }
	
	/**
	 * 将时间戳转换成日期字符串
	 * @hujb
	 * @param timestamp
	 * @return
	 */
	public static String getDateFromTimeStamp(long timestamp){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = sdf.format(new Date(timestamp*1000L));
		return dateStr;
	}
	
	public static void main(String[] args){
		System.out.println(getCurrentMonthBeginTime());
		System.out.println(getBeforeDaysMonthEndTime(2));
		System.out.println(parseFullDate("20090808122532111"));
		System.out.println(getMinutesOfDay());
		System.out.println(string2Date("2013-10-24"));
	}
	
}
