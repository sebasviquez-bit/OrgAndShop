package APIs;

import com.alibaba.fastjson.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class Get_Post_Put_Delete {

    @Test
    public void testResponseCode() {

        Response resp= get("https://rapidapi.com/shivamgpt38/api/covid-19-live-stats");
        int code= resp.getStatusCode();
        System.out.println("Status code is "+ code);

    }

    @Test
    public void testBody() {

        Response resp= get("https://shop.akc.org/");
        String data= resp.asString();
        System.out.println("Data is "+ data);

    }

    @Test
    public void Post () {

        RequestSpecification request= RestAssured.given();
        request.header("Content-Type","application/json");

        JSONObject json=new JSONObject();
        json.put("id","69771");
        json.put("first_name", "Sebastian1");
        json.put("middle_name", "Alfredo1");
        json.put("last_name", "Viquez1");
        json.put("date_of_birth", "10/20/87");

        request.body(json.toJSONString());
        Response response=request.post("http://thetestingworldapi.com/api/studentsDetails");
        int code=response.getStatusCode();

        System.out.println("response code "+ code);
        Assert.assertEquals(code, 201);

    }

    @Test
    public void Put () {

        RequestSpecification request= RestAssured.given();
        request.header("Content-Type","application/json");

        JSONObject json=new JSONObject();
        json.put("id","69771");
        json.put("first_name", "Sebastian2");
        json.put("middle_name", "Alfredo1");
        json.put("last_name", "Viquez1");
        json.put("date_of_birth", "10/20/87");

        request.body(json.toJSONString());
        Response response=request.put("http://thetestingworldapi.com/Help/Api/PUT-api-studentsDetails-id");
        int code=response.getStatusCode();

        System.out.println("response code "+ code);
        Assert.assertEquals(code, 200);

    }

    @Test
    public void Delete () {

        RequestSpecification request= RestAssured.given();
        Response response=request.delete("http://thetestingworldapi.com/Help/Api/DELETE-api-studentsDetails-id");
        int code=response.getStatusCode();

        System.out.println("response code "+ code);
        Assert.assertEquals(code, 200);

    }
}
