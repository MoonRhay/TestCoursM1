package application;

import java.io.IOException;

import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class exo2 {

	/*@FXML
	Timeline timeline  = new Timeline(); 
	
	public void swich(MouseEvent event) throws IOException{
		timeline.setCycleCount(1); 
		timeline.setAutoReverse(true); 
		timeline.play();
	}*/
	
	@FXML
	private Button ok;
	
	public void ok(ActionEvent event) throws IOException {
		Parent btnimageSView = FXMLLoader.load(getClass().getResource("FacileExo.fxml"));
		Scene btnimageScene = new Scene(btnimageSView);
		btnimageScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(btnimageScene);
		
	}
}
