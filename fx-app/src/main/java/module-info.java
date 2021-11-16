module io.github.shirohoo.fx {
    requires javafx.controls;
    requires javafx.fxml;

    opens io.github.shirohoo.fx to javafx.fxml;
    exports io.github.shirohoo.fx;
}
