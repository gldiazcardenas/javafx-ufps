package co.gldc.javafx.ufpsdemo;

import co.gldc.javafx.ufpsdemo.view.LoginView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginApp extends Application {

    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(new LoginView()));
        stage.setHeight(400);
        stage.setWidth(500);
        stage.show();
    }

    public static void main(String[] arg) {
        launch(arg);
    }

}
