import org.junit.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class test2_1 {
	
	@Test
	public void gettest(){
		//https://testerhome.com/api/v3/topics.json?limit=2&offset=0&type=last_actived		
		/*
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("limit", "6");
		map.put("offset", "2");
		map.put("type", "last_actived");
		
				
		given().params(map).get("https://testerhome.com/api/v3/topics.json").prettyPeek();
	}
	*/
	
given().params("limit", 6,"offset", 2,"type", "last_actived")
.get("https://testerhome.com/api/v3/topics.json").prettyPeek();
	}
//prettyPeek(); 打印响应结果
	public static void main(String[] args) {
		
		}

	

}
