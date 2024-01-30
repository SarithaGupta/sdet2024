package com.saucelabs.tests.APIs;

import com.saucelabs.common.utils.logs.TestLogger;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class List_Users_API_Test {

    public String environment = "https://reqres.in";
    public String GET_API_ENDPOINT ="/api/users?page=2";
    Logger logger;
    @Test
    public void getUsersList(){
         logger = TestLogger.init(List_Users_API_Test.class.getName());
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        Response response = request.get(environment + GET_API_ENDPOINT);
        //complete response json object
        JSONObject jsonResponseBody = new JSONObject(response.body().asString());
        logger.info("Response from List Users :" +jsonResponseBody);
        logger.info("Total Pages from response  is :"+jsonResponseBody.get("total_pages"));
        logger.info("pages attribute from response is :"+jsonResponseBody.get("per_page"));
        Assert.assertEquals(jsonResponseBody.get("total_pages"),2,"Total pages count is not matching");

        //Ex : Json array data object
       JSONArray data= jsonResponseBody.getJSONArray("data");
       logger.info("list of data attribute from response is: "+data);
       logger.info("Total available records in data column is : " +data.length());
       Assert.assertEquals(data.length(), 6, "Total available user records in data column is not matching");

       //parsing mechanism - means processing the data
        for(int i=0;i<data.length();i++){
          logger.info(data.get(i));
         logger.info("Email : " +data.getJSONObject(i).get("email"));

           String email =  data.getJSONObject(i).get("email").toString();
           logger.info("Email is :" +email);
           logger.info("first name is : " +data.getJSONObject(i).get("first_name").toString());
            logger.info("last name is : " +data.getJSONObject(i).get("last_name").toString());
            logger.info("Avatar  is : " +data.getJSONObject(i).get("avatar").toString());


         /*   boolean containsEmail = false;


                if ("email".equals(data.get(i))) {

                    containsEmail = true;
                    break;
                }
            logger.info("contains email : "+containsEmail);*/



         /*
         another way----- converting first in o string
            String email =  data.getJSONObject(i).get("email").toString();
            logger.info("Email is :" +email);
          */
        }
        logger.info("Support : " +jsonResponseBody.get("support"));
        // Or......
        JSONObject support = (JSONObject) jsonResponseBody.get("support");

       // logger.info("Support url from List User API response is  : " +support.get("url"));
        logger.info("Support text from List User API response is  : " +support.get("text"));
        String url = support.getString("url");
        logger.info("Support url from List User API response is  : " +url);

    }

    @Test(dependsOnMethods = "getUsersList")
    public void updateUserAPI(){
        logger.info("update user api() ...test...");
    }
}
