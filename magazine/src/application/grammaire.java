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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class grammaire {

	
	@FXML
	private Button conjugaison;
	
	@FXML
	private Button accueil;
	
	@FXML
	private Label un;
	
	@FXML
	private Label deux;

	@FXML
	private Label trois;

	@FXML
	private Label quatre;

	@FXML
	private Label cinq;

	
	public void Conjugaisons(ActionEvent event) throws IOException {
		Parent gramView = FXMLLoader.load(getClass().getResource("conjugaison.fxml"));
		Scene gramScene = new Scene(gramView);
		gramScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(gramScene);
		
	}
	
	public void acc(ActionEvent event) throws IOException {
		Parent accView = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
		Scene accScene = new Scene(accView);
		accScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(accScene);
		
	}
	
	public void P3conj(MouseEvent event) throws IOException {
		conjugaison.setStyle("-fx-background-color: #4b60a9");
		
	}
	

	public void P2conj(MouseEvent event) throws IOException {
		conjugaison.setStyle("-fx-text-fill: black;-fx-background-color: lightblue");
		
	}
	
	public void entre(MouseEvent event) throws IOException {
		un.setStyle("-fx-text-fill: #4b60a9 ");
		
	}
	
	public void sorti(MouseEvent event) throws IOException {
		un.setStyle("-fx-text-fill: black ");
		
	}
	
	public void entre2(MouseEvent event) throws IOException {
		deux.setStyle("-fx-text-fill: #4b60a9 ");
		
	}
	
	public void sorti2(MouseEvent event) throws IOException {
		deux.setStyle("-fx-text-fill: black ");
		
	}
	
	public void entre3(MouseEvent event) throws IOException {
		trois.setStyle("-fx-text-fill: #4b60a9 ");
		
	}
	
	public void sorti3(MouseEvent event) throws IOException {
		trois.setStyle("-fx-text-fill: black ");
		
	}
	
	public void entre4(MouseEvent event) throws IOException {
		quatre.setStyle("-fx-text-fill: #4b60a9 ");
		
	}
	
	public void sorti4(MouseEvent event) throws IOException {
		quatre.setStyle("-fx-text-fill: black ");
		
	}
	
	public void entre5(MouseEvent event) throws IOException {
		cinq.setStyle("-fx-text-fill: #4b60a9 ");
		
	}
	
	public void sorti5(MouseEvent event) throws IOException {
		cinq.setStyle("-fx-text-fill: black ");
		
	}
}
