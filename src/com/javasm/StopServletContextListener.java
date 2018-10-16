package com.javasm;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


import com.javasm.util.redis.core.RedisBucket;
import com.mysql.jdbc.AbandonedConnectionCleanupThread;

@WebListener
public class StopServletContextListener implements ServletContextListener {

	// 容器销毁时
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	  // 销毁连接池 
        RedisBucket.getInstance().destroy();
        System.out.println("连接池已销毁");
        
        Enumeration<Driver> ds = DriverManager.getDrivers();
        
        while(ds.hasMoreElements()) {
        	Driver driver = ds.nextElement();
        	try {
				DriverManager.deregisterDriver(driver);
			} catch (SQLException e) {
				e.printStackTrace();
			}
        }
        
        try {
			AbandonedConnectionCleanupThread.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      
        
    }

    
    
    // 容器启动时执行redis初始化
    public void contextInitialized(ServletContextEvent sce)  { 
//    	URL u = this.getClass().getClassLoader().getResource("/com/javasm/redis.json");
//    	String path = u.getPath();
//    	System.out.println(path);
//    	RedisBucket.getInstance().initialize(path);
    }
	
}
