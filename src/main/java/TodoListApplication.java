import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

class ToDoListApplication extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ListManager.fxml"));

        primaryStage.setTitle("To-do list");
        primaryStage.setScene(new Scene(root, 450, 300));

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}