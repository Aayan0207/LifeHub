package com.aayan.lifehub.service.auth;

import com.aayan.lifehub.dto.auth.RegisterRequest;
import com.aayan.lifehub.dto.auth.RegisterResponse;
import com.aayan.lifehub.exception.auth.UsernameRequiredException;
import com.aayan.lifehub.exception.auth.PasswordMismatchException;
import com.aayan.lifehub.model.auth.User;
import com.aayan.lifehub.repository.auth.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public RegisterResponse register(RegisterRequest request){
        validateRegisterRequest(request);
        User user = new User(
                request.getName(),
                request.getEmail(),
                request.getPassword()
        );
        User savedUser = userRepository.save(user);
        return new RegisterResponse(savedUser.getId(), savedUser.getName(), savedUser.getEmail());
    }

    public void validateRegisterRequest(RegisterRequest request){
        if (!request.getPassword().equals(request.getConfirmPassword())) {
            throw new PasswordMismatchException();
        }
        if (request.getName().isBlank()){
            throw new UsernameRequiredException();
        }
    }
}
