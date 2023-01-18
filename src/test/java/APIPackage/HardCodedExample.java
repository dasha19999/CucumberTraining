package APIPackage;

import io.restassured.RestAssured;

public class HardCodedExample {
    //one thing to remember
    //baseIRI-baseURl
    //end then using when keyword, we will send the end point

    String baseURI=RestAssured.baseURI="http://hrm.syntaxtechs.net/syntaxapi/api";

    //we need to perform CRUD operation
    String token="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2NzQwMDE2ODQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY3NDA0NDg4NCwidXNlcklkIjoiNDg5MiJ9.FWxr-ESOMq-xiAGA_a-clsRSFRtyQVlVllvYB414rO0";

    public void getOneEmployee(){
        
    }

}
