package org.firstmvc.springmvcfirst.controller;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class
ApiController {

    @RequestMapping(value="/test1",method= RequestMethod.GET)
    public String hello(){
        return "hello";
    }
    @RequestMapping(value="/json/test",method = RequestMethod.GET)
    public String returnJson(){
       Map<String,String> personDetails=new HashMap<String, String>();
        personDetails.put("name","madhu neupane");

        Gson gson=new Gson();
        String jsonObject=gson.toJson(personDetails).toString();

        return jsonObject;
    }
 /*   @RequestMapping(value="/jsonobject/test",method = RequestMethod.GET)
    public JSONObject returnJsonobject(){
        JSONObject jsonObject= new JsonObject();
        jsonObject.put("name","madhu neupane");

        return jsonObject;
    }*/

 //we use @RequestBody to handle the json data request
}
