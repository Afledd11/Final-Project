import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StephCurry
{
 //URL url = new URL("https://www.balldontlie.io/api/v1/season_averages?player_ids[]=115");

   //String data from Curry's API call
   String data = """
         {
  "data": [
    {
      "games_played": 20,
      "player_id": 115,
      "season": 2023,
      "min": "33:48",
      "fgm": 8.95,
      "fga": 18.8,
      "fg3m": 5.1,
      "fg3a": 11.75,
      "ftm": 6.4,
      "fta": 6.85,
      "oreb": 0.7,
      "dreb": 4.3,
      "reb": 5,
      "ast": 4.4,
      "stl": 0.7,
      "blk": 0.2,
      "turnover": 3.5,
      "pf": 1.7,
      "pts": 29.4,
      "fg_pct": 0.476,
      "fg3_pct": 0.434,
      "ft_pct": 0.934
    }
  ]
}                   """;

   Gson gson = new Gson();      
   APIdata x = gson.fromJson(data, APIdata.class); 
   

}