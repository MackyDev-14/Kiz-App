package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import quizDatabase.answerStoration;
import quizDatabase.quizStoration;






public class EditController implements Initializable{
	
	int ID;
	String TB;
	ArrayList<Integer> radioButtonList= new ArrayList<>(Arrays.asList( 1,2,3,5,6,7,8,8,9,10));
	ArrayList<TextField> textfieldAnswer = new ArrayList<>();
	 @FXML
	    private TextField quizTitletxF;
	 @FXML
	    private TextArea quizQuestion1store, quizQuestion2store,quizQuestion3store,quizQuestion4store,
	    					quizQuestion5store,quizQuestion6store,quizQuestion7store,quizQuestion8store,quizQuestion9store,quizQuestion10store;
	@FXML
		private ToggleGroup ansq21, ansq2, ansq3, ansq4, ansq5, ansq6, ansq7, ansq8, ansq9, ansq10;

	 @FXML
	    private TextField quizAnswer1store, quizAnswer2store,quizAnswer3store,quizAnswer4store;
	 @FXML
	    private TextField quizAnswer1store2,quizAnswer2store2,quizAnswer3store2,quizAnswer4store2;
	  @FXML
	    private TextField quizAnswer1store3,quizAnswer2store3,quizAnswer3store3,quizAnswer4store3;
	  @FXML
	    private TextField quizAnswer1store4,quizAnswer2store4,quizAnswer3store4,quizAnswer4store4;
	  @FXML
	    private TextField quizAnswer1store5,quizAnswer2store5,quizAnswer3store5,quizAnswer4store5;
	  
	  @FXML
	    private TextField quizAnswer1store6,quizAnswer2store6,quizAnswer3store6,quizAnswer4store6;

	  @FXML
	    private TextField quizAnswer1store7,quizAnswer2store7,quizAnswer3store7,quizAnswer4store7;
	  @FXML
	    private TextField quizAnswer1store8,quizAnswer2store8,quizAnswer3store8,quizAnswer4store8;
	  @FXML
	    private TextField quizAnswer1store9,quizAnswer2store9,quizAnswer3store9,quizAnswer4store9;
	  @FXML
	    private TextField quizAnswer1store10,quizAnswer2store10,quizAnswer3store10,quizAnswer4store10;
	  
	public void Save(ActionEvent event) throws SQLException, IOException{
		
		quizStoration.storeQ(
				ID, quizTitletxF.getText(),
				quizQuestion1store.getText(), quizQuestion2store.getText(),quizQuestion3store.getText(),quizQuestion4store.getText(),
			    quizQuestion5store.getText(),quizQuestion6store.getText(),quizQuestion7store.getText(),quizQuestion8store.getText(),
			    quizQuestion9store.getText(),quizQuestion10store.getText());
		
		answerStoration.storeA(1, TB, quizAnswer1store.getText(), quizAnswer2store.getText(),quizAnswer3store.getText(),quizAnswer4store.getText(), radioButtonList.get(0));
		answerStoration.storeA(2, TB, quizAnswer1store2.getText(), quizAnswer2store2.getText(),quizAnswer3store2.getText(),quizAnswer4store2.getText(), radioButtonList.get(1));
		answerStoration.storeA(3, TB, quizAnswer1store3.getText(), quizAnswer2store3.getText(),quizAnswer3store3.getText(),quizAnswer4store3.getText(), radioButtonList.get(2));
		answerStoration.storeA(4, TB, quizAnswer1store4.getText(), quizAnswer2store4.getText(),quizAnswer3store4.getText(),quizAnswer4store4.getText(), radioButtonList.get(3));
		answerStoration.storeA(5, TB, quizAnswer1store5.getText(), quizAnswer2store5.getText(),quizAnswer3store5.getText(),quizAnswer4store5.getText(), radioButtonList.get(4));
		answerStoration.storeA(6, TB, quizAnswer1store6.getText(), quizAnswer2store6.getText(),quizAnswer3store6.getText(),quizAnswer4store6.getText(), radioButtonList.get(5));
		answerStoration.storeA(7, TB, quizAnswer1store7.getText(), quizAnswer2store7.getText(),quizAnswer3store7.getText(),quizAnswer4store7.getText(), radioButtonList.get(6));
		answerStoration.storeA(8, TB, quizAnswer1store8.getText(), quizAnswer2store8.getText(),quizAnswer3store8.getText(),quizAnswer4store8.getText(), radioButtonList.get(7));
		answerStoration.storeA(9, TB, quizAnswer1store9.getText(), quizAnswer2store9.getText(),quizAnswer3store9.getText(),quizAnswer4store9.getText(), radioButtonList.get(8));
		answerStoration.storeA(10, TB, quizAnswer1store10.getText(), quizAnswer2store10.getText(),quizAnswer3store10.getText(),quizAnswer4store10.getText(), radioButtonList.get(9));
			
		
		
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("quizAppUI.fxml"));
		Parent main = (Parent) loader.load();
		Scene MainScene = new Scene(main);	
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		txfLoop().clear();
		
		quizStoration.retrieveDataQuestions(ID).clear();
		quizStoration.retrieveDataQuizzes().clear();
		
		QuizAppUIController ctrl = loader.getController();
		ctrl.setLabels(quizStoration.retrieveDataQuizzes().get(0),quizStoration.retrieveDataQuizzes().get(1),quizStoration.retrieveDataQuizzes().get(2),
				quizStoration.retrieveDataQuizzes().get(3),quizStoration.retrieveDataQuizzes().get(4),quizStoration.retrieveDataQuizzes().get(5),
				quizStoration.retrieveDataQuizzes().get(6),quizStoration.retrieveDataQuizzes().get(7),quizStoration.retrieveDataQuizzes().get(8),quizStoration.retrieveDataQuizzes().get(9));
		
		System.out.println(radioButtonList);
		stage.setScene(MainScene);
		stage.show();
		
		
		
	}
	
	
	public void DBidNo(int id, String t){
		this.ID = id;
		this.TB = t;
		
		quizTitletxF.setText(quizStoration.retrieveDataQuizzes().get(ID-1));
		
		quizQuestion1store.setText(quizStoration.retrieveDataQuestions(ID).get(0));
		quizQuestion2store.setText(quizStoration.retrieveDataQuestions(ID).get(1));
		quizQuestion3store.setText(quizStoration.retrieveDataQuestions(ID).get(2));
		quizQuestion4store.setText(quizStoration.retrieveDataQuestions(ID).get(3));
		quizQuestion5store.setText(quizStoration.retrieveDataQuestions(ID).get(4));
		quizQuestion6store.setText(quizStoration.retrieveDataQuestions(ID).get(5));
		quizQuestion7store.setText(quizStoration.retrieveDataQuestions(ID).get(6));
		quizQuestion8store.setText(quizStoration.retrieveDataQuestions(ID).get(7));
		quizQuestion9store.setText(quizStoration.retrieveDataQuestions(ID).get(8));
		quizQuestion10store.setText(quizStoration.retrieveDataQuestions(ID).get(9));
		
		ansq21.getToggles().get(answerStoration.retrieveDataRDBSet(1,TB)).setSelected(true);
		ansq2.getToggles().get(answerStoration.retrieveDataRDBSet(2,TB)).setSelected(true);
		ansq3.getToggles().get(answerStoration.retrieveDataRDBSet(3,TB)).setSelected(true);
		ansq4.getToggles().get(answerStoration.retrieveDataRDBSet(4,TB)).setSelected(true);
		ansq5.getToggles().get(answerStoration.retrieveDataRDBSet(5,TB)).setSelected(true);
		ansq6.getToggles().get(answerStoration.retrieveDataRDBSet(6,TB)).setSelected(true);
		ansq7.getToggles().get(answerStoration.retrieveDataRDBSet(7,TB)).setSelected(true);
		ansq8.getToggles().get(answerStoration.retrieveDataRDBSet(8,TB)).setSelected(true);
		ansq9.getToggles().get(answerStoration.retrieveDataRDBSet(9,TB)).setSelected(true);
		ansq10.getToggles().get(answerStoration.retrieveDataRDBSet(10,TB)).setSelected(true);
		
		int j = 1;
		int k = 0;
		for(int i = 0; i <39; i++) {
			txfLoop().get(i).setText(answerStoration.retrieveDataChoices(j, TB).get(k));
			k = (k+1)%4;
			if(k == 0) {
				j= (j+1)%11;
				
				answerStoration.retrieveDataChoices(j, TB).clear();
				
					}
		}
		txfLoop().get(39).setText(answerStoration.retrieveDataChoices(10, TB).get(3));
		answerStoration.retrieveDataChoices(10, TB).clear();
		
		}
	
	public ArrayList<TextField> txfLoop(){
		textfieldAnswer.add(quizAnswer1store);
		textfieldAnswer.add(quizAnswer2store);
		textfieldAnswer.add(quizAnswer3store);
		textfieldAnswer.add(quizAnswer4store);
		
		textfieldAnswer.add(quizAnswer1store2);
		textfieldAnswer.add(quizAnswer2store2);
		textfieldAnswer.add(quizAnswer3store2);
		textfieldAnswer.add(quizAnswer4store2);
		
		textfieldAnswer.add(quizAnswer1store3);
		textfieldAnswer.add(quizAnswer2store3);
		textfieldAnswer.add(quizAnswer3store3);
		textfieldAnswer.add(quizAnswer4store3);
		
		textfieldAnswer.add(quizAnswer1store4);
		textfieldAnswer.add(quizAnswer2store4);
		textfieldAnswer.add(quizAnswer3store4);
		textfieldAnswer.add(quizAnswer4store4);
		
		textfieldAnswer.add(quizAnswer1store5);
		textfieldAnswer.add(quizAnswer2store5);
		textfieldAnswer.add(quizAnswer3store5);
		textfieldAnswer.add(quizAnswer4store5);
		
		textfieldAnswer.add(quizAnswer1store6);
		textfieldAnswer.add(quizAnswer2store6);
		textfieldAnswer.add(quizAnswer3store6);
		textfieldAnswer.add(quizAnswer4store6);
		
		textfieldAnswer.add(quizAnswer1store7);
		textfieldAnswer.add(quizAnswer2store7);
		textfieldAnswer.add(quizAnswer3store7);
		textfieldAnswer.add(quizAnswer4store7);
		
		textfieldAnswer.add(quizAnswer1store8);
		textfieldAnswer.add(quizAnswer2store8);
		textfieldAnswer.add(quizAnswer3store8);
		textfieldAnswer.add(quizAnswer4store8);
		
		textfieldAnswer.add(quizAnswer1store9);
		textfieldAnswer.add(quizAnswer2store9);
		textfieldAnswer.add(quizAnswer3store9);
		textfieldAnswer.add(quizAnswer4store9);
		
		textfieldAnswer.add(quizAnswer1store10);
		textfieldAnswer.add(quizAnswer2store10);
		textfieldAnswer.add(quizAnswer3store10);
		textfieldAnswer.add(quizAnswer4store10);
		return textfieldAnswer;
	}
	
	public ArrayList<Integer> radioList(){
		
		ansq21.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			radioButtonList.set(0, ansq21.getToggles().indexOf(newValue));
		});
		
		ansq2.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			radioButtonList.set( 1, ansq2.getToggles().indexOf(newValue));
		});
		
		ansq3.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			radioButtonList.set(2, ansq3.getToggles().indexOf(newValue));
		});
		
		ansq4.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			radioButtonList.set(3 , ansq4.getToggles().indexOf(newValue));
		});
		
		ansq5.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			radioButtonList.set(4 , ansq5.getToggles().indexOf(newValue));
		});
		
		ansq6.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			radioButtonList.set(5 , ansq6.getToggles().indexOf(newValue));
		});
		
		ansq7.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			radioButtonList.set(6 , ansq7.getToggles().indexOf(newValue));
		});
		
		ansq8.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			radioButtonList.set(7 , ansq8.getToggles().indexOf(newValue));
		});
		
		ansq9.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			radioButtonList.set(8 , ansq9.getToggles().indexOf(newValue));
		});
		
		ansq10.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			radioButtonList.set(9 , ansq10.getToggles().indexOf(newValue));
		});	
		return radioButtonList;
	}
	
	
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		radioList();
		
		
	}
	
	
	
	
}
