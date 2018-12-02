package quizDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dbUtil.DatabaseCon;

public class answerStoration {
	static Connection con = DatabaseCon.connect();
	static int y;
	static int x;
	static ArrayList<String> choiceTextView = new ArrayList<String>();
	static ArrayList<Integer> choiceSetRdb = new ArrayList<Integer>();
	
	public answerStoration(){
		con = DatabaseCon.connect();
	}
	
	public static void storeA( int id, String table, String choices1, String choices2, String choices3, String choices4, int rdb) {
		
		String sql1 = "Insert or replace into " + table + "(id, choices1, choices2, choices3, choices4, rdb_A) values (?, ?, ?, ?, ?, ?)";
		PreparedStatement st1;
		
		try {
			st1 = con.prepareStatement(sql1);
			st1.setInt(1, id);
			st1.setString(2, choices1);
			st1.setString(3, choices2);
			st1.setString(4, choices3);
			st1.setString(5, choices4);
			st1.setInt(6, rdb);
			
			st1.executeUpdate();
			
			System.out.println("EXECUTED");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
	
	
	public static void storeRDB( int id, String table, int rdb_A) {
		
		String sql = "Insert or replace into " + table + "(id,rdb_A) values (?,?)";
		PreparedStatement st;
		
		try {
			st = con.prepareStatement(sql);
			st.setInt(1, id);
			st.setInt(2, rdb_A);
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static ArrayList<String> retrieveDataChoices(int i, String t){
		String sql = "Select choices1, choices2, choices3, choices4 from " + t +" where id = " + Integer.toString(i);
		try (Statement state = con.createStatement();
				ResultSet res = state.executeQuery(sql);				
				){
			
			while(res.next()) {
				choiceTextView.add(res.getString(1));
				choiceTextView.add(res.getString(2));
				choiceTextView.add(res.getString(3));
				choiceTextView.add(res.getString(4));
				
			}
			
			return choiceTextView;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return choiceTextView;
		
	}
	
	public static int retrieveDataRDBSet(int i, String t){
		String sql = "SELECT rdb_A from " + t + " WHERE id = " + Integer.toString(i);
		try (Connection conn = DatabaseCon.connect();
				Statement state = conn.createStatement();
				ResultSet res = state.executeQuery(sql);				
				){
			
			while(res.next()) {
				x = res.getInt(1);
				System.out.print(x);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return x;
	}
	
	public static int FirstRdb(String t){
		String sql = "Select rdb_A from "+ t +" Where id = 1";
		try (Connection conn = DatabaseCon.connect();
				Statement state = conn.createStatement();
				ResultSet res = state.executeQuery(sql);				
				){
			
			while(res.next()) {
				y = res.getInt(1);
			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return y;
	}
	
}


