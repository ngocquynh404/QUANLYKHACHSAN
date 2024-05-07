/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hotelmanagementsystem.Controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author nguye
 */
public class FXMLChiTietPhong_ThietBiController implements Initializable {

    @FXML
    private Button btn_exit;
    @FXML
    private JFXButton btnThemKH112;
    @FXML
    private JFXButton btnLuu;
    @FXML
    private JFXButton btnHuy;
    @FXML
    private JFXButton btnLuuThem;

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
    private void btnThemKH_Click(ActionEvent event) {
    }
    
}
