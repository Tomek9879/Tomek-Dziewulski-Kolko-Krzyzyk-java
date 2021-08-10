package com.kodilla.blackjack;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class OkienkoWygrales {
    public static Optional<ButtonType> okienkoWygrales(int numerGracz){
        Alert powiadomienieOZwyciestwie = new Alert(Alert.AlertType.INFORMATION);
        powiadomienieOZwyciestwie.setTitle("Zwyciestwo");
        powiadomienieOZwyciestwie.setHeaderText("Wygrał gracz nr:"+numerGracz);

        Optional<ButtonType> result =  powiadomienieOZwyciestwie.showAndWait();
        return result;
    }
}
