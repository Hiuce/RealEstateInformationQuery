package com.kgc.xka.homework.realEstateInformationQuery.mapper;

import com.kgc.xka.homework.realEstateInformationQuery.pojo.Users;
import com.kgc.xka.homework.realEstateInformationQuery.pojo.UsersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(String carid);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(String carid);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}