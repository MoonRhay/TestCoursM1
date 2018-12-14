package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class outils {
	
	@FXML
	private Button btnexercice;
	
	@FXML
	private Button btnmagazine;
	
	@FXML
	private Button gramm;
	
	@FXML
	private Button conjug;
	
	@FXML
	private ImageView deco;
	
	public void deco(MouseEvent event) throws IOException {
		Parent decView = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
		Scene decScene = new Scene(decView);
		decScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(decScene);
		
	}
	public void PExercice(ActionEvent event) throws IOException {
		Parent pexericeView = FXMLLoader.load(getClass().getResource("exercice.fxml"));
		Scene pexerciceScene = new Scene(pexericeView);
		pexerciceScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(pexerciceScene);
		
	}
	
	public void PMagazine(ActionEvent event) throws IOException {
		Parent pexericeView = FXMLLoader.load(getClass().getResource("Magazine.fxml"));
		Scene pexerciceScene = new Scene(pexericeView);
		pexerciceScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(pexerciceScene);
		
	}	
	
	public void P2Exercice(MouseEvent event) throws IOException {
		btnexercice.setStyle("-fx-text-fill: black;-fx-background-color: lightblue");
		
	}
	
	public void P3Exercice(MouseEvent event) throws IOException {
		btnmagazine.setStyle("-fx-background-color: #4b60a9");
		btnexercice.setStyle("-fx-background-color: #4b60a9");
	}
	

	public void P2Magazine(MouseEvent event) throws IOException {
		btnmagazine.setStyle("-fx-text-fill: black;-fx-background-color: lightblue");
		
	}
	
	public void Gram(ActionEvent event) throws IOException {
		Parent GView = FXMLLoader.load(getClass().getResource("grammaire.fxml"));
		Scene GScene = new Scene(GView);
		GScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(GScene);
		
	}
	
	public void Conj(ActionEvent event) throws IOException {
		Parent CView = FXMLLoader.load(getClass().getResource("conjugaison.fxml"));
		Scene pexerciceScene = new Scene(CView);
		pexerciceScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(pexerciceScene);
		
	}
	


}
