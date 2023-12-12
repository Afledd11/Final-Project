import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Platform;
import com.google.gson.Gson;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;

public class FinalProjectController 
{
     //Field declaration for API processing method below
     private APIData aPIData;
     
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
      
      //Label declarations
      @FXML 
      private Label pointsPerGameText;
      
      @FXML 
      private Label reboundsPerGameText;
      
      @FXML 
      private Label assistsPerGameText;
      
      @FXML 
      private Label blocksPerGameText;
      
      @FXML 
      private Label stealsPerGameText;
      
      @FXML 
      private Label fieldGoalPercentText;
      
      @FXML 
      private Label threePointPercentText;
      
      @FXML 
      private Label freeThrowPercentText;
                 
   //Repeated Methods Below, used for all players  
      
     private final HttpClient client = HttpClient.newHttpClient();
     
      public void processStatsData(String data) 
      {
         Gson gson = new Gson();
         try {
        this.aPIData = gson.fromJson(data, APIData.class);      
      } catch (Exception e) {
         System.out.println("GSON Parsing Failed");
         return;
      }  
         Platform.runLater( new Runnable()
          {
            public void run() 
            {
               updateUI();
            }
          });   
      }
   
   public void updateUI() {
    if (this.aPIData != null && this.aPIData.data != null && this.aPIData.data.length > 0) {
        PlayerStats playerStats = this.aPIData.data[0];

        double pointsPerGameValue = playerStats.pts;
        pointsPerGameText.setText(String.valueOf(pointsPerGameValue));
        
        double reboundsPerGameValue = playerStats.reb;
        reboundsPerGameText.setText(String.valueOf(reboundsPerGameValue));
        
        double assistsPerGameValue = playerStats.ast;
        assistsPerGameText.setText(String.valueOf(assistsPerGameValue));
        
        double blocksPerGameValue = playerStats.blk;
        blocksPerGameText.setText(String.valueOf(blocksPerGameValue));
        
        double stealsPerGameValue = playerStats.stl;
        stealsPerGameText.setText(String.valueOf(stealsPerGameValue));
        
        double fieldGoalPercentValue = playerStats.fg_pct * 100;
        fieldGoalPercentText.setText(String.valueOf(fieldGoalPercentValue));
      
        double threePointPercentValue = playerStats.fg3_pct * 100;
        threePointPercentText.setText(String.valueOf(threePointPercentValue));
        
        double freeThrowPercentValue = playerStats.ft_pct * 100;
        freeThrowPercentText.setText(String.valueOf(freeThrowPercentValue));
    }
}  
      //Repeated Methods, used for all players ^^^^
      
      //Methods for control Buttons
      @FXML
      public void exitButtonOperation (ActionEvent event)
      {
         System.exit(0);
      }
    
      @FXML
      public void stephenCurryOperation (ActionEvent event) //ID = 115
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
      public void jimmyButlerOperation (ActionEvent event) //ID = 79      
      {
       try
       {
       HttpRequest request = HttpRequest.newBuilder()
               .uri(new URI("https://www.balldontlie.io/api/v1/season_averages?player_ids[]=79"))
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
      public void leBronJamesOperation (ActionEvent event) //ID = 237
      {
      try
       {
       HttpRequest request = HttpRequest.newBuilder()
               .uri(new URI("https://www.balldontlie.io/api/v1/season_averages?player_ids[]=237"))
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
      public void joelEmbiidOperation (ActionEvent event) //ID = 145
      {
       try
       {
       HttpRequest request = HttpRequest.newBuilder()
               .uri(new URI("https://www.balldontlie.io/api/v1/season_averages?player_ids[]=145"))
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
      public void nikolaJokicOperation (ActionEvent event) //ID = 246
      {
       try
       {
       HttpRequest request = HttpRequest.newBuilder()
               .uri(new URI("https://www.balldontlie.io/api/v1/season_averages?player_ids[]=246"))
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
      public void randomOperation (ActionEvent event)
      {
        try
       {
       Random random = new Random();
       
       int randomCode = random.nextInt(101) + 100;
       HttpRequest request = HttpRequest.newBuilder()
               .uri(new URI("https://www.balldontlie.io/api/v1/season_averages?player_ids[]=" + randomCode))
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
}
