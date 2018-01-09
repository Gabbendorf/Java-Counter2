import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
       AppButton button = new AppButton(new Button());
       button.actualButton().setText("+1");

       AppLabel label = new AppLabel();
       label.actualLabel().setText("0");

       Counter counter = new Counter(label);
       ActionSetter actionSetter = new ActionSetter(counter);
       actionSetter.addClickHandler(button);

       GridPane root = new GridPane();
       root.setAlignment(Pos.CENTER);

       root.add(button.actualButton(), 1, 1);
       root.add(label.actualLabel(), 1, 3);

       setStyle(button, label, root);

       Scene scene = new Scene(root, 300, 300);
       primaryStage.setScene(scene);
       primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void setStyle(AppButton button, AppLabel label, GridPane root) {
        button.actualButton().setStyle("-fx-color: yellow; -fx-padding: 10 15 10 15; -fx-font-size: 20");
        label.actualLabel().setStyle("-fx-font-size: 50; -fx-text-alignment: center; -fx-text-fill: red;");
        root.setStyle("-fx-background-color: white; -fx-border-width: 10; -fx-border-color: pink;");
    }
}
