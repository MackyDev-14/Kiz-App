package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import quizDatabase.answerStoration;
import quizDatabase.quizStoration;

public class PlayController implements Initializable{
	  	@FXML
	    private Label QuizQuestion;

	    @FXML
	    private RadioButton mpc1;

	    @FXML
	    private ToggleGroup choice;

	    @FXML
	    private RadioButton mpc2;

	    @FXML
	    private RadioButton mpc3;

	    @FXML
	    private RadioButton mpc4;

	    @FXML
	    private Label QuizTitle, questionNumber;
	    
	    @FXML
	    private ImageView viewImg;
	    
	    int ID;
	    
	    String TB;
	    int index = 1;
	    int index2 = 2;
	    int choiceX;
	    int score = 0;
	    
	    Image correct = new Image("correct_icon.png");
	    Image wrong = new Image("wrong_icon.png");
	    
	    
	    
	public void End(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Result.fxml"));
		Parent result = (Parent) loader.load();
		Scene quizDone = new Scene(result);
		
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		ResultController resC = loader.getController();
		resC.setResultScene(Integer.toString(score));
		stage.setScene(quizDone);
		stage.show();
	}
	
	public void okButton(ActionEvent e) throws ClassNotFoundException, SQLException {
		questionNumber.setText(Integer.toString(index2));
		System.out.print(index);
		System.out.print(index2 + "\n");
		QuizQuestion.setText(quizStoration.retrieveDataQuestions(ID).get(index));
		
		if(index2 == 2) {
			
			((Labeled) mpc1).setText(answerStoration.retrieveDataChoices(2, TB).get(0));
			((Labeled) mpc2).setText(answerStoration.retrieveDataChoices(2, TB).get(1));
			((Labeled) mpc3).setText(answerStoration.retrieveDataChoices(2, TB).get(2));
			((Labeled) mpc4).setText(answerStoration.retrieveDataChoices(2, TB).get(3));
			if(choiceValue() == answerStoration.retrieveDataRDBSet(1, TB)) {
				viewImg.setImage(correct);
				score = score + 1;
			} else {
				viewImg.setImage(wrong);
			}
			answerStoration.retrieveDataChoices(2, TB).clear();
		}else if(index2 == 3 ) {
			((Labeled) mpc1).setText(answerStoration.retrieveDataChoices(3, TB).get(0));
			((Labeled) mpc2).setText(answerStoration.retrieveDataChoices(3, TB).get(1));
			((Labeled) mpc3).setText(answerStoration.retrieveDataChoices(3, TB).get(2));
			((Labeled) mpc4).setText(answerStoration.retrieveDataChoices(3, TB).get(3));
			if(choiceValue() == answerStoration.retrieveDataRDBSet(2, TB) )  {
				viewImg.setImage(correct);
				score = score + 1;
			} else {
				viewImg.setImage(wrong);
			}
			answerStoration.retrieveDataChoices(3, TB).clear();
		}else if(index2 == 4 ) {
			((Labeled) mpc1).setText(answerStoration.retrieveDataChoices(4, TB).get(0));
			((Labeled) mpc2).setText(answerStoration.retrieveDataChoices(4, TB).get(1));
			((Labeled) mpc3).setText(answerStoration.retrieveDataChoices(4, TB).get(2));
			((Labeled) mpc4).setText(answerStoration.retrieveDataChoices(4, TB).get(3));
			if(choiceValue() == answerStoration.retrieveDataRDBSet(3, TB)) {
				viewImg.setImage(correct);
				score = score + 1;
			} else {
				viewImg.setImage(wrong);
			}
			answerStoration.retrieveDataChoices(4, TB).clear();
		}else if(index2 == 5 ) {
			((Labeled) mpc1).setText(answerStoration.retrieveDataChoices(5, TB).get(0));
			((Labeled) mpc2).setText(answerStoration.retrieveDataChoices(5, TB).get(1));
			((Labeled) mpc3).setText(answerStoration.retrieveDataChoices(5, TB).get(2));
			((Labeled) mpc4).setText(answerStoration.retrieveDataChoices(5, TB).get(3));
			if(choiceValue() == answerStoration.retrieveDataRDBSet(4, TB)) {
				viewImg.setImage(correct);
				score = score + 1;
			} else {
				viewImg.setImage(wrong);
			}
			answerStoration.retrieveDataChoices(5, TB).clear();
		}else if(index2 == 6 ) {
			((Labeled) mpc1).setText(answerStoration.retrieveDataChoices(6, TB).get(0));
			((Labeled) mpc2).setText(answerStoration.retrieveDataChoices(6, TB).get(1));
			((Labeled) mpc3).setText(answerStoration.retrieveDataChoices(6, TB).get(2));
			((Labeled) mpc4).setText(answerStoration.retrieveDataChoices(6, TB).get(3));
			if(choiceValue() == answerStoration.retrieveDataRDBSet(5, TB)) {
				viewImg.setImage(correct);
				score = score + 1;
			} else {
				viewImg.setImage(wrong);
			}
			answerStoration.retrieveDataChoices(6, TB).clear();
		}else if(index2 == 7 ) {
			((Labeled) mpc1).setText(answerStoration.retrieveDataChoices(7, TB).get(0));
			((Labeled) mpc2).setText(answerStoration.retrieveDataChoices(7, TB).get(1));
			((Labeled) mpc3).setText(answerStoration.retrieveDataChoices(7, TB).get(2));
			((Labeled) mpc4).setText(answerStoration.retrieveDataChoices(7, TB).get(3));
			if(choiceValue() == answerStoration.retrieveDataRDBSet(6, TB)) {
				viewImg.setImage(correct);
				score = score + 1;
			} else {
				viewImg.setImage(wrong);
			}
			answerStoration.retrieveDataChoices(7, TB).clear();
		}else if(index2 == 8 ) {
			((Labeled) mpc1).setText(answerStoration.retrieveDataChoices(8, TB).get(0));
			((Labeled) mpc2).setText(answerStoration.retrieveDataChoices(8, TB).get(1));
			((Labeled) mpc3).setText(answerStoration.retrieveDataChoices(8, TB).get(2));
			((Labeled) mpc4).setText(answerStoration.retrieveDataChoices(8, TB).get(3));
			if(choiceValue() == answerStoration.retrieveDataRDBSet(7, TB)) {
				viewImg.setImage(correct);
				score = score + 1;
			} else {
				viewImg.setImage(wrong);
			}
			answerStoration.retrieveDataChoices(8, TB).clear();
		}else if(index2 == 9 ) {
			((Labeled) mpc1).setText(answerStoration.retrieveDataChoices(9, TB).get(0));
			((Labeled) mpc2).setText(answerStoration.retrieveDataChoices(9, TB).get(1));
			((Labeled) mpc3).setText(answerStoration.retrieveDataChoices(9, TB).get(2));
			((Labeled) mpc4).setText(answerStoration.retrieveDataChoices(9, TB).get(3));
			if(choiceValue() == answerStoration.retrieveDataRDBSet(8, TB)) {
				viewImg.setImage(correct);
				score = score + 1;
			} else {
				viewImg.setImage(wrong);
			}
			answerStoration.retrieveDataChoices(9, TB).clear();
		}else if(index2 == 10 ) {
			((Labeled) mpc1).setText(answerStoration.retrieveDataChoices(10, TB).get(0));
			((Labeled) mpc2).setText(answerStoration.retrieveDataChoices(10, TB).get(1));
			((Labeled) mpc3).setText(answerStoration.retrieveDataChoices(10, TB).get(2));
			((Labeled) mpc4).setText(answerStoration.retrieveDataChoices(10, TB).get(3));
			if(choiceValue() == answerStoration.retrieveDataRDBSet(9, TB)) {
				viewImg.setImage(correct);
				score = score + 1;
			} else {
				viewImg.setImage(wrong);
			}
			answerStoration.retrieveDataChoices(10, TB).clear();
			
		}else if(index == 10 || index2 == 11) {
			if(choiceValue() == answerStoration.retrieveDataRDBSet(10, TB)) {
				
				score = score + 1;
			} else {
				
			}
			
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("Result.fxml"));
				Parent result;
				result = (Parent) loader.load();
				Scene quizDone = new Scene(result);
				quizStoration.retrieveDataQuestions(ID).clear();
				ResultController resC = loader.getController();
				resC.setResultScene(Integer.toString(score));
				Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
				stage.setScene(quizDone);
				stage.show();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		System.out.println(score);
		index = index +1;
		index2 = index2 + 1;
		
	}
	
	
	
	
	public void displayTexts(Integer id, String t) throws ClassNotFoundException, SQLException {
		this.ID = id;
		this.TB = t;
		QuizTitle.setText(quizStoration.retrieveDataQuizzes().get(ID-1));
		System.out.println(quizStoration.retrieveDataQuizzes().get(ID));
		QuizQuestion.setText(quizStoration.retrieveDataQuestions(ID).get(0));
		quizStoration.retrieveDataQuestions(ID).clear();
		mpc1.setSelected(true);
		((Labeled) mpc1).setText(answerStoration.retrieveDataChoices(1, TB).get(0));
		((Labeled) mpc2).setText(answerStoration.retrieveDataChoices(1, TB).get(1));
		((Labeled) mpc3).setText(answerStoration.retrieveDataChoices(1, TB).get(2));
		((Labeled) mpc4).setText(answerStoration.retrieveDataChoices(1, TB).get(3));
		answerStoration.retrieveDataChoices(1, TB).clear();
	}
	
	
	public int choiceValue() {
		choice.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			 choiceX = choice.getToggles().indexOf(newValue);
		});
		return choiceX;
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		choiceValue();
		
	}
	
	
	
	
	
	
	
}
