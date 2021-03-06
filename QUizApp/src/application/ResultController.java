package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ResultController implements Initializable{

	@FXML
	Label scoreLabel;
	
	
	
	public void Done(ActionEvent event) throws IOException {
		Parent appUI = FXMLLoader.load(getClass().getResource("quizAppUI.fxml"));
		Scene main = new Scene(appUI);	
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		stage.setScene(main);
		stage.show();
	}

	public void setResultScene(String score) {
		scoreLabel.setText(score);
	}
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	
	
	
	
	
	
}
