import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/loging_form.fxml"))));
        stage.centerOnScreen();
        stage.setTitle("Login page");
        Image image=new Image("/assets/icons/icons8-books-96.png");
        stage.getIcons().add(image);

        stage.show();

    }
}
