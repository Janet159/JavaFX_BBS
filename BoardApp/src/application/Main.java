package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static Scene scene;
	
	@Override
	public void start(Stage stage) throws IOException {
		scene = new Scene(loadFXML("Main"));	//Main.fxml
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		
		
		
		
		Image icon = new Image("icon.png");
		stage.getIcons().add(icon);
		stage.setTitle("게시판");
		stage.setResizable(false);
		stage.show();
	}
	
	public static void setRoot(String fxml) throws Exception{
		scene.setRoot(loadFXML(fxml));
	}
	
	public static void setRoot(Parent root) throws Exception{
		scene.setRoot(root);
	}
	
	public static FXMLLoader getLoader(String fxml) throws IOException{
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml+".fxml"));
		return fxmlLoader;
	}
	
	public static Parent loadFXML(String fxml) throws IOException{
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml+".fxml"));
		return fxmlLoader.load();
	}
	
	public static void exit() {
		Stage stage = (Stage) scene.getWindow();
		stage.close();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
