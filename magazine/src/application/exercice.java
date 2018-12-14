package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;


import java.io.IOException;
import javafx.event.ActionEvent;

public class exercice {
	
	@FXML
	private Button facile;

	@FXML
	private Button btoutil;
	
	@FXML
	private Button btnmagazine;
	
	@FXML
	private ImageView deco;
	
	
	public void deco2(MouseEvent event) throws IOException {
		Parent d2View = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
		Scene d2Scene = new Scene(d2View);
		d2Scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(d2Scene);
		
	}
	
	public void ExoFacile(ActionEvent event) throws IOException {
		Parent facileView = FXMLLoader.load(getClass().getResource("FacileExo.fxml"));
		Scene facileScene = new Scene(facileView);
		facileScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(facileScene);
		
	}
	
	public void Outils(ActionEvent event) throws IOException {
		Parent facileView = FXMLLoader.load(getClass().getResource("outils.fxml"));
		Scene facileScene = new Scene(facileView);
		facileScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(facileScene);
		
	}
	
	public void Magazines(ActionEvent event) throws IOException {
		Parent facileView = FXMLLoader.load(getClass().getResource("Magazine.fxml"));
		Scene facileScene = new Scene(facileView);
		facileScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(facileScene);
		
	}
	
	public void P2Exercice(MouseEvent event) throws IOException {
		btoutil.setStyle("-fx-text-fill: black;-fx-background-color: lightblue");
		
	}
	
	public void P3Exercice(MouseEvent event) throws IOException {
		btnmagazine.setStyle("-fx-background-color: #4b60a9");
		btoutil.setStyle("-fx-background-color: #4b60a9");
	}
	

	public void P2Magazine(MouseEvent event) throws IOException {
		btnmagazine.setStyle("-fx-text-fill: black;-fx-background-color: lightblue");
		
	}
	
}
