import org.junit.Test;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
public class cookies_head {
	
	
	@Test
	public void setcookies() {
	
		File file=new File("C:\\Users\\Atum\\workspace\\Test\\src\\mylib\\sixth\\WriteFile.txt");
		//given().cookie("username", "xushizaho").get("https://testerhome.com/topics/12192").prettyPeek();
		
		given().cookie("username", "xushizaho8899").get("https://testerhome.com/account/sign_in").prettyPeek();
		//"https://testerhome.com/account/sign_in"
		given().header("username", "xushizaho").get("https://testerhome.com/account/sign_in").prettyPeek();
		given().urlEncodingEnabled(false).param("user","ÉçÇø").param("pass","111111").get("https://testerhome.com/account/sign_in");
        given().multiPart(file).post("https://testerhome.com/account/sign_in");
        
	
		
			
		}

	}


