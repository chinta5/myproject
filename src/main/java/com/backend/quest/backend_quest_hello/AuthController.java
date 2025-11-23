package com.backend.quest.backend_quest_hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController{
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request){
        if(request==null|| request.getUsername()==null||request.getPassword()==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new LoginResponse(false,"username and password must be provided",null));
        }

        if("admin".equals(request.getUsername())&&"password".equals(request.getPassword())){
            String mockToken="mock-token-12345";
            return ResponseEntity.ok(new LoginResponse(true,"Login Successful",mockToken));
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(new LoginResponse(false,"Invalid username or password",null));
        }
    }

}