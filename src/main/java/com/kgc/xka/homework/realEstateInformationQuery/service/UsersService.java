package com.kgc.xka.homework.realEstateInformationQuery.service;

import com.kgc.xka.homework.realEstateInformationQuery.pojo.Users;

public interface UsersService {
    Users selectUser(String name);
    //增加
    int addUser(Users users);
}
