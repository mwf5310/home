import org.junit.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class test2_2 {
	
	@Test
	public void gettest(){
		//https://testerhome.com/api/v3/topics.json?limit=2&offset=0&type=last_actived		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("topics", "topics");
		map.put("topicid", 12192);
		
		
				
		//given().params(map).get("https://testerhome.com/{topics}/{topicid}").prettyPeek();
		get("https://testerhome.com/{topics}/{topicid}",map).prettyPeek();
	}
//prettyPeek(); ��ӡ��Ӧ���
	public static void main(String[] args) {
		
		}

	

}
