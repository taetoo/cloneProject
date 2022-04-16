package com.clone.cloneproject.service;


import com.clone.cloneproject.domain.User;
import com.clone.cloneproject.dto.LoginRequestDto;
import com.clone.cloneproject.dto.SignUpRequestDto;
import com.clone.cloneproject.exception.UserException;
import com.clone.cloneproject.exception.UserExceptionType;
import com.clone.cloneproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//
@RequiredArgsConstructor
@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;


    //회원가입
    @Transactional
    public User register(SignUpRequestDto signUpRequestDto) {

        String username = signUpRequestDto.getUsername();
        String nickname = signUpRequestDto.getNickname();


        // username 중복검사
        if(userRepository.findByUsername(username).isPresent()){
            throw new UserException(UserExceptionType.ALREADY_EXIST_USERNAME);
        }
        //nickname 중복검사
        if(userRepository.findByNickname(nickname).isPresent()){
            throw new UserException(UserExceptionType.ALREADY_EXIST_NICKNAME);

        }

        String password = passwordEncoder.encode(signUpRequestDto.getPassword());

            User user = User.builder()
                    .username(username)
                    .nickname(nickname)
                    .password(password)

                    .build();

       return userRepository.save(user);

    }

    //로그인 유효성 검사
    public User userLoginCheck(LoginRequestDto loginRequestDto) {

        User user = userRepository.findByUsername(loginRequestDto.getUsername())
                .orElseThrow(() -> new UserException(UserExceptionType.NOT_FOUND_MEMBER));

        if(!passwordEncoder.matches(loginRequestDto.getPassword(),user.getPassword())){
            throw new UserException(UserExceptionType.WRONG_PASSWORD);
        }


        return user;
    }
}
