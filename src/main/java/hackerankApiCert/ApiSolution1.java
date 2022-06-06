package hackerankApiCert;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


class Result {

  private String footballScoreApi = "https://jsonmock.hackerrank.com/api/football_matches";

  /*
   * Complete the 'getNumDraws' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER year as parameter.
   */

  public static int getNumDraws(int year) throws IOException {

    CloseableHttpClient httpClient = HttpClients.createDefault();
    int total = 0;
    CloseableHttpResponse response = null;
    try {
      int maxNoOfGoals = 11;

      for (int i= 0; i<=maxNoOfGoals; i++ ) {
        HttpGet request = new HttpGet("https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&team1goals="+i+"&team2goals="+i);
        response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
          String result = EntityUtils.toString(entity);
          Gson gson = new Gson();
          JsonElement element = gson.fromJson(result, JsonElement.class);
          JsonObject jsonObj = element.getAsJsonObject();
          System.out.println(jsonObj);
          total += jsonObj.get("total").getAsInt();
        }
      }
    } catch (ClientProtocolException ex) {
      ex.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        response.close();
      } catch (IOException e) {
        e.printStackTrace();
      } finally {
        httpClient.close();
      }
    }
    return total;
  }
}

public class ApiSolution1 {
  public static void main(String[] args) throws IOException {
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int year = 2011;

    int result = Result.getNumDraws(year);
    System.out.println(result);

//    bufferedWriter.write(String.valueOf(result));
//    bufferedWriter.newLine();
//
//    bufferedReader.close();
//    bufferedWriter.close();
  }
}
