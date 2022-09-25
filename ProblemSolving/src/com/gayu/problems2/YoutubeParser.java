package com.gayu.problems2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Given a YouTube URL, extract the video ID and return it as a string.
Example - 
youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg") ➞ "XPEr1cArWRg"
youtubeId("https://youtu.be/BCDEDi5gDPo") ➞ "BCDEDi5gDPo"
 * */
public class YoutubeParser {
	String youtubeURL;
	String pattern = "(?<=watch\\?v=|/videos/|embed\\/|youtu.be\\/|\\/v\\/|watch\\?v%3D|%2Fvideos%2F|embed%2F|youtu.be%2F|%2Fv%2F)[^#\\&\\?\\n]*";

	YoutubeParser(String youtubeURL) {
		this.youtubeURL = youtubeURL;

	}

	String parseYoutubeURL() {
		String id = "";
		try {
			URL url = new URL(this.youtubeURL);
			String query = url.getQuery();
			if ( query!=null) {
				id = query.split("=")[1];
			}
			else {
				id = url.getFile().substring(1);
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}
	
	String parseYoutubeURLwithRegEx() {
		
	    
	    Pattern compiledPattern = Pattern.compile(this.pattern);
	    Matcher matcher = compiledPattern.matcher(this.youtubeURL);

	    if(matcher.find()){
	        return matcher.group();
	    }
	    return null;
	}

	public static void main(String[] args) {
		String youTubeURL = "https://www.youtube.com/watch?v=XPEr1cArWRg";
		 youTubeURL= "https://www.youtube.com/XPEr1cArWRg";	
		YoutubeParser obj1 = new YoutubeParser(youTubeURL);
		String id =  obj1.parseYoutubeURL();
		id = obj1.parseYoutubeURLwithRegEx();
		System.out.println("ID  of youtube URL  "+youTubeURL+ " is '"+id+"'");
		
	}
}
