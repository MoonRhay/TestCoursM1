package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;
import javafx.event.ActionEvent;

public class Accueil {
	
	@FXML
	private Button exercice;
	
	@FXML
	private Button outils;
	
	@FXML
	private Button mag;
	
	@FXML
	private ImageView deco;
	
	
	
	public void Exercice(ActionEvent event) throws IOException {
		Parent exericeView = FXMLLoader.load(getClass().getResource("exercice.fxml"));
		Scene exerciceScene = new Scene(exericeView);
		exerciceScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(exerciceScene);
		
	}

	public void Outils(ActionEvent event) throws IOException {
		Parent outilView = FXMLLoader.load(getClass().getResource("outils.fxml"));
		Scene outilsScene = new Scene(outilView);
		outilsScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(outilsScene);
	}

	public void Magazine(ActionEvent event) throws IOException {
		Parent magView = FXMLLoader.load(getClass().getResource("Magazine.fxml"));
		Scene scenemagazine = new Scene(magView);
		scenemagazine.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scenemagazine);
		
	}
	
	public void Deco(MouseEvent event) throws IOException {
		Parent decoView = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
		Scene decosScene = new Scene(decoView);
		decosScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(decosScene);
		
	}
	
/*	public void Shadow(MouseEvent event) throws IOException {
		exercice.setEffect(shadow);
		
	}*/
}
