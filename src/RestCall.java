import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
public class RestCall {


    public static void main(String[] args) throws MalformedURLException, IOException {

        URL url = new URL("https://www.metaweather.com/api/location/search?query=san");
        HttpURLConnection conn =(HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String output;
        while((output=br.readLine() )!=null){
            System.out.println(output);
        }
      conn.disconnect();
    }
}
