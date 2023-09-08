import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {



        String link = "https://api.zippopotam.us/us/33162";



        URL Link = new URL(link);

        HttpURLConnection conn = (HttpURLConnection) Link.openConnection();
        int response = conn.getResponseCode();
        if(response == 200){


            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder apiData = new StringBuilder();
            String readLine = null;


            while ((readLine = br.readLine()) != null)
                apiData.append(readLine);



            br.close();

            JSONObject JsonOpt = new JSONObject(apiData.toString());
            System.out.println("Api has been called using JAVA");
            System.out.println("      |      ");
            System.out.println("      |      ");

            System.out.println("      v      ");
            System.out.println(JsonOpt);
        }
        else System.out.println("Internal error");


    }

}