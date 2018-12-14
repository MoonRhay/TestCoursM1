package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class PartieExercice {
	
	@FXML
	private ImageView btnImageR;
	
	@FXML
	private Button suiv;
	
	@FXML
	private Button bor1;
	
	@FXML
	private Button bor2;
	
	@FXML
	private Button bor3;
	
	@FXML
	private Button bor4;
	
	@FXML
	private Label good;
	
	@FXML
	private Label bad;
	
	public void btnImageR(MouseEvent event) throws IOException {
		Parent btnimageView = FXMLLoader.load(getClass().getResource("FacileExo.fxml"));
		Scene btnimageScene = new Scene(btnimageView);
		btnimageScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(btnimageScene);
		
	}

	public void btnS(ActionEvent event) throws IOException {
		Parent btnimageSView = FXMLLoader.load(getClass().getResource("exo2.fxml"));
		Scene btnimageScene = new Scene(btnimageSView);
		btnimageScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(btnimageScene);
		
	}
	
	public void bor1(ActionEvent event) throws IOException {
		
		bor1.setStyle("-fx-background-color: #00ff00");
		good.setOpacity(1.0);
		suiv.setOpacity(1.0);
		bor2.setDisable(true);
		bor3.setDisable(true);
		bor4.setDisable(true);
	}
	
	public void bor2(ActionEvent event) throws IOException {
		
		bor1.setStyle("-fx-background-color: #00ff00");
		bor2.setStyle("-fx-background-color: red");
		bor3.setDisable(true);
		bor4.setDisable(true);
		bad.setOpacity(1.0);
		suiv.setOpacity(1.0);

	}	
	
	public void bor3(ActionEvent event) throws IOException {
		
		bor1.setStyle("-fx-background-color: #00ff00");
		bor3.setStyle("-fx-background-color: red");
		bor2.setDisable(true);
		bor4.setDisable(true);
		bad.setOpacity(1.0);
		suiv.setOpacity(1.0);
	}	
	
	public void bor4(ActionEvent event) throws IOException {
		
		bor1.setStyle("-fx-background-color: #00ff00");
		bor4.setStyle("-fx-background-color: red");
		bor2.setDisable(true);
		bor3.setDisable(true);
		bad.setOpacity(1.0);
		suiv.setOpacity(1.0);
	}	
	
	
}
