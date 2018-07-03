import org.junit.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class demo4 {
	
	@Test
	public void gettest(){
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("login", "test@qq.com");
		map.put("remember_me", "0");
			
		
		given().params(map)
		.post("https://testerhome.com/account/sign_in").prettyPeek();	
		
		
	}
}
