package cn.com.paladintyrion.client.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParseThreadPool {
	public static ExecutorService parseVideoInfoThreadPool = Executors.newFixedThreadPool(20);
	public static ExecutorService parseVideoPropertyThreadPool = Executors.newFixedThreadPool(20);
	public static ExecutorService parseUrlBeanListThreadPool = Executors.newFixedThreadPool(20);
	public static ExecutorService parseVideoCommentThreadPool = Executors.newFixedThreadPool(20);
	
	public static ExecutorService parseInjectionShowUrlThreadPool = Executors.newFixedThreadPool(25);
	public static ExecutorService parseInjectionTVUrlThreadPool = Executors.newFixedThreadPool(25);
	public static ExecutorService parseInjectionMovieUrlThreadPool = Executors.newFixedThreadPool(25);
	
	public static ExecutorService crawlerPool = Executors.newFixedThreadPool(20);
}
