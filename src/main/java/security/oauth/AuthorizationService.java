/*
package security.oauth;

import com.amazonaws.lambda.thirdparty.org.json.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Base64;
import java.util.Date;

import static cris.SiltsProperties.*;

public class AuthorizationService {

  private static final String AUTH_HEADER = "Basic " + new String(Base64.getEncoder()
          .encode((CONSUMER_KEY + ":" + CONSUMER_SECRET).getBytes()));
  private static final Logger LOG = LoggerFactory.getLogger(AuthorizationService.class);

  private static String ACCESS_TOKEN;

  public static String getAuthToken() {

    if (validateToken(ACCESS_TOKEN)) {
      return ACCESS_TOKEN;
    }
    LOG.warn("Token Expired! Fetching new token");
    HttpPost post = new HttpPost(AUTH_SERVICE_ENDPOINT);
    post.setHeader("Authorization", AUTH_HEADER);
    try (CloseableHttpClient httpClient = HttpClients.createDefault();
         CloseableHttpResponse response = httpClient.execute(post)) {
      String result = EntityUtils.toString(response.getEntity());
      JSONObject jsonObject = new JSONObject(result);
      ACCESS_TOKEN = jsonObject.getString("access_token");
      return ACCESS_TOKEN;
    } catch (IOException e) {
      LOG.error("Error occurred while fetching Authorization token : {} , {} ", e.getCause(), e.getMessage());
    }
    return null;
  }

  private static Boolean validateToken(String token) {
    if (token != null) {
      try {
        DecodedJWT jwt = JWT.decode(token);
        long currentTime = new Date().getTime();
        long tokenExpireTime = jwt.getExpiresAt().getTime();
        return tokenExpireTime > currentTime;
      } catch (JWTVerificationException e) {
        LOG.error("Invalid token : {} , {} ", e.getCause(), e.getMessage());
        return false;
      }
    }
    return false;
  }
}
*/
