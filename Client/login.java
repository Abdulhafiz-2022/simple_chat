package Client;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
public class loginpage {
    @FXML public TextField server_ip;
    @FXML public TextField port;
    @FXML public TextField name;
    @FXML public String sPort;
public void onClick() throws IOException{

        System.out.println("Clicked");
        data.ip = server_ip.getText();
        this.sPort = port.getText();
        data.name = name.getText();
        data.port = Integer.parseInt(sPort);