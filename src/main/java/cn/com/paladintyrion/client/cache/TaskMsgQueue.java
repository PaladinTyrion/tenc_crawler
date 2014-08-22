package cn.com.paladintyrion.client.cache;

import java.util.LinkedList;

import cn.com.paladintyrion.client.bean.TaskJsonBean;

public class TaskMsgQueue {

	private static LinkedList<TaskJsonBean> taskMsgQueue = new LinkedList<TaskJsonBean>();
	
	public static void addTask(TaskJsonBean task){
		taskMsgQueue.addLast(task);
	}
	
	public static void addTaskAtHead(TaskJsonBean task){
		taskMsgQueue.addFirst(task);
	}
	
	public static TaskJsonBean getTask(){
		return taskMsgQueue.poll();
	}
	
}
