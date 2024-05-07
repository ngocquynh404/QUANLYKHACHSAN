/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem.Controller;

import com.jfoenix.controls.JFXButton;
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
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author nguye
 */
public class FXMLMainFormController implements Initializable{
    private double x = 0;
    private double y = 0;
    
    @FXML
    private Button btn_exit;
    @FXML
    private JFXButton btnFormSodophong;
    @FXML
    private JFXButton btnFormQLKhachhang;
    @FXML
    private JFXButton btnFormQLDichvu;
    @FXML
    private JFXButton btnFormQLPhong;
    @FXML
    private JFXButton btnFormBaocaoThongke;
    @FXML
    private AnchorPane formSodophong;
    @FXML
    private JFXButton btnSodophong;
    @FXML
    private JFXButton btnDSDatphong;
    @FXML
    private AnchorPane subformSodophong;
    @FXML
    private AnchorPane formQLKhachhang;
    @FXML
    private AnchorPane formQLPhong;
    @FXML
    private AnchorPane formQLDichvu;
    @FXML
    private AnchorPane formBaocaoThongke;
    @FXML
    private AnchorPane formQLSanPham;
    @FXML
    private JFXButton btnFormQLSanPham;
    @FXML
    private JFXButton btnFormQLThietBi;
    @FXML
    private AnchorPane formQLThietbi;
    @FXML
    private JFXButton btnFormQLNguoidung;
    @FXML
    private AnchorPane formQLNguoidung;
    @FXML
    private JFXButton btnFormQDHoivien;
    @FXML
    private AnchorPane formQDHoivien;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    private void btn_exit_Click(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void btnFormSodophong_Click(ActionEvent event) {
        formSodophong.setVisible(true);
        formQLKhachhang.setVisible(false);
        formQLDichvu.setVisible(false);
        formQLPhong.setVisible(false);
        formBaocaoThongke.setVisible(false);
        formQLSanPham.setVisible(false);
        formQLThietbi.setVisible(false);
        formQLNguoidung.setVisible(false);
        formQDHoivien.setVisible(false);
    }

    @FXML
    private void btnFormQLKhachhang_Click(ActionEvent event) {
        formSodophong.setVisible(false);
        formQLKhachhang.setVisible(true);
        formQLDichvu.setVisible(false);
        formQLPhong.setVisible(false);
        formBaocaoThongke.setVisible(false);
        formQLSanPham.setVisible(false);
        formQLThietbi.setVisible(false);
        formQLNguoidung.setVisible(false);
        formQDHoivien.setVisible(false);
    }

    @FXML
    private void btnFormQLDichvu_Click(ActionEvent event) {
        formSodophong.setVisible(false);
        formQLKhachhang.setVisible(false);
        formQLDichvu.setVisible(true);
        formQLPhong.setVisible(false);
        formBaocaoThongke.setVisible(false);
        formQLSanPham.setVisible(false);
        formQLThietbi.setVisible(false);
        formQLNguoidung.setVisible(false);
        formQDHoivien.setVisible(false);
    }

    @FXML
    private void btnFormQLPhong_Click(ActionEvent event) {
        formSodophong.setVisible(false);
        formQLKhachhang.setVisible(false);
        formQLDichvu.setVisible(false);
        formQLPhong.setVisible(true);
        formBaocaoThongke.setVisible(false);
        formQLSanPham.setVisible(false);
        formQLThietbi.setVisible(false);
        formQLNguoidung.setVisible(false);
        formQDHoivien.setVisible(false);
    }

    @FXML
    private void btnFormBaocaoThongke_Click(ActionEvent event) {
        formSodophong.setVisible(false);
        formQLKhachhang.setVisible(false);
        formQLDichvu.setVisible(false);
        formQLPhong.setVisible(false);
        formBaocaoThongke.setVisible(true);
        formQLSanPham.setVisible(false);
        formQLThietbi.setVisible(false);
        formQLNguoidung.setVisible(false);
        formQDHoivien.setVisible(false);
    }
    
    @FXML
    private void btnFormQLSanpham_Click(ActionEvent event) {
        formSodophong.setVisible(false);
        formQLKhachhang.setVisible(false);
        formQLDichvu.setVisible(false);
        formQLPhong.setVisible(false);
        formBaocaoThongke.setVisible(false);
        formQLSanPham.setVisible(true);
        formQLThietbi.setVisible(false);
        formQLNguoidung.setVisible(false);
        formQDHoivien.setVisible(false);
    }
    
    @FXML
    private void btnFormQLThietbi_Click(ActionEvent event) {
        formSodophong.setVisible(false);
        formQLKhachhang.setVisible(false);
        formQLDichvu.setVisible(false);
        formQLPhong.setVisible(false);
        formBaocaoThongke.setVisible(false);
        formQLSanPham.setVisible(false);
        formQLThietbi.setVisible(true);
        formQLNguoidung.setVisible(false);
        formQDHoivien.setVisible(false);
    }
    
    @FXML
    private void btnFormQLNguoidung_Click(ActionEvent event) {
        formSodophong.setVisible(false);
        formQLKhachhang.setVisible(false);
        formQLDichvu.setVisible(false);
        formQLPhong.setVisible(false);
        formBaocaoThongke.setVisible(false);
        formQLSanPham.setVisible(false);
        formQLThietbi.setVisible(false);
        formQLNguoidung.setVisible(true);
        formQDHoivien.setVisible(false);
    }
    
    @FXML
    private void btnFormQDHoivien_Click(ActionEvent event) {
        formSodophong.setVisible(false);
        formQLKhachhang.setVisible(false);
        formQLDichvu.setVisible(false);
        formQLPhong.setVisible(false);
        formBaocaoThongke.setVisible(false);
        formQLSanPham.setVisible(false);
        formQLThietbi.setVisible(false);
        formQLNguoidung.setVisible(false);
        formQDHoivien.setVisible(true);
    }

    @FXML
    private void btnSodophong_Click(ActionEvent event) {
        
    }
    
    @FXML
    private void btnDatphong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLDatPhong.fxml"));

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
    private void btnDSDatphong_Click(ActionEvent event) {
        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLDanhSachDatPhong.fxml"));

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
    private void btnChiTietDatPhong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietDatPhong.fxml"));

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
    private void btnSuaDatphong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLDatPhong.fxml"));

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
    private void btnChiTietThuePhong_Click(ActionEvent event) {
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
    private void btnSuaDatPhong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLDatPhong.fxml"));

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
    private void btnChiTietKhachHang_Click(ActionEvent event) {
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

    @FXML
    private void btnSuaKhachHang_Click(ActionEvent event) {
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

    @FXML
    private void btnChiTietHoiVien_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietHoiVien.fxml"));

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
    private void btnSuaHoiVien_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietHoiVien.fxml"));

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
    private void btnThemHoiVien_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLThemHoiVien.fxml"));

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
    private void btnChiTietDichVu_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietDichVu.fxml"));

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
    private void btnSuaDichVu_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietDichVu.fxml"));

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
    private void btnThemDichVu_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLThemDichVu.fxml"));

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
    private void btnChiTietCauHinhGiaDV_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietGiaDichVu.fxml"));

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
    private void btnSuaCauHinhGiaDV_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietGiaDichVu.fxml"));

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
    private void btnThemCauHinhGiaDV_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLCauHinhGiaDichVu.fxml"));

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
        }catch (IOException e) {}
    }

    @FXML
    private void btnChiTietPhong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietPhong.fxml"));

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
    private void btnSuaPhong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietPhong.fxml"));

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
    private void btnChiTietLoaiPhong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietLoaiPhong.fxml"));

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
    private void btnSuaLoaiPhong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietLoaiPhong.fxml"));

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
    private void btnThemLoaiPhong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLThemLoaiPhong.fxml"));

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
    private void btnChiTietTang_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietTang.fxml"));

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
    private void btnSuaTang_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietTang.fxml"));

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
    private void btnThemTang_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLThemTang.fxml"));

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
    private void btnChiTietGiaPhong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietGiaPhong.fxml"));

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
    private void btnSuaCauHinhGiaPhong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietGiaPhong.fxml"));

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
    private void btnThemCauHinhGiaPhong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLCauHinhGiaPhong.fxml"));

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
    private void btnChiTietSanPham_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietSanPham.fxml"));

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
    private void btnSuaSanPham_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietSanPham.fxml"));

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
    private void btnThemSanPham_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLThemSanPham.fxml"));

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
    private void btnChiTietLoaiSanPham_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietLoaiSanPham.fxml"));

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
    private void btnSuaLoaiSanPham_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietLoaiSanPham.fxml"));

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
    private void btnThemLoaiSanPham_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLThemLoaiSanPham.fxml"));

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
    private void btnChiTietThietBi_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietThietBi.fxml"));

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
    private void btnSuaThietBi_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietThietBi.fxml"));

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
    private void btnThemThietBi_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLThemThietBi.fxml"));

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
    private void btnThemPhong_ThietBi_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLThemPhong_ThietBi.fxml"));

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
    private void btnChiTietNguoiDung_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietNguoiDung.fxml"));

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
    private void btnSuaNguoiDung_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietNguoiDung.fxml"));

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
    private void btnThemNguoiDung_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLThemNguoiDung.fxml"));

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
    private void btnChiTietVaiTro_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietVaiTro.fxml"));

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
    private void btnSuaVaiTro_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietVaiTro.fxml"));

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
    private void btnThemVaiTro_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLThemVaiTro.fxml"));

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
    private void btnChiTietCBHoiVien_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietCapBacHoiVien.fxml"));

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
    private void btnSuaCBHoiVien_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietCapBacHoiVien.fxml"));

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
    private void btnThemCBHoiVien_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLCapBacHoiVien.fxml"));

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
    private void btnChiTietPhong_ThietBi_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietPhong_ThietBi.fxml"));

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
    private void btnSuaPhong_ThietBi_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietPhong_ThietBi.fxml"));

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
    private void btnTraphong_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLChiTietHoaDon.fxml"));

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
    private void btnDKDichVu_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLDangKyDichVu.fxml"));

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
    private void btnPhieuMuaSP_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLPhieuMuaSanPham.fxml"));

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
    private void btnPhieuPhatSinh_Click(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/hotelmanagementsystem/UI/FXMLPhieuPhatSinh.fxml"));

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
