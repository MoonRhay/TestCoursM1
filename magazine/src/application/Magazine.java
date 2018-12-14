package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Magazine {		
		
	public GridPane gridGeo;
	public GridPane gridHist;
	public GridPane gridCult;
	
	
	
	@FXML
	private ImageView hist, geo, cult;
	
	private Image histImg, geoImg, cultImg;
	
	@FXML
	private Button btnexo;
	
	@FXML
	private Button btnoutil;
	
	@FXML
	private ImageView deco2;
	
	
	public void deco3(MouseEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
		Scene homeScene = new Scene(homeView);
		homeScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);
		
	}
	
	public void btnImageGeographie(MouseEvent event) throws IOException {
	
		
		gridCult.setVisible(false);
		gridHist.setVisible(false);
		gridGeo.setVisible(true);
		
		geoImg = new Image(new File("../image projet javafx IHM/flecheGeo2.png").toURL().toString());
		geo.setImage(geoImg);
		
		histImg = new Image(new File("../image projet javafx IHM/flecheHistoire.png").toURL().toString());
		hist.setImage(histImg);
		
		cultImg = new Image(new File("../image projet javafx IHM/flecheCulture.png").toURL().toString());
		cult.setImage(cultImg);
		
	}
	
	public void btnImageHistoire(MouseEvent event) throws IOException {
		
		
		gridCult.setVisible(false);
		gridHist.setVisible(true);
		gridGeo.setVisible(false);
		
		histImg = new Image(new File("../image projet javafx IHM/flecheHistoire2.png").toURL().toString());
		hist.setImage(histImg);

		cultImg = new Image(new File("../image projet javafx IHM/flecheCulture.png").toURL().toString());
		cult.setImage(cultImg);
		
		geoImg = new Image(new File("../image projet javafx IHM/flecheGeo.png").toURL().toString());
		geo.setImage(geoImg);
	}

	public void btnImageCulture(MouseEvent event) throws IOException {
		
		
		gridCult.setVisible(true);
		gridGeo.setVisible(false);
		gridHist.setVisible(false);
		
		cultImg = new Image(new File("../image projet javafx IHM/flecheCulture2.png").toURL().toString());
		cult.setImage(cultImg);
		
		geoImg = new Image(new File("../image projet javafx IHM/flecheGeo.png").toURL().toString());
		geo.setImage(geoImg);
		
		histImg = new Image(new File("../image projet javafx IHM/flecheHistoire.png").toURL().toString());
		hist.setImage(histImg);
		
	}
	
	public void Outils2(ActionEvent event) throws IOException {
		Parent OView = FXMLLoader.load(getClass().getResource("outils.fxml"));
		Scene OScene = new Scene(OView);
		OScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(OScene);
		
	}
	public void Exercice2(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("exercice.fxml"));
		Scene homeScene = new Scene(homeView);
		homeScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);
		
	}
	
	public void P2Exercice(MouseEvent event) throws IOException {
		btnexo.setStyle("-fx-text-fill: black;-fx-background-color: lightblue");
		
	}
	
	public void P3Exercice(MouseEvent event) throws IOException {
		btnoutil.setStyle("-fx-background-color: #4b60a9");
		btnexo.setStyle("-fx-background-color: #4b60a9");
	}
	

	public void P2Outil(MouseEvent event) throws IOException {
		btnoutil.setStyle("-fx-text-fill: black;-fx-background-color: lightblue");
		
	}
	
}