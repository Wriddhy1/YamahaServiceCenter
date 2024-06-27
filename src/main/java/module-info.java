module com.oop.tableviewyamahaservicecenter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.tableviewyamahaservicecenter to javafx.fxml;
    exports com.oop.tableviewyamahaservicecenter;
}