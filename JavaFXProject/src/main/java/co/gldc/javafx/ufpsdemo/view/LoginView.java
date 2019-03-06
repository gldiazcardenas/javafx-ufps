package co.gldc.javafx.ufpsdemo.view;

import co.gldc.javafx.ufpsdemo.LoginApp;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class LoginView extends VBox {

    public LoginView() {
        try {
            FXMLLoader loader = new FXMLLoader(LoginApp.class.getResource("co/gldc/javafx/ufpsdemo/view/LoginView.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
            getStylesheets().add(LoginApp.class.getResource("co/gldc/javafx/ufpsdemo/view/LoginView.css").toExternalForm());
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
