package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;



import javafx.event.ActionEvent;



public class Connexion {
	@FXML
	private Button apprend;
    
	public void Accueil(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
		Scene homeScene = new Scene(homeView);
		
		homeScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);
		
	}
	
}
