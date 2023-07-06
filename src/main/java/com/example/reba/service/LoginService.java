package com.example.reba.service;

import com.example.reba.dto.LoginDto;
import com.example.reba.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class LoginService {
    private final LoginRepository loginRepository;
    public Boolean loginCheck(LoginDto loginDto){
        if(loginRepository.loginCheck(loginDto.getCourseCode(),loginDto.getSectionNumber()) != null){
            return true;
        }
        else {
            return false;
        }
    }
}
