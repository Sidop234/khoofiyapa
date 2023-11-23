package util;

import javafx.scene.control.Alert;

public class GuiUtil {
    public static void alert(Alert.AlertType errorType, String text) {
        Alert alert = new Alert(errorType , text);
        alert.showAndWait();
    }
}
