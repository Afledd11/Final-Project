//Import statements all look good, they match the DemoMain file

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

/* NOTES:
   - Our fx ID's for the 8 hboxes that are going to hold each player's stats are named as if they were 
   a Java variable. For example, the first hbox is named "pointsPerGame", so on and so forth. Also the 
   numbers and percent signs are spelled out in full word form.
   - Our six player hboxes fx ID's are just the player names, "stephCurry" and so on
 */  
