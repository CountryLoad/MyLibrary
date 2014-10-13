package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcon {

	public static Connection getConnection() {

		Connection con = null;
	    String Username= "z0n0nk0mz3";
	    String Password= "5222hz5y510mk2w5i52jh3llxkikwlhyzxi5ll5k";
	    String Driver="com.mysql.jdbc.Driver";
		try {
			Class.forName(Driver);		//加载数据库驱动
			// System.out.println("数据库驱动加载成功！");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		try {
			//加载数据库
			con = DriverManager.getConnection(
					"jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_zzllibrary", Username, Password);
			// System.out.println("数据库连接成功！");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return con;
		
	}
}
