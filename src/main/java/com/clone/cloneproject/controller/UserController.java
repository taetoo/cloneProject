package com.clone.cloneproject.controller;


import com.clone.cloneproject.config.JwtTokenProvider;
import com.clone.cloneproject.domain.User;
import com.clone.cloneproject.dto.LoginRequestDto;
import com.clone.cloneproject.dto.SignUpRequestDto;
import com.clone.cloneproject.repository.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;


@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;
    private final JwtTokenProvider jwtTokenProvider;



    //회원가입
    @PostMapping("/api/user/signup")
    public Map<String,Object> userRegister(@Valid @RequestBody SignUpRequestDto signUpRequestDto){

        User user = userService.register(signUpRequestDto);

        Map<String, Object> response = new HashMap<>();
        if(user != null){
            response.put("result","success");
            response.put("message","회원가입 성공");
        }else{
            response.put("result","false");
            response.put("message","회원가입 실패");
        }

        return response;
    }

    //로그인
    @PostMapping("/api/user/login")
    public Map<String,Object> userLogin(@RequestBody LoginRequestDto loginRequestDto){

        User user = userService.userLoginCheck(loginRequestDto);

        Map<String,Object> response = new HashMap<>();



        response.put("token", jwtTokenProvider.createToken(Long.toString(user.getId()),user.getUsername(),user.getNickname()));
        response.put("userPk",user.getId());
        response.put("message","로그인 성공");


        return response;

    }








}
