package util;
import java.io.IOException; 
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.util.Properties;

public class test {

	static {
		try{
			System.out.println("===1==");
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("===2==");
		}
//		catch(Exception ee){
//			System.out.println("===3==");
//		}
		catch (ClassNotFoundException e) {
			e.printStackTrace(); 
		}
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		 
	        try  
	        {  
	            //2.使用DriverManager获取数据库连接，其中返回的Connection就代表了Java程序和数据库的连接  
	            //不同数据库的URL写法需要查看驱动文档，用户名、密码由DBA分配  
	            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javadb","sa","123");  
	            //3.使用Connection来创建一个Statement对象  
	            Statement stmt=conn.createStatement();  
	            //4.执行SQL语句  
	            //Statement有三种执行SQL语句的方法  
	            ResultSet rs=stmt.executeQuery("select * "+"from t_project ");  
	            while(rs.next())  
	            {  
	                System.out.println(rs.getString(1));  
	            }  
	        }  
	        catch(Exception e)  
	        {  
	            e.printStackTrace();  
	        }  
	}

}
