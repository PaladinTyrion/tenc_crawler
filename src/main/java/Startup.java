import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.paladintyrion.client.bean.TaskJsonBean;
import cn.com.paladintyrion.client.bean.VideoCollect;
import cn.com.paladintyrion.client.cache.TaskMsgQueue;
import cn.com.paladintyrion.client.dao.CommentDao;
import cn.com.paladintyrion.client.dao.VideoCollectDao;
import cn.com.paladintyrion.common.spring.BeanFactory;


public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanFactory.ctx=ctx;
		
//		String zongyi = "http://v.qq.com/variety/column/column_769.html";
////		String dianying = "http://v.qq.com/detail/b/b6mser4rir2b61k.html";
////		String dianshiju = "http://v.qq.com/detail/e/ep27dvwjoblfipp.html";
//		
//		
//		TaskJsonBean taskJsonBean = new TaskJsonBean();
//		
//		taskJsonBean.setUrl(zongyi);
//		
//		TaskMsgQueue.addTask(taskJsonBean);
	}

}
