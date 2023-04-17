package com.WebProject.SPACEbar.service;


import com.WebProject.SPACEbar.domain.DAO.MemberDao;
import com.WebProject.SPACEbar.domain.dtos.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService{

    private final MemberDao dao;

    public boolean getId(MemberDto dto) {
        int n =dao.getId(dto);
        return n > 0;
    }

    public boolean addMember(MemberDto dto){
        int n = dao.addMember(dto);
        return n > 0;
    }

    public  MemberDto login(MemberDto dto){
        return dao.login(dto);
    }
}
