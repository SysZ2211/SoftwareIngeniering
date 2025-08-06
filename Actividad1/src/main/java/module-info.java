module co.edu.poli.Actividad1.vista {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.poli.Actividad1.vista to javafx.fxml;
    exports co.edu.poli.Actividad1.vista;
}
