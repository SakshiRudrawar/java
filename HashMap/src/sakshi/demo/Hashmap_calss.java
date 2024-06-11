package sakshi.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Hashmap_calss {

	public static void main(String[] args) 
	{
		Map<String ,String> movie = new HashMap<>();
		//movie.put(null, null);
		movie.put("movieName" , "Airlift");
		movie.put("Director" , "Virat");
		movie.put("leadActor" , "Akshay Kumar");
		movie.put("Rating" , "4.8");
		movie.put("movieName" , "Xyz movie");
		
		System.out.println(movie.get("movieName"));
		System.out.println(movie.get("Director"));
		System.out.println(movie.get("Rating"));	
		
		
	}

}
