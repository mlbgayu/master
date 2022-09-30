package com.gayu.problems1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

public class YoutubeURL {
	
	String youtubeURL;
	
	YoutubeURL(String youtubeURL) {
		this.youtubeURL = youtubeURL;

	}
	
	
	String youtubeParse() {
		String id = "";

		try {
			URL url = new URL(this.youtubeURL);
			String query = url.getQuery();
			
			if (query != null) {
				id = query.split("=")[1];
			} else {
				id = url.getFile().substring(1);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();

		}
		return id;
	}

	public static void main(String[] args) {
		// String youtubeParse= "https://www.youtube.com/watch?v=ZqFq__vsVEc&t=258s";
		String youtubeParse = "https://www.youtube.com/XPEr1cArWRg";
		YoutubeURL url = new YoutubeURL(youtubeParse);
		String id = url.youtubeParse();
		System.out.println(id);

	}

}
