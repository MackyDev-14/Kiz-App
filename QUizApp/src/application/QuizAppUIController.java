package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
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
import javafx.stage.Stage;
import quizDatabase.answerStoration;
import quizDatabase.quizStoration;

public class QuizAppUIController implements Initializable{
	Connection connectDB;
	quizStoration displayQuiz;
	
	@FXML
    private Label quizTitle1set;
	@FXML
    private Label quizTitle2set;
	@FXML
    private Label quizTitle3set;
	@FXML
    private Label quizTitle4set;
	@FXML
    private Label quizTitle5set;
	@FXML
    private Label quizTitle6set;
	@FXML
    private Label quizTitle7set;
	@FXML
    private Label quizTitle8set;
	@FXML
    private Label quizTitle9set;
	@FXML
    private Label quizTitle10set;

	
	

	public void Start(ActionEvent event) throws ClassNotFoundException, SQLException, IOException{
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Play.fxml"));
		Parent play = (Parent) loader.load();
		Scene playingScene = new Scene(play);	
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		PlayController playControl = loader.getController();
		playControl.displayTexts(1, "Choices1");
		
		stage.setScene(playingScene);
		stage.show();
	}
	
	public void Start2(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Play.fxml"));
		Parent play = (Parent) loader.load();
		Scene playingScene = new Scene(play);	
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		PlayController playControl = loader.getController();
		playControl.displayTexts(2, "Choices2");
		
		stage.setScene(playingScene);
		stage.show();
	}
	
	public void Start3(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Play.fxml"));
		Parent play = (Parent) loader.load();
		Scene playingScene = new Scene(play);	
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		PlayController playControl = loader.getController();
		playControl.displayTexts(3, "Choices3");
		
		stage.setScene(playingScene);
		stage.show();
	}
	
	public void Start4(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Play.fxml"));
		Parent play = (Parent) loader.load();
		Scene playingScene = new Scene(play);	
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		PlayController playControl = loader.getController();
		playControl.displayTexts(4, "Choices4");
		
		stage.setScene(playingScene);
		stage.show();
	}
	
	public void Start5(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Play.fxml"));
		Parent play = (Parent) loader.load();
		Scene playingScene = new Scene(play);	
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		PlayController playControl = loader.getController();
		playControl.displayTexts(5, "Choices5");
		
		stage.setScene(playingScene);
		stage.show();
	}
	
	public void Start6(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Play.fxml"));
		Parent play = (Parent) loader.load();
		Scene playingScene = new Scene(play);	
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		PlayController playControl = loader.getController();
		playControl.displayTexts(6, "Choices6");
		
		stage.setScene(playingScene);
		stage.show();
	}
	
	public void Start7(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Play.fxml"));
		Parent play = (Parent) loader.load();
		Scene playingScene = new Scene(play);	
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		PlayController playControl = loader.getController();
		playControl.displayTexts(7, "Choices7");
		
		stage.setScene(playingScene);
		stage.show();
	}
	
	public void Start8(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Play.fxml"));
		Parent play = (Parent) loader.load();
		Scene playingScene = new Scene(play);	
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		PlayController playControl = loader.getController();
		playControl.displayTexts(8, "Choices8");
		
		stage.setScene(playingScene);
		stage.show();
	}
	
	public void Start9(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Play.fxml"));
		Parent play = (Parent) loader.load();
		Scene playingScene = new Scene(play);	
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		PlayController playControl = loader.getController();
		playControl.displayTexts(9, "Choices9");
		
		stage.setScene(playingScene);
		stage.show();
	}
	
	public void Start10(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Play.fxml"));
		Parent play = (Parent) loader.load();
		Scene playingScene = new Scene(play);	
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		PlayController playControl = loader.getController();
		playControl.displayTexts(10, "Choices10");
		
		stage.setScene(playingScene);
		stage.show();
	}
	

	
	public void Edit(ActionEvent event) throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Edit.fxml"));
		Parent editing = (Parent) loader.load();
		Scene switchEdit = new Scene(editing);
		
		EditController control = loader.getController();
			control.DBidNo(1, "Choices1");
		
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(switchEdit);
		stage.show();
		
		
	}
	public void Edit2(ActionEvent event) throws IOException{
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Edit.fxml"));
		Parent editing = (Parent) loader.load();
		Scene switchEdit = new Scene(editing);

		EditController control = loader.getController();
		control.DBidNo(2, "Choices2");
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(switchEdit);
		stage.show();
		
		
	}
	public void Edit3(ActionEvent event) throws IOException{
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Edit.fxml"));
		Parent editing = (Parent) loader.load();
		Scene switchEdit = new Scene(editing);

		EditController control = loader.getController();
		control.DBidNo(3, "Choices3");
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(switchEdit);
		stage.show();
		
		
	}
	public void Edit4(ActionEvent event) throws IOException{
	
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Edit.fxml"));
	Parent editing = (Parent) loader.load();
	Scene switchEdit = new Scene(editing);

	EditController control = loader.getController();
	control.DBidNo(4, "Choices4");
	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	stage.setScene(switchEdit);
	stage.show();
	
	
	}
	public void Edit5(ActionEvent event) throws IOException{
		
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Edit.fxml"));
	Parent editing = (Parent) loader.load();
	Scene switchEdit = new Scene(editing);

	EditController control = loader.getController();
	control.DBidNo(5, "Choices5");
	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	stage.setScene(switchEdit);
	stage.show();
	
	
	}
	public void Edit6(ActionEvent event) throws IOException{
		
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Edit.fxml"));
	Parent editing = (Parent) loader.load();
	Scene switchEdit = new Scene(editing);

	EditController control = loader.getController();
	control.DBidNo(6, "Choices6");
	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	stage.setScene(switchEdit);
	stage.show();
	
	
	}
	public void Edit7(ActionEvent event) throws IOException{
		
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Edit.fxml"));
	Parent editing = (Parent) loader.load();
	Scene switchEdit = new Scene(editing);

	EditController control = loader.getController();
	control.DBidNo(7, "Choices7");
	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	stage.setScene(switchEdit);
	stage.show();
	
	
	}
	public void Edit8(ActionEvent event) throws IOException{
		
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Edit.fxml"));
	Parent editing = (Parent) loader.load();
	Scene switchEdit = new Scene(editing);

	EditController control = loader.getController();
	control.DBidNo(8, "Choices8");
	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	stage.setScene(switchEdit);
	stage.show();
	
	
		}
	public void Edit9(ActionEvent event) throws IOException{
		
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Edit.fxml"));
	Parent editing = (Parent) loader.load();
	Scene switchEdit = new Scene(editing);

	EditController control = loader.getController();
	control.DBidNo(9, "Choices9");
	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	stage.setScene(switchEdit);
	stage.show();
	
	
	}
	public void Edit10(ActionEvent event) throws IOException{
		
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Edit.fxml"));
	Parent editing = (Parent) loader.load();
	Scene switchEdit = new Scene(editing);

	EditController control = loader.getController();
	control.DBidNo(10, "Choices10");
	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	stage.setScene(switchEdit);
	stage.show();
	
	
	}
	
	
	public void Delete() throws SQLException {
		for(int i = 1; i < 11; i++) {
			answerStoration.storeA(i, "Choices1", "a", "b", "c", "d", 0);
		}
		
		quizStoration.storeQ(1, "", "", "", "", "","", "", "", "", "", "");
		
	}
	
	public void Delete2() throws SQLException {
		for(int i = 1; i < 11; i++) {
			answerStoration.storeA(i, "Choices2", "a", "b", "c", "d", 0);
		}
		quizStoration.storeQ(2, "", "", "", "", "","", "", "", "", "", "");
	}
	
	public void Delete3() throws SQLException {
		for(int i = 1; i < 11; i++) {
			answerStoration.storeA(i, "Choices3", "a", "b", "c", "d", 0);
		}
		quizStoration.storeQ(3, "", "", "", "", "","", "", "", "", "", "");
	}
	
	public void Delete4() throws SQLException {
		for(int i = 1; i < 11; i++) {
			answerStoration.storeA(i, "Choices4", "a", "b", "c", "d", 0);
		}
		quizStoration.storeQ(4, "", "", "", "", "","", "", "", "", "", "");
		
	}
	
	public void Delete5() throws SQLException {
		for(int i = 1; i < 11; i++) {
			answerStoration.storeA(i, "Choices5", "a", "b", "c", "d", 0);
		}
		quizStoration.storeQ(5, "", "", "", "", "","", "", "", "", "", "");
	}
	
	public void Delete6() throws SQLException {
		for(int i = 1; i < 11; i++) {
			answerStoration.storeA(i, "Choices6", "a", "b", "c", "d", 0);
		}
		quizStoration.storeQ(6, "", "", "", "", "","", "", "", "", "", "");
	}
	
	public void Delete7() throws SQLException {
		for(int i = 1; i < 11; i++) {
			answerStoration.storeA(i, "Choices7", "a", "b", "c", "d", 0);
		}
		quizStoration.storeQ(7, "", "", "", "", "","", "", "", "", "", "");
	}
	
	public void Delete8() throws SQLException {
		for(int i = 1; i < 11; i++) {
			answerStoration.storeA(i, "Choices8", "a", "b", "c", "d", 0);
		}
		quizStoration.storeQ(8, "", "", "", "", "","", "", "", "", "", "");
	}
	
	public void Delete9() throws SQLException {
		for(int i = 1; i < 11; i++) {
			answerStoration.storeA(i, "Choices9", "a", "b", "c", "d", 0);
		}
		quizStoration.storeQ(9, "", "", "", "", "","", "", "", "", "", "");
	}
	
	public void Delete10() throws SQLException {
		for(int i = 1; i < 11; i++) {
			answerStoration.storeA(i, "Choices10", "a", "b", "c", "d", 0);
		}
		quizStoration.storeQ(10, "", "", "", "", "","", "", "", "", "", "");
	}
	
	
	
	
	
	
	
	public void setLabels(String str1,String str2,String str3,String str4,String str5,
			String str6,String str7,String str8,String str9,String str10) {
		quizTitle1set.setText(str1);
		quizTitle2set.setText(str2);
		quizTitle3set.setText(str3);
		quizTitle4set.setText(str4);
		quizTitle5set.setText(str5);
		quizTitle6set.setText(str6);
		quizTitle7set.setText(str7);
		quizTitle8set.setText(str8);
		quizTitle9set.setText(str9);
		quizTitle10set.setText(str10);
	}
	
	
	
	
	
	
	
	public void QuizTitleLabels(){
		
		setLabels(quizStoration.retrieveDataQuizzes().get(0),quizStoration.retrieveDataQuizzes().get(1),quizStoration.retrieveDataQuizzes().get(2),
				quizStoration.retrieveDataQuizzes().get(3),quizStoration.retrieveDataQuizzes().get(4),quizStoration.retrieveDataQuizzes().get(5),
				quizStoration.retrieveDataQuizzes().get(6),quizStoration.retrieveDataQuizzes().get(7),quizStoration.retrieveDataQuizzes().get(8),quizStoration.retrieveDataQuizzes().get(9));	
		
	}	
	
	public void initialize(URL location, ResourceBundle resources){
		QuizTitleLabels();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
