package edu.miu.demo.service;

import edu.miu.demo.domain.dto.request.LoginRequest;
import edu.miu.demo.domain.dto.response.LoginResponse;
import edu.miu.demo.domain.dto.request.RefreshTokenRequest;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}