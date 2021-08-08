package xyz.matthewtgm.mango;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class APIs {

    /**
     * Fetches a string from the internet.
     *
     * @param url The url to fetch from.
     * @return The string fetched.
     */
    public static String get(URL url) {
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setUseCaches(false);
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK)
                return IO.toString(conn.getInputStream());
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Fetches a string from the internet.
     *
     * @param uri The url to fetch from.
     * @return The string fetched.
     */
    public static String get(URI uri) {
        try {
            return get(uri.toURL());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Fetches a string from the internet.
     *
     * @param url The url to fetch from.
     * @return The string fetched.
     */
    public static String get(String url) {
        try {
            return get(new URL(url));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}