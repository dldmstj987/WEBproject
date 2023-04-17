package com.WebProject.SPACEbar.domain.DAO;

import com.WebProject.SPACEbar.domain.dtos.MemberDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberDao {
    int getId(MemberDto dto);
    int addMember(MemberDto dto);
    MemberDto login(MemberDto dto);
}
