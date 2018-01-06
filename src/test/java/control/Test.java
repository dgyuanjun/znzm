package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yuanjun.bean.Person;



public class Test {
	public static final String url = "jdbc:mysql://127.0.0.1/websocket";  
	public static final String name = "com.mysql.jdbc.Driver";  
	public static final String user = "root";  
	public static final String password = "123456";  
	public static void main(String[] args)  {
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			Class.forName(name);
			
			conn = DriverManager.getConnection(url,user,password);
			
			String sql = "select * from  person";
			
			st = conn.prepareStatement(sql);
			ResultSet set = st.executeQuery();
			
			while(set.next()){
				//Person person = new Person();
				int id = set.getInt("id");
				String name = set.getString("name");
				String password = set.getString("password");
				System.out.println(id+name+password);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}	
