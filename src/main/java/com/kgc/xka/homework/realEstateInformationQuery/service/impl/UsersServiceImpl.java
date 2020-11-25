package com.kgc.xka.homework.realEstateInformationQuery.service.impl;

import com.kgc.xka.homework.realEstateInformationQuery.mapper.UsersMapper;
import com.kgc.xka.homework.realEstateInformationQuery.pojo.Users;
import com.kgc.xka.homework.realEstateInformationQuery.pojo.UsersExample;
import com.kgc.xka.homework.realEstateInformationQuery.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    UsersMapper usersMapper;
    @Override
    public Users selectUser(String name) {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andCaridEqualTo(name);
        List<Users> users = usersMapper.selectByExample(usersExample);
        if(users!=null&&users.size()!=0){
            return users.get(0);
        }else{
            return null;
        }
    }
}
