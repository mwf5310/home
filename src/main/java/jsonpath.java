import org.junit.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
public class jsonpath {
	
	
	@Test
	
	public void gettest(){
		/*
	List<Object> list = get("https://testerhome.com/api/v3/topics.json?limit=2&offset=0&type=last_actived")
	.jsonPath().getList("topics");
	
    System.out.println(list.size());
    //System.out.println(response.jsonPath().getString("topics[0].id"));
    System.out.println(list);
    */
		
		
		
		
		
		
		
    
	}
}

	/*	
		Response response=get("https://testerhome.com/api/v3/topics.json?limit=2&offset=0&type=last_actived");

		List<Object> list=response.jsonPath().getList("topics");
		//System.out.println(list.size());
		 //System.out.println(list);
		System.out.println(response.jsonPath().getString("topics[0].id"));
		System.out.println(response.jsonPath().getString("topics[0].title"));
		System.out.println(response.jsonPath().getString("topics[0].created_at"));
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		

	}

}
*/
