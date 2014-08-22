package cn.com.paladintyrion.common.spring;

import org.springframework.context.ApplicationContext;


public class BeanFactory {

	public static ApplicationContext ctx=null;
	
	public static <T> T getBean(String name,Class<T> clazz){
		return ctx.getBean(name, clazz);
	}
}
