import org.junit.Test;
import static io.restassured.RestAssured.*;

public class test2 {
	
	@Test
	public void gettest(){
		get("https://testerhome.com/api/v3/topics.json?limit=2&offset=0&type=last_actived").prettyPeek();
	}
//prettyPeek(); 打印响应结果
	public static void main(String[] args) {
		
		}

	

}
