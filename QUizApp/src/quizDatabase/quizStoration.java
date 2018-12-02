package quizDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbUtil.DatabaseCon;


public class quizStoration {
	static Connection con = DatabaseCon.connect();
	static List<String> quizzes = new ArrayList<String>();
	static List<String> answers = new ArrayList<String>();
	public quizStoration() throws ClassNotFoundException  {
		
			con = DatabaseCon.connect();
		}
		
		public static void storeQ(int id,String QuizTitle, String Question1, 
							String Question2, String Question3,
							String Question4, String Question5,
							String Question6, String Question7,
							String Question8, String Question9,
							String Question10) throws SQLException {
			PreparedStatement state;
				String sql = "INSERT OR REPLACE INTO Quiz(id,QuizTitle, Question1, Question2,"
							+ " Question3, Question4, Question5, Question6, Question7,"
							+ " Question8, Question9, Question10) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				state = con.prepareStatement(sql);
				state.setInt(1, id);
				state.setString(2, QuizTitle);
				state.setString(3, Question1);
				state.setString(4, Question2);
				state.setString(5, Question3);
				state.setString(6, Question4);
				state.setString(7, Question5);
				state.setString(8, Question6);
				state.setString(9, Question7);
				state.setString(10, Question8);
				state.setString(11, Question9);
				state.setString(12, Question10);
				state.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	    }
		
		public static ArrayList<String> retrieveDataQuizzes(){
			String sql = "SELECT QuizTitle FROM Quiz ORDER BY id";
			
			try (Connection conn = DatabaseCon.connect();
				Statement state = conn.createStatement();
				ResultSet res = state.executeQuery(sql)){
				
				while(res.next()) {				
					quizzes.add(res.getString(1));
					
				}
				return (ArrayList<String>) quizzes;
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			return (ArrayList<String>) quizzes;
			
		}
		
		public static ArrayList<String> retrieveDataQuestions(int i){
			String sql = "SELECT Question1, Question2, Question3, Question4, Question5, Question6, Question7, Question8, Question9, Question10 FROM Quiz WHERE id =" + Integer.toString(i);
			
			try (Connection conn = DatabaseCon.connect();
				Statement state = conn.createStatement();
				ResultSet res = state.executeQuery(sql)){
				
				while(res.next()) {				
					answers.add(res.getString(1));
					answers.add(res.getString(2));
					answers.add(res.getString(3));
					answers.add(res.getString(4));
					answers.add(res.getString(5));
					answers.add(res.getString(6));
					answers.add(res.getString(7));
					answers.add(res.getString(8));
					answers.add(res.getString(9));
					answers.add(res.getString(10));
					
					
				}
				return (ArrayList<String>) answers;
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			return (ArrayList<String>) answers;
			
		}


		
			
		
			
}


