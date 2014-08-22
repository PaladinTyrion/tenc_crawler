package cn.com.paladintyrion.client.socket;

import javax.annotation.PostConstruct;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

import cn.com.paladintyrion.client.bean.TaskJsonBean;
import cn.com.paladintyrion.client.cache.TaskMsgQueue;
import cn.com.paladintyrion.common.util.DateUtil;
import cn.com.screendata.monitor.client.ClientInterface;
import cn.com.screendata.monitor.client.MonitorClient;
import cn.com.screendata.monitor.protocol.msg.Task;

@Slf4j
public class CrawlerClient implements ClientInterface {

	@Setter
	private String dataDir;
	@Setter
	private String clientId;
	@Setter
	private MonitorClient monitorClient;
	@Override
	public boolean onReceiveTask(Task arg0) {
		log.info("接收到任务，并创建对应目录");
		log.info("创建的目录名称为："+dataDir+clientId+"-"+DateUtil.date2string());
		
		String json = arg0.getJson();
		TaskJsonBean taskJsonBean = JSON.parseObject(json, TaskJsonBean.class);
		TaskMsgQueue.addTask(taskJsonBean);
		
		return true;
	}
	
	@PostConstruct
	public void start(){
		monitorClient.start();
	}

}
