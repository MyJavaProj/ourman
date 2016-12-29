package util;
import java.io.IOException; 
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.util.Properties;

public class ConnectionUtils {
	private static String url;
	private static String driver; 
	private static String username; 
	private static String password;
	static {
		Properties props = new Properties(); 
		try {
			// 从属性文件中读取数据库配置信息 
			props.load(ConnectionUtils.class.getClassLoader().getResourceAsStream("database.properties")); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		if (props != null) {
			url = props.getProperty("url");
			driver = props.getProperty("driver"); 
			username = props.getProperty("username"); 
			password = props.getProperty("password");
			
			// 装载并注册数据库驱劢 
			try {
				System.out.println("======driver:"+driver+"=======url:"+url +"===username:"+username+"===password:"+password);
				Class.forName(driver);
//				Class.forName("com.mysql.jdbc.Driver");
			} 
			catch (ClassNotFoundException e) {
					e.printStackTrace(); 
			}
		}
	}
	
		public static Connection openConnection() throws SQLException { 
			System.out.println("=============url:"+url +"===username:"+username+"===password:"+password);
			
			return DriverManager.getConnection(url, username, password);
		}
//		public static void closeConnection(Connection con) { 
//			try {
//				if (con != null) { con.close();}
//			} 
//			catch (SQLException e) {
//				e.printStackTrace(); 
//				}
//		}
//		public static void closeStatement(Statement stmt) { 
//			try {
//				if (stmt != null) { stmt.close();}
//			} 
//			catch (SQLException e) {
//				e.printStackTrace(); 
//			}
//		}
//		public static void closeResultSet(ResultSet rs) { 
//			try {
//				if (rs != null) { rs.close();}
//			} 
//			catch (SQLException e) {
//				e.printStackTrace(); 
//			}
//		}
		
	public static void main(String[] args) throws Exception {
		Connection con = openConnection(); 
		System.out.println(con);
		
//		Statement stmt=con.createStatement();  
//        //4.执行SQL语句  
//        //Statement有三种执行SQL语句的方法  
//        ResultSet rs=stmt.executeQuery("select * "+"from t_project ");  
//        while(rs.next())  
//        {  
//            System.out.println(rs.getString(1));  
//        }  
	}
}
