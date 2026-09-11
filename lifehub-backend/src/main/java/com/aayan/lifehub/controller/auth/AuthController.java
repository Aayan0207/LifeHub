package com.aayan.lifehub.controller.auth;

import com.aayan.lifehub.common.APIRoutes;
import com.aayan.lifehub.dto.auth.LoginRequest;
import com.aayan.lifehub.dto.auth.LoginResponse;
import com.aayan.lifehub.dto.auth.RegisterRequest;
import com.aayan.lifehub.dto.auth.RegisterResponse;
import com.aayan.lifehub.service.auth.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(APIRoutes.AUTH)
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody @Valid LoginRequest request) {
        return authService.login(request);
    }

//    @PostMapping("/logout")
//    public LogoutResponse logout(@RequestBody LogoutRequest request){
//        return authService.logout(request);
//    }

    @PostMapping("/register")
    public RegisterResponse register(@RequestBody @Valid RegisterRequest request) {
        return authService.register(request);
    }
}
