package com.WebProject.SPACEbar.mapper;

import com.WebProject.SPACEbar.domain.vos.UserVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Mapper
@Service
public interface UserMapper {
    @Select("SELECT * FROM `user_tbl` WHERE `email` = #{email}")
    UserVO get_user(String email);

    //회원가입
    @Insert("INSERT INTO `user_tbl` VALUES " +
            "(#{email}, #{password}, #{id}, #{birth}, #{phone}, #{addr} default)")
    void register_user(UserVO userVO);
}
