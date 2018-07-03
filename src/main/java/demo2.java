
import org.junit.Test;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class demo2{
	
	@Test
	public void gettest(){
		/*
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("login", "test@qq.com");
		map.put("remember_me", "0");
			
		
		given().params(map)
		.post("https://testerhome.com/account/sign_in").prettyPeek();	
		
		*/
		//given().body("{ \"message\" : \"hello world\"}").get("https://testerhome.com/api/v3/topics.json").prettyPeek();
		
		File file=new File("C:\\Users\\Atum\\workspace\\Test\\src\\mylib\\sixth\\WriteFile.txt");
		given().body(file).get("https://testerhome.com/api/v3/topics.json").prettyPeek();
		
	}
}


