package assignment25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

//public class JdbcUtil {
//	
//	public static void main(String[] args) {
//		JDBC jdbc = new JDBC();
//		
//		String sql = "select * from animal";
//		ArrayList<HashMap<String,String>> list = jdbc.query(sql);
//		jdbc.close();
//		System.out.println(list.get(0).get("name"));
//		
//		
//	}
//	
//
//}


public class JDBC{
	public String url = "jdbc:mysql://localhost:3306/ty5";
	public String user = "root";
	public String password = "123456";
	public Connection conn;
	public Statement state;
	public ResultSet re ;
    JDBC() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		    state = conn.createStatement();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	void insert(String sql) {
		
		try {
			state.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	void delete(String sql) {
		try {
			state.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	void update(String sql) {
		try {
			state.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void batch(String[] sqls) {
		
			try {
				for(int i = 0; i < sqls.length; i++) {
					state.addBatch(sqls[i]);	
				}
				state.executeBatch();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
	
	void executeTransision(String[] sqls) {
		
		
		try {
			conn.setAutoCommit(false);
			for(int i = 0; i<sqls.length ; i++) {
				state.executeUpdate(sqls[i]);
				
			}
			conn.commit();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			try {			
				conn.rollback();
				conn.commit();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		
		
	}
	
	
	ArrayList<HashMap<String,String>> queryByPage( String sql ,String[] param, int page , int pageSize ){
		
		int start = pageSize*(page-1);
		sql = sql +" limit "+start+","+pageSize+"  ";
		
		return query(sql);
		
	}
	
	ArrayList<HashMap<String,String>>  query(String sql) {
		
		try {
		    re = state.executeQuery(sql);
		    ResultSetMetaData mt = re.getMetaData();
		    int count = mt.getColumnCount();
		    
		   
			ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
			
			
			while(re.next()) {					
				HashMap<String,String> map = new HashMap<String,String>();
				for(int i = 1 ; i <= count ;i++) {
					String name = mt.getColumnName(i);
					map.put(name, re.getString(name));
				}
				list.add(map);
			}

			
			
			
//			while(re.next()) {
//				HashMap<String,String> map = new HashMap<String,String>();
//				map.put("code", re.getString(1));
//				map.put("name", re.getString(2));
//				map.put("college", re.getString(3));
//				list.add(map);
//			}
			return  list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	void close() {
		try {
			if(re!=null) {
				re.close();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			state.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
