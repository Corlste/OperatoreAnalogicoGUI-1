package Operatore_BOT_GUI.controller;

import Operatore_BOT_GUI.controller.StartController;
import Operatore_BOT_GUI.model.Model;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Start.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			
			Model model = new Model();
			StartController controller = loader.getController();
			controller.setModel(model);
			
			Scene scene = new Scene(root,1920,1000);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

