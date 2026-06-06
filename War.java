import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class War extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("War Card Game");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("War");
        stage.setScene(scene);
        stage.show();

        Game game = new Game();
        game.startGame();
    }

    public static void main(String[] args) {
        launch(args);
    }
}