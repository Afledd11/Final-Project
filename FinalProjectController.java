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
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import java.util.ResourceBundle;
import java.util.Date;
import java.util.prefs.Preferences;
import java.text.SimpleDateFormat;
import javafx.application.Platform;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

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
      
     //Add FXML above textfield
      //HBox and TextField declarations
      @FXML 
      private HBox pointsPerGame;
      @FXML 
      private TextField pointsPerGameText;
      
      @FXML 
      private HBox reboundsPerGame;
      @FXML 
      private TextField reboundsPerGameText;
      
      @FXML 
      private HBox assistsPerGame;
      @FXML 
      private TextField assistsPerGameText;
      
      @FXML 
      private HBox blocksPerGame;
      @FXML 
      private TextField blocksPerGameText;
      
      @FXML 
      private HBox stealsPerGame;
      @FXML 
      private TextField stealsPerGameText;
      
      @FXML 
      private HBox fieldGoalPercent;
      @FXML 
      private TextField fieldGoalPercentText;
      
      @FXML 
      private HBox threePointPercent;
      @FXML 
      private TextField threePointPercentText;
      
      @FXML 
      private HBox freeThrowPercent;
      @FXML 
      private TextField freeThrowPercentText;
      
      
      //Methods to control Buttons
      @FXML
      public void exitButtonOperation (ActionEvent event)
      {
         System.exit(0);
      }
      
      
   //-------------- Curry Stuff   
      
     private final HttpClient client = HttpClient.newHttpClient();
     
      public void processStatsData(String data) 
      {
         Gson gson = new Gson();
         
         try {

        this.APIData = gson.fromJson(data, APIData.class);      
      } catch (Exception e) {
         System.out.println("GSON Parsing Failed");
         return;
      }  
         Platform.runLater( new Runnable() {
                           public void run() {
                              updateUI();
                           }
                        });   
      }
      
      public void updateUI()
      {
     //if statement saying that API Data is not null
         pointsPerGameText.setText("20"); 
        /*
         reboundsPerGameText.setText();
         assistsPerGameText();
         blocksPerGameText();
         stealsPerGameText();
         fieldGoalPercentText();
         threePointPercentText();
         freeThrowPercentText();
        */
              
      }
      
      
      @FXML
      public void stephenCurryOperation (ActionEvent event)
      {
       try
       {
       HttpRequest request = HttpRequest.newBuilder()
               .uri(new URI("https://www.balldontlie.io/api/v1/season_averages?player_ids[]=115"))
               .GET()
               .build();
               
               client.sendAsync(request, BodyHandlers.ofString())
                 .thenApply(HttpResponse::body)
                 .thenAccept(this::processStatsData);        

         
         } catch(URISyntaxException e) 
          { 
            System.out.println("Sorry, we are experiencing a network issue right now.");
          }

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

      
     
            }

  
