package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.Bo.BoFactory;
import lk.ijse.Bo.custom.BookBo;
import lk.ijse.Bo.custom.TransactionBo;
import lk.ijse.Bo.custom.UserBo;
import lk.ijse.Tm.TransactionTm;
import lk.ijse.dto.TransactionDto;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AdminDashboardFormController {

    public AnchorPane pane2;
    public TableView<TransactionTm> tblCheckOuts;
    public JFXButton Dashboard;
    public AnchorPane root;
    @FXML
    private JFXButton btnBook;

    @FXML
    private JFXButton btnBranches;

    @FXML
    private JFXButton btnTransaction;


    @FXML
    private TableColumn<?, ?> colBookName;

    @FXML
    private TableColumn<?, ?> colDueDate;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private ImageView imgExit;

    @FXML
    private ImageView imgProfile;

    @FXML
    private Label lblBook;

    @FXML
    private Label lblUser;
    private BookBo bookBo = (BookBo) BoFactory.getBoFactory().getBoType(BoFactory.BoTypes.BOOK);
    private UserBo userBo = (UserBo) BoFactory.getBoFactory().getBoType(BoFactory.BoTypes.USER);
    private TransactionBo transactionBo = (TransactionBo) BoFactory.getBoFactory().getBoType(BoFactory.BoTypes.TRANSACTION);
    private ObservableList<TransactionTm> observableList = FXCollections.observableArrayList();


    @FXML
    void btnBookOnAction(ActionEvent event) {
        Parent fxml = null;
        try {
            fxml = FXMLLoader.load(getClass().getResource("/view/Admin/Manage_book_form.fxml"));
            pane2.getChildren().removeAll();

            pane2.getChildren().setAll(fxml);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @FXML
    void btnBranchesOnAction(ActionEvent event) {
        Parent fxml = null;
        try {
            fxml = FXMLLoader.load(getClass().getResource("/view/Admin/Manage_branches_form.fxml"));
            pane2.getChildren().removeAll();

            pane2.getChildren().setAll(fxml);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void btnTransactionOnAction(ActionEvent event) {
        Parent fxml = null;
        try {
            fxml = FXMLLoader.load(getClass().getResource("/view/Admin/All_Transaction_history_form.fxml"));
            pane2.getChildren().removeAll();

            pane2.getChildren().setAll(fxml);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @FXML
    void imgExitOnAction(MouseEvent event) {

    }

    @FXML
    void imgProfileOnAction(MouseEvent event) {
        Parent fxml = null;
        try {
            fxml = FXMLLoader.load(getClass().getResource("/view/Admin/Admin_profile_form.fxml"));
            pane2.getChildren().removeAll();

            pane2.getChildren().setAll(fxml);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void dashboardOnAction(ActionEvent actionEvent) {

        AnchorPane anchorPane = null;
        try {
            anchorPane = FXMLLoader.load(getClass().getResource("/view/Admin/Admin_dashboard-form.fxml"));
            Scene scene = new Scene(anchorPane);
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
