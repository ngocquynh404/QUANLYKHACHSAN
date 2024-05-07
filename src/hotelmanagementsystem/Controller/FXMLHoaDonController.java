/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hotelmanagementsystem.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author nguye
 */
public class FXMLHoaDonController implements Initializable {
    private double x = 0;
    private double y = 0;
    
    @FXML
    private Button btn_exit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btn_exit_Click(ActionEvent event) {
        btn_exit.getScene().getWindow().hide();
    }

    @FXML
    private void btnPhieuTichDiem_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLPhieuTichDiem.fxml"));

            Stage stage = new Stage();
            Scene scene = new Scene(root);

            root.setOnMousePressed((MouseEvent mouseEvent) ->{
                x = mouseEvent.getSceneX();
                y = mouseEvent.getScreenY();
            });

            root.setOnMouseDragged((MouseEvent mouseEvent) ->{
                stage.setX(mouseEvent.getScreenX() - x);
                stage.setY(mouseEvent.getScreenY() - y);

                stage.setOpacity(.8);
            });

            root.setOnMouseReleased((MouseEvent mouseEvent) ->{
                stage.setOpacity(1);
            });


            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException e) {}
    }
    
}
