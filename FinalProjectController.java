import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.application.Platform;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.HttpURLConnection;
import java.net.URL;

public class FinalProjectController
{

      //Button variable declarations
      @FXML
      private Button exit;
      
      @FXML 
      private Button stephenCurry;
      
      @FXML 
      private Button jimmyButler;
      
      @FXML 
      private Button leBronJames;
      
      @FXML 
      private Button joelEmbiid;
      
      @FXML 
      private Button nikolaJokic;
      
      @FXML 
      private Button random;
      
      //HBox and TextField declarations
      @FXML 
      private HBox pointsPerGame;
      private TextField pointsPerGameText;
      
      @FXML 
      private HBox reboundsPerGame;
      private TextField reboundsPerGameText;
      
      @FXML 
      private HBox assistsPerGame;
      private TextField assistsPerGameText;
      
      @FXML 
      private HBox blocksPerGame;
      private TextField blocksPerGameText;
      
      @FXML 
      private HBox stealsPerGame;
      private TextField stealsPerGameText;
      
      @FXML 
      private HBox fieldGoalPercent;
      private TextField fieldGoalPercentText;
      
      @FXML 
      private HBox threePointPercent;
      private TextField threePointPercentText;
      
      @FXML 
      private HBox freeThrowPercent;
      private TextField freeThrowPercentText;
      
      
      //Methods to control Buttons
      @FXML
      public void exitButtonOperation (ActionEvent event)
      {
         System.exit(0);
      }
      
      @FXML
      public void stephenCurryOperation (ActionEvent event)
      {
       
       
      }       
      @FXML
      public void jimmyButlerOperation (ActionEvent event)
      {
      
      }
      
      @FXML
      public void leBronJamesOperation (ActionEvent event)
      {
      
      }
      
      @FXML
      public void joelEmbiidOperation (ActionEvent event)
      {
      
      }

      @FXML
      public void nikolaJokicOperation (ActionEvent event)
      {
      
      
      
      }

      @FXML
      public void randomOperation (ActionEvent event)
      {
      
      }

      
     
      //Method to Steph Curry call
      public void curryAPIData (String curryURL)
      {
      /*
       try 
       {
          URL url =  new URL (curryURL);
          HttpURLConnection connection = (HttpURLConnection) url.openConnection();
          
         int responseCode = connection.getResponseCode();
         
         System.out.println("API Response:\n" + response.toString());
         
         // Close the connection
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }

      */
      }

  
}