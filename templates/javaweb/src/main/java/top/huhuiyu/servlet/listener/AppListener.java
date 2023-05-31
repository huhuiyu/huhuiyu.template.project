package top.huhuiyu.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener("AppListener")
public class AppListener implements ServletContextListener {

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    System.out.println("应用程序销毁...");
  }

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.println("应用程序启动...");
  }

}
