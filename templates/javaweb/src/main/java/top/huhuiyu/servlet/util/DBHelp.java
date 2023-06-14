package top.huhuiyu.servlet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelp {

  static {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(
            "jdbc:mysql://mysql.huhuiyu.top:3306/db_test?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8&useSSL=false&allowPublicKeyRetrieval=true"
    ,"test","User4-test");
  }
}
