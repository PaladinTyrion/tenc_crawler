package cn.com.paladintyrion.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FileUtil {

	public static int parseFileLine(String file) throws Exception{
		int lineCount = 0;
		if (file.endsWith(".txt")) {// txt
			FileReader in = new FileReader(file);
			LineNumberReader reader = new LineNumberReader(in);
			String s = reader.readLine();
			while (s != null&&!"".equals(s)) {
				lineCount++;
				s = reader.readLine();
			}
			reader.close();
			in.close();
		}

		return lineCount;
	}
	
	public static List<String> parseFile(String file){
		List<String> mobiles=new ArrayList<String>();
		BufferedReader buf=null;
		FileInputStream input=null;
		try {
			if(file.endsWith(".txt")){
				buf=new BufferedReader(new UnicodeReader(new FileInputStream(file),Charset.defaultCharset().name()));
				String mobile=null;
				while((mobile=buf.readLine())!=null&&!"".equals(mobile)){
					mobiles.add(mobile);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (buf != null) {
					buf.close();
				}
				if (input != null) {
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return mobiles;
	}
	
	public static List<String> parseMobileFile(String file){
		List<String> mobiles=new ArrayList<String>();
		List<String> tmp=parseFile(file);
		for (String string : tmp) {
			if(string.length()<13)
				mobiles.add(string);
		}
		tmp.clear();
		tmp=null;
		return mobiles;
	}
	
	public static List<String> parseBlackWordFile(String file){
		return parseFile(file);
	}
	
	public static List<String> parseCorpNoFile(String file){
		List<String> corpNos=new ArrayList<String>();
		List<String> tmp=parseFile(file);
		for (String string : tmp) {
			if(string.length()<7)
				corpNos.add(string);
		}
		tmp.clear();
		tmp=null;
		return corpNos;
	}
	
	public static List<String> listResource(String dir){
		List<String> list=new ArrayList<String>();
		File directory=new File(dir);
		if(directory.exists()){
			File[] files=directory.listFiles();
			long st=DateUtil.getTodayStartTime();
			for (File file : files) {
				long mt=file.lastModified();
				if(mt<st)//今天以前的文件
					list.add(file.getAbsolutePath());
			}
		}
		return list;
	}
	
	public static void deleteFile(String file){
		File f=new File(file);
		if(f.exists())
			f.delete();
	}
	
	public static String createTempFile(String dir,List<String> list,String charsetName){
		String fileName=UUID.randomUUID().toString()+".txt";
		try {
			OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(dir+fileName), charsetName);
			for (String string : list) {
				osw.write(string);
				osw.write("\r\n");
			}
			osw.flush();
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileName;
	}
}
