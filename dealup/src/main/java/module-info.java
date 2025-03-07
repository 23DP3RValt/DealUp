module lv.rvt {
    requires javafx.controls;
    requires javafx.fxml;

    opens lv.rvt to javafx.fxml;
    exports lv.rvt;
}
