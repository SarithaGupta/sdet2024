package com.saucelabs.tests.APIs;

import com.google.gson.JsonObject;
import com.saucelabs.common.utils.logs.TestLogger;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POST_API_Test {
    String environment ="https://reqres.in";
    String create_User_API_Endpoint = "/api/users";
    Logger logger;

    @Test
    public void createUserTest(){

        logger = TestLogger.init(POST_API_Test.class.getName());
        //Initiate object for rest assured
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");

        //request body
        JsonObject jsonBody = new JsonObject();
        jsonBody.addProperty("name","Charleys");
        jsonBody.addProperty("job","Scrum Master");
        //we are managing api test data in a separate json file. for practice purpose we are hardcoding here
        //api call
        request.body(jsonBody.toString());
        //all the methods are available in rest assured library.(POST,PUT,DELETE,GET)
        Response response=  request.post(environment + create_User_API_Endpoint);
        //parse the response by using JsonObject
        JSONObject responseJson = new JSONObject(response.body().asString());
        //org.json is one library.we are using to parse the object
       String user_ID= responseJson.get("id").toString();
       //String user_ID = null;
       String user_Name = responseJson.getString("name");
       String createdTimeStamp = responseJson.get("createdAt").toString();

       //Checkpoints
        Assert.assertNotNull(user_ID,"user id is null in created User API response");
        Assert.assertNotNull(createdTimeStamp,"Created time stamp is null in the create user API response");
        Assert.assertNotNull(user_Name,"name field is null in the create user API response");
      //logs
        logger.info("User_Id from API response: "+user_ID );
        logger.info("User Name in response is : "+user_Name);
        logger.info("User created time stamp is :" +createdTimeStamp);


    }
}
