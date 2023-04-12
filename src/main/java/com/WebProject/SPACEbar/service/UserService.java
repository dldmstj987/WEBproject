package com.WebProject.SPACEbar.service;

import com.WebProject.SPACEbar.domain.vos.UserVO;
import com.WebProject.SPACEbar.mapper.UserMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Configuration
@Log4j2
@Service
public class UserService {



    @Autowired
    private UserMapper userMapper;


    @Autowired
    private PasswordEncoder passwordEncoder;

    //유저를 회원가입시키는 서비스 동작

    /********************   회원가입 관련   *******************************/
    //유저를 회원가입시키는 서비스동작
    public void register_user(UserVO userVO){
        userVO.setPassword(passwordEncoder.encode(userVO.getPassword()));
        userMapper.register_user(userVO);
    }

}
