package com.aayan.lifehub.service.auth;

import com.aayan.lifehub.dto.auth.LoginRequest;
import com.aayan.lifehub.dto.auth.LoginResponse;
import com.aayan.lifehub.dto.auth.RegisterRequest;
import com.aayan.lifehub.dto.auth.RegisterResponse;
import com.aayan.lifehub.exception.auth.*;
import com.aayan.lifehub.model.auth.User;
import com.aayan.lifehub.repository.auth.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LoginResponse login(LoginRequest request) {
        validateLoginRequest(request);
        Optional<User> user = userRepository.findByEmail(request.getEmail());
        if (user.isEmpty()) {
            throw new UserNotFoundException();
        }
        User foundUser = user.get();
        validateUserLogin(request, foundUser);
        return new LoginResponse(foundUser, "success");
    }

    public void validateUserLogin(LoginRequest request, User foundUser) {
        if (!foundUser.getPassword().equals(request.getPassword())) {
            throw new IncorrectPasswordException();
        }
    }

    public void validateLoginRequest(LoginRequest request) {

    }

    public RegisterResponse register(RegisterRequest request) {
        validateRegisterRequest(request);
        User user = new User(
                request.getName(),
                request.getEmail(),
                request.getPassword()
        );
        User savedUser = userRepository.save(user);
        return new RegisterResponse(savedUser);
    }

    public void validateRegisterRequest(RegisterRequest request) {
        if (!request.getPassword().equals(request.getConfirmPassword())) {
            throw new PasswordMismatchException();
        }
        if (userRepository.existsByEmail(request.getEmail())){
            throw new EmailAlreadyExistsException();
        }
    }
}
