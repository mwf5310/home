import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import static io.restassured.module.jsv.JsonSchemaValidator.*;



	
	
public class assert1 {
	
	@BeforeClass
	public static void setup(){
		useRelaxedHTTPSValidation();//宽松的校验，信任所有https，降低安全机制
        RestAssured.baseURI="https://testerhome.com";
		//RestAssured.proxy("127.0.0.1",8080);
        
        
		
	}
	
	//@Test
	public static class test1{
	public static void testSpec1(){
		
		ResponseSpecification rs=new ResponseSpecBuilder().build();
		
		    rs.statusCode(200);
		    rs.body(not(containsString("error")));
		    rs.time(lessThan(9L));
		given().get("/api/v3/topics/6040.json")
		.then().spec(rs);
	
	}
	}
	
	@Test
	
	public void testassert(){
		
		//given().queryParam(parameterName:"q",...parameterValues:"appium")
		given().queryParam("q","appium")
		.when().get("https://testerhome.com/search").prettyPeek()
		.then()
		   .statusCode(200)
		
		   .body("html.head.title", equalTo("appium · 搜索结果 · TesterHome"));
		test1.testSpec1();
		
		
	}
	@Test
	public void testerhomeJsonSingle(){
		given()
		  .proxy(  "127.0.0.1",8080)//局部变量
		  .when().get("https://testerhome.com/api/v3/topics.json").prettyPeek()
		  .then()
		   .statusCode(200)
		  
		   .body("topics.title", hasItems("我们是否应该开展 UI 自动化测试"))
		  //.body("topics.title[2]",equalTo("持续交付实战"))
		 //  .body("topics.id[-1]",equalTo(14812))
		 //  .body("topics.findAll {topic->topic.id==10254}.title",hasItems("优质招聘汇总"))
		   
		   ;
		
	}

	
	/*
    <shopping>
<category type="groceries">
<item>
<name>Chocolate</name>
<price>10</price>
</item>
<item>
<name>Coffee</name>
<price>20</price>   //使用 it.price==200 语句
</item>
</category>
<category type="supplies">   //使用 it.@type=='present'语句
<item>
<name>Paper</name>
<price>5</price>
</item>
<item quantity="4">
<name>Pens</name>
<price>15</price>//
</item>
</category>
<category type="present">
<item when="Aug 10">
<name>Kathryn's Birthday</name>
<price>200</price>
</item>
</category>
</shopping>

     */
    
   /* @Test
public void testXML(){
//given().when().get("http://127.0.0.1:8000"/hogwarts.xml).prettyPeek()
//1Response response=given().given().when().get("http://127.0.0.1:8000"/hogwarts.xml).prettyPeek()
  //2String name=  given().when().get("http://127.0.0.1:8000"/hogwarts.xml).prettyPeek()  

     .then()
          .statusCode(200)
          .body("shopping.category.item.name[2]",equalTo("paper"))
          .body("shopping.category.find{it.@type=='present'}.item.name",equalTo(""))
          //@后面接的是属性
          .body("shopping.category.find{it.@type=='present'}.item.name",equalTo(""))
          .body("**.find{it.price==200}.name",equalTo(""))
          //1.extract().response()
          //1System.out.println(response.statusLine());
          //2.extract().path("shopping.category.item.name[2]")
          //System.out.println(name)
          //查找某一属性，it代表自身的属性
          
          ;
}
*/
	
	@Test
	public void testerhomeJsonGlobal(){
		given().when().get("https://testerhome.com/api/v3/topics.json").prettyPeek()
		.then()
		   .statusCode(200)
		  
		   .body("topics.title", hasItems("我们是否应该开展 UI 自动化测试"))
		  //.body("topics.title[2]",equalTo("我们是否应该开展 UI 自动化测试"))
		  
		  
		  
;
		test1.testSpec1();
}
	
	@Test
	public void testJsonPost(){
		HashMap<String,Object> data=new HashMap<String,Object>();
		data.put("id", 6048);
		data.put("title","接口测试进阶");
		data.put("name", "seasky");
	given()
	 //  .proxy(  "127.0.0.1",8080)
	   .contentType(ContentType.JSON)
	   .body(data)
	.when()
	    .post("http://www.baidu.com")
	    .then()
	       .statusCode(302)
	       
	      // .time(lessThan( 50L))
	   
	   
	   
	   ;
	}
	
	@Test
	public void multiApi(){
		String name=given().get("https://testerhome.com/api/v3/topics/6040.json").prettyPeek()
		.then().statusCode(200).extract().path("topic.user.name")
		
			;
		System.out.println("name8888="+name);
		
		given().queryParam("q",name)
		    .when().get("/search")//网址的前半部分来自全局变量设定 https://testerhome.com
		    .then().statusCode(200).body(containsString(name))
		    
		    ;

}
	@Test
	public void multiData(){
		Response response=given().get("https://testerhome.com/api/v3/topics/6040.json").prettyPeek()
		.then()
		    .statusCode(200)
		    .extract().response();
		String name=response.path("topic.user.name");
		Integer uid=response.path("topic.user.id");
			;
		System.out.println("name8888="+name);
		System.out.println("uid8888="+uid);
		
		
		given()
		    .proxy("127.0.0.1",8080)
		    .queryParam("q",name)
		    .cookie("name",name)
		    .cookie("uid",uid)
		    .when().get("/search")//网址的前半部分来自全局变量设定 https://testerhome.com
		    .then().statusCode(200).body(containsString(name))
		    
		    ;
	
		test1.testSpec1();
	
}
	
	@Test
	public void testSpec(){
		
		ResponseSpecification rs=new ResponseSpecBuilder().build();
		
		    rs.statusCode(200);
		    rs.body(not(containsString("error")));
		    rs.time(lessThan(280L));
		given().get("/api/v3/topics/6040.json")
		.then().spec(rs);
		
	
	
}
	
	@Test
	public void testFilter(){
		RestAssured.filters();
	}
}



	
	


	


