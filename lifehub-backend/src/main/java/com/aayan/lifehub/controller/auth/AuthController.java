package com.aayan.lifehub.controller.auth;

import com.aayan.lifehub.common.APIRoutes;
import com.aayan.lifehub.dto.auth.RegisterRequest;
import com.aayan.lifehub.dto.auth.RegisterResponse;
import com.aayan.lifehub.service.auth.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(APIRoutes.AUTH)
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/register")
    public RegisterResponse register(@RequestBody RegisterRequest request){
        return authService.register(request);
    }
}
