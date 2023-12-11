import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class NikolaJokic
{
   public static void main(String[] args) throws Exception
   {
  
   //How I would call to the API
   //URL url = new URL("https://www.balldontlie.io/api/v1/season_averages?player_ids[]=(whatever player's number is)");
      //In this case, Jokic's number is 246

   
   //String data Example for Nikola Jokic from the API Call:
   String data = """
            {
              "data": [
                {
                  "games_played": 20,
                  "player_id": 246,
                  "season": 2023,
                  "min": "33:57",
                  "fgm": 11.35,
                  "fga": 20,
                  "fg3m": 1.25,
                  "fg3a": 4.15,
                  "ftm": 5,
                  "fta": 6.4,
                  "oreb": 3.25,
                  "dreb": 9.5,
                  "reb": 12.75,
                  "ast": 9.8,
                  "stl": 1.1,
                  "blk": 0.8,
                  "turnover": 2.9,
                  "pf": 2.55,
                  "pts": 28.95,
                  "fg_pct": 0.568,
                  "fg3_pct": 0.301,
                  "ft_pct": 0.781
                }
              ]
            }
                 """
            ;

      Gson gson = new Gson();      
      APIdata x = gson.fromJson(data, APIdata.class); 
   }
} 