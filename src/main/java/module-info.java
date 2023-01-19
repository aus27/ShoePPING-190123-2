module com.example.shoepping {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shoepping to javafx.fxml;
    exports com.example.shoepping;
}