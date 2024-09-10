import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.net.*;

class ExceptionHandling {  
  public static void main (String[] args) { 
    System.setProperty("http.agent", "Chrome");
    try { 
      URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
      URLConnection connection = url.openConnection();
      try (
        InputStream inputStream = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))
      ) {
        StringBuilder responseBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
          responseBuilder.append(line);
        }
        String response = responseBuilder.toString();
        String data = response.replaceAll(".*\"data\":\"(.*?)\".*", "$1");
        int count = 0;
        Pattern pattern = Pattern.compile("age=(\\d+)");
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
          int age = Integer.parseInt(matcher.group(1));
          if (age >= 50) {
            count++;
          }
        }
        System.out.println(count);
      }
    } catch (MalformedURLException malEx) {
      System.out.println("MalformedURLException: " + malEx.getMessage());
    } catch (IOException ioEx) {
      System.out.println("IOException: " + ioEx.getMessage());
    }
  }
}
