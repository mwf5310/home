import org.junit.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class post1 {
	
	@Test
	public void gettest(){
		
		
		//given().param("user[login]", "test@qq.com").param("user[password]", "111111").param("user[remember_me]", 0)
		//.post("https://testerhome.com/account/sign_in").prettyPeek();	
		
		//given().param("user[login]","test@qq.com","user[password]","111111","user[remember_me]", 0)
		//.post("https://testerhome.com/account/sign_in").prettyPeek();	
		
		
		given().param("login","test@qq.com","password","111111","remember_me", 0)
		.post("https://testerhome.com/account/sign_in").prettyPeek();	
		
		//这三种post 的请求都是可以的
		//Map<String,Object> map=new HashMap<String,Object>();
		//map.put("limit", "6");
		//map.put("offset", "2");
		//map.put("type", "last_actived");
		
				
		//given().params(map).get("https://testerhome.com/api/v3/topics.json").prettyPeek();
	}
//prettyPeek(); 打印响应结果
	public static void main(String[] args) {
		
		}

	

}
