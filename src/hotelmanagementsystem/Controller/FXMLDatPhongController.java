/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem.Controller;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author nguye
 */
public class FXMLDatPhongController implements Initializable{
    private double x = 0;
    private double y = 0;
    @FXML
    private Button btn_exit;
    @FXML
    private MenuBar menubar;
    @FXML
    private TextField txtHour;
    private ComboBox<String> cbb;
    @FXML
    private Menu menu;
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    @FXML
    private TextField txtMinute;
    @FXML
    private MenuBar menubar1;
    @FXML
    private Menu menu1;
    @FXML
    private MenuItem item12;
    @FXML
    private MenuItem item22;
    @FXML
    private MenuItem item32;
    @FXML
    private MenuItem item321;
    @FXML
    private MenuItem item3211;
    @FXML
    private MenuItem item32111;
    @FXML
    private MenuItem item321111;
    @FXML
    private MenuItem item3211111;
    @FXML
    private MenuItem item32111111;
    @FXML
    private MenuItem item321111111;
    @FXML
    private MenuItem item121;
    @FXML
    private MenuItem item221;
    @FXML
    private MenuItem item322;
    @FXML
    private MenuItem item3212;
    @FXML
    private MenuItem item32112;
    @FXML
    private MenuItem item321112;
    @FXML
    private MenuItem item3211112;
    @FXML
    private MenuItem item32111112;
    @FXML
    private MenuItem item321111112;
    @FXML
    private MenuItem item3211111111;
    @FXML
    private TextField txtHour1;
    @FXML
    private MenuBar menubar2;
    @FXML
    private Menu menu2;
    @FXML
    private MenuItem item1212;
    @FXML
    private MenuItem item2212;
    @FXML
    private MenuItem item3222;
    @FXML
    private MenuItem item32122;
    @FXML
    private MenuItem item321122;
    @FXML
    private MenuItem item3211122;
    @FXML
    private MenuItem item32111122;
    @FXML
    private MenuItem item321111122;
    @FXML
    private MenuItem item3211111122;
    @FXML
    private MenuItem item32111111112;
    @FXML
    private TextField txtMinute1;
    @FXML
    private MenuBar menubar11;
    @FXML
    private Menu menu11;
    @FXML
    private MenuItem item1211;
    @FXML
    private MenuItem item2211;
    @FXML
    private MenuItem item3221;
    @FXML
    private MenuItem item32121;
    @FXML
    private MenuItem item321121;
    @FXML
    private MenuItem item3211121;
    @FXML
    private MenuItem item32111121;
    @FXML
    private MenuItem item321111121;
    @FXML
    private MenuItem item3211111121;
    @FXML
    private MenuItem item32111111111;
    @FXML
    private JFXButton btnThemKH1;
    @FXML
    private JFXButton btnChitietKH;
    @FXML
    private JFXButton btnThemKH112;
    @FXML
    private JFXButton btnChitietThemPhong;
    @FXML
    private JFXButton btnThemKH1121;
    @FXML
    private JFXButton btnLuu;

    /**
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    private void updateMenuBarText(String text) {
        txtHour.setText(text);
    }

    @FXML
    private void btn_exit_Click(ActionEvent event) {
        btn_exit.getScene().getWindow().hide();
    }

    @FXML
    private void txtHour_Click(ActionEvent event) {
        cbb.getItems().clear();
            
            // Add new items to the ComboBox
        cbb.getItems().addAll("Item 1", "Item 2", "Item 3");
        cbb.show();
        menu.show();
    }

    private void btnClick(ActionEvent event) {
        cbb.getItems().clear();
            
            // Add new items to the ComboBox
        cbb.getItems().addAll("Item 1", "Item 2", "Item 3");
        cbb.show();
        menu.show();
    }

    @FXML
    private void btnThemKH_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLThemKhachHang.fxml"));

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

    @FXML
    private void btnChitietKH_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietKhachHang.fxml"));

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

    private void btnThemPhong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLThemPhong.fxml"));

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

    @FXML
    private void btnChitietThemPhong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietThuePhong.fxml"));

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

    @FXML
    private void btnThemThuePhong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLThemThuePhong.fxml"));

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
