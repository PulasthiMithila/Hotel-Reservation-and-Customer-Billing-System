/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import dao.RoomDao;
import udobject.MyObject;
import entity.Room;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Tharana
 */
public class RoomAvailabilityUIController implements Initializable {

    @FXML
    private TableView<MyObject> tblEmployee;
    @FXML
    private TableColumn<MyObject, String> col1;
    @FXML
    private TableColumn<MyObject, String> col2;
    @FXML
    private TableColumn<MyObject, String> col3;
    @FXML
    private TableColumn<MyObject, String> col4;
    @FXML
    private TableColumn<MyObject, String> col5;
    @FXML
    private TableColumn<MyObject, String> col6;
    @FXML
    private TableColumn<MyObject, String> col7;
    @FXML
    private TableColumn<MyObject, String> col8;
    @FXML
    private TableColumn<MyObject, String> col9;
    @FXML
    private TableColumn<MyObject, String> col10;
    @FXML
    private TableColumn<MyObject, String> col11;
    @FXML
    private TableColumn<MyObject, String> col12;
    @FXML
    private TableColumn<MyObject, String> col13;
    @FXML
    private TableColumn<MyObject, String> col14;
    @FXML
    private TableColumn<MyObject, String> col15;
    @FXML
    private TableColumn<MyObject, String> col16;
    @FXML
    private TableColumn<MyObject, String> col17;
    @FXML
    private TableColumn<MyObject, String> col18;
    @FXML
    private TableColumn<MyObject, String> col19;
    @FXML
    private TableColumn<MyObject, String> col20;
    @FXML
    private TableColumn<MyObject, String> col21;
    @FXML
    private TableColumn<MyObject, String> col22;
    @FXML
    private TableColumn<MyObject, String> col23;
    @FXML
    private TableColumn<MyObject, String> col24;
    @FXML
    private TableColumn<MyObject, String> col25;
    @FXML
    private TableColumn<MyObject, String> col26;
    @FXML
    private TableColumn<MyObject, String> col27;
    @FXML
    private TableColumn<MyObject, String> col28;
    @FXML
    private TableColumn<MyObject, String> col29;
    @FXML
    private TableColumn<MyObject, String> col30;
    @FXML
    private TableColumn<MyObject, String> col31;
    @FXML
    private TableColumn<MyObject, Room> colRoom;
    @FXML
    private JFXDatePicker dtpSearchFrom;
    @FXML
    private JFXDatePicker dtpSearchTo;
    @FXML
    private JFXButton btnSearch;
    @FXML
    private JFXButton btnClear;

    /**
     * Initializes the controller class.
     */


    @FXML
    private void btnClearAP(ActionEvent event) {
    }
}