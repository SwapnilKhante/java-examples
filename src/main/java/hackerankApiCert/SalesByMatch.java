package hackerankApiCert;

import java.util.List;

/**
 * Created by SK on 6/8/2022
 **/
public class SalesByMatch {

  public static int sockMerchant(int n, List <Integer> ar) {
    // Write your code here

    int count = 0;
    ar.sort(null);

    int i = 0;
    while(i < ar.size() - 1) {
      if (ar.get(i) == ar.get(i+1)) {

        i+=2;
        count++;
      } else {
        i++;
      }
    }

    return count;

  }
}
