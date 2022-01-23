package dao;
import java.sql.*;

public class UserDao {
	
	public static User get(int id) {
		User user = null;
		
		Connection conn = DB.connect();
		  
		  try {
			 //String sql = "INSERT into users(login, password, first_name, last_name,image_url,role) VALUES('rrr','bbb','ddpfj','ddkjd','dlkddk','djkldjd')";
			 //stmt.executeQuery("INSERT into users(login, password, first_name, last_name,image_url,role) VALUES('rrr','bbb','ddpfj','ddkjd','dlkddk','djkldjd')");
			  PreparedStatement st = conn.prepareStatement("SELECT * FROM users WHERE id=?");
			  st.setInt(1, id);
		  
			  st.executeUpdate();
			  conn.close();
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return user;
	}
	
	public static void verifyLogin(String login, String password) {
		Connection conn = DB.connect();
		  
		  try {
			 //String sql = "INSERT into users(login, password, first_name, last_name,image_url,role) VALUES('rrr','bbb','ddpfj','ddkjd','dlkddk','djkldjd')";
			 //stmt.executeQuery("INSERT into users(login, password, first_name, last_name,image_url,role) VALUES('rrr','bbb','ddpfj','ddkjd','dlkddk','djkldjd')");
			  PreparedStatement st = conn.prepareStatement("SELECT * from users WHERE login=? and password=?");
			  st.setString(1, login);
			  st.setString(2, password);
		
			  st.executeUpdate();
			  conn.close();
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void add(String login, String password, String first_name, String last_name, String image_url, String role) {
	  Connection conn = DB.connect();
	  
	  try {
		 //String sql = "INSERT into users(login, password, first_name, last_name,image_url,role) VALUES('rrr','bbb','ddpfj','ddkjd','dlkddk','djkldjd')";
		 //stmt.executeQuery("INSERT into users(login, password, first_name, last_name,image_url,role) VALUES('rrr','bbb','ddpfj','ddkjd','dlkddk','djkldjd')");
		  PreparedStatement st = conn.prepareStatement("INSERT into users(login, password, first_name, last_name,image_url,role) VALUES(?,?,?,?,?,?)");
		  st.setString(1, login);
		  st.setString(2, password);
		  st.setString(3, first_name);
		  st.setString(4, last_name);
		  st.setString(5, image_url);
		  st.setString(6, role);
	  
		  st.executeUpdate();
		  conn.close();
	  } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	public static void update(int id, String login, String password, String first_name, String last_name, String image_url, String role) {
		Connection conn = DB.connect();
		  
		  try {

			  PreparedStatement st = conn.prepareStatement("UPDAE users SET login=?, password=?, first_name=?, last_name=?,image_url=?,role=? WHERE id=? ");
			  st.setString(1, login);
			  st.setString(2, password);
			  st.setString(3, first_name);
			  st.setString(4, last_name);
			  st.setString(5, image_url);
			  st.setString(6, role);
			  st.setInt(7, id);
		  
			  st.executeUpdate();
			  conn.close();
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public static void delete(int id) {
		Connection conn = DB.connect();
		  
		  try {

			  PreparedStatement st = conn.prepareStatement("DELETE FROM users WHERE id=? ");
			  st.setInt(1, id);
		  
			  st.executeUpdate();
			  conn.close();
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

	}
	
	
	
}
