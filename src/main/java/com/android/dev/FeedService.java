package com.android.dev;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

@Path("/WebService")
public class FeedService {

	@GET
	@Path("/GetFeeds")
	@Produces("application/json")
	public String feed() {
		String feeds = null;
		try {

			List<FeedObjects> feedObjects = new ArrayList<FeedObjects>();
			FeedObjects feedObejct1 = new FeedObjects.Builder().title("title1").description("desc1").build();
			FeedObjects feedObejct2 = new FeedObjects.Builder().title("title2").description("desc2").build();

			feedObjects.add(feedObejct1);
			feedObjects.add(feedObejct2);

			Gson gson = new Gson();
			System.out.println(gson.toJson(feedObjects));

			feeds = gson.toJson(feedObjects);
		}

		catch (Exception e) {
			System.out.println("Exception Error"); // Console
		}
		return feeds;
	}
	
	
	public double add(double a, double b){
		return a+b;
				
	}

}