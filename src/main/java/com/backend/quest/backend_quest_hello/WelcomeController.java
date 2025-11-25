package com.backend.quest.backend_quest_hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WelcomeController{
    @GetMapping("/welcome")
    public Map<String,String> welcome(@RequestParam(required=false) String name){
        Map<String,String> response=new HashMap<>();
        if(name==null||name.isBlank()){
            response.put("message","please provide a name in the query parameter!");
            return response;
        }
        response.put("message","welcome"+name);
        return response;

    }
}