import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class FinalProjectMain extends Application
{

   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage stage) throws Exception
   {
    // Load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
    // Set up the scene    
        Scene scene = new Scene(root); 
        
        stage.setTitle("NBA Stat Tracker"); 
        stage.setScene(scene);
        stage.show(); 
   }
}
