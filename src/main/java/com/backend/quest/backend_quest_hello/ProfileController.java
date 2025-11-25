package com.backend.quest.backend_quest_hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController{
    @GetMapping("/profile")
    public ProfileResponse getProfile(){
        return new ProfileResponse("Dhamodhar Reddy","Backend Dveloper","Hyderabad");
    }
}