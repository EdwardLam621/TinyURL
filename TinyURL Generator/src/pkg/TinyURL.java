package pkg;

import java.util.HashMap;
import java.util.Random;

public class TinyURL {


     private String prefix = "http://tiny.url/";
     private HashMap<String, String> longToShortMap = new HashMap<>();
     private HashMap<String, String> shortToLongMap = new HashMap<>();
     private String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
     private String error = "Error Message!";
     
     /*
      * @param url: a long url
      * @return: a short url starts with http://tiny.url/
      */
     public String longToShort (String url) {
    	 if (longToShortMap.containsKey(url)) {
    		 return longToShortMap.get(url);
    	 }
    	 String shortURL = generateShortURL();
    	 longToShortMap.put(url, shortURL);
    	 shortToLongMap.put(shortURL,url);
    	 return shortURL;
     }
     
     /*
      * @param url: a short url
      * @return: a long url that represent to the shortURL
      */
     public String shortToLong (String url) {
    	 if (longToShortMap.containsKey(url)) {
    		 return longToShortMap.get(url);
    	 }
    	 return error;
     }
     

     private String generateShortURL() {
    	 Random r = new Random();
    	 StringBuilder sb = new StringBuilder();
    	 
    	 while (true) {
    		 int count = 6;
    		 while (count > 0) {
    			 sb.append(chars.charAt(r.nextInt(chars.length())));
    			 count--;
    		 }
    		 String shortURL = prefix + sb.toString();
    		 if(shortToLongMap.containsKey(shortURL)) {
    			 sb = new StringBuilder();
    		 } else {
    			 return shortURL;
    		 }
    	 }
     }
     
     private String createCustomShortURL(String longURL, String key) {
    	 if (longToShortMap.containsKey(longURL)) {
    		 if(!longToShortMap.get(longURL).equals(prefix + key)) {
    			 return error;
    		 }
    		 return longToShortMap.get(longURL);
    	 }
    	 String shortURL = prefix + key;
    	 if(shortToLongMap.containsKey(shortURL)) {
    		 return error;
    	 }
    	 shortToLongMap.put(shortURL, longURL);
    	 longToShortMap.put(longURL, shortURL);
    	 return shortURL;
     }

}
