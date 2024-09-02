package com.mts.onlineReplenishment;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public class Link {
    public int getHttpResponseCode(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        return connection.getResponseCode();
    }
}
