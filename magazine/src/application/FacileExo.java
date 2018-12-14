package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;
import java.io.InputStream;
import javafx.scene.control.ProgressBar;

import javafx.event.ActionEvent;

public class FacileExo {
	
	@FXML
	private Button acueil;
	
	@FXML
	private ImageView image;
	
	@FXML
	private Button exoInf;
	
	@FXML
	private ProgressBar bar;
	
	
	
	
	//Image  buttonPressed = new Image();
	
	
	 
	
	/*public void start() {
		try {
			Image image2 = new Image(Main.class.getResource("/pic.jpeg").toExternalForm(), 100, 100, true, true);
			ImageView imageView = new ImageView(image2);

			imageView.setFitWidth(100);

			imageView.setFitHeight(100);

			retour.setGraphic(imageView);
			/*Image img1 = new Image(getClass().getResourceAsStream("../../../../../../../../../../home/42/rbleu/Bureau/stockage/eclipse/flecheRetour.jpg"));
			retour = new Button("retour", new ImageView(img1));
			/*final Image image = new Image(getClass().getResource("../../../flecheRetour.jpg").toExternalForm()); 
			final ImageView icon = new ImageView(image); 
			retour.setGraphic(icon);*/
			/*retour.setStyle("-fx-background-image : ../../../flecheRetour.jpg; -fx-border-radius: 30; -fx-background-color: red;");*/
		/*} catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	
	/*final Image image = new Image(getClass().getResource("flecheRetour.jpg").toExternalForm()); 
	final ImageView icon = new ImageView(image); */
	
	/*public void Retour(ActionEvent event) throws IOException {
		Parent retourView = FXMLLoader.load(getClass().getResource("exercice.fxml"));
		Scene retourScene = new Scene(retourView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(retourScene);
		
	}*/
	
	
	
	public void accueil(ActionEvent event) throws IOException {
		Parent acceuilView = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
		Scene accueilScene = new Scene(acceuilView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(accueilScene);
		
	}
	
	public void test(ActionEvent event) throws IOException {
		Parent testView = FXMLLoader.load(getClass().getResource("PartieExercice.fxml"));
		Scene testScene = new Scene(testView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(testScene);
		
	}
	
	public void btnImage(MouseEvent event) throws IOException {
		Parent btnimageView = FXMLLoader.load(getClass().getResource("exercice.fxml"));
		Scene btnimageScene = new Scene(btnimageView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(btnimageScene);
		
	}
	

}
