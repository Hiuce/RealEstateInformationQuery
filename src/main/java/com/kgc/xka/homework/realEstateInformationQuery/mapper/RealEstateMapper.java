package com.kgc.xka.homework.realEstateInformationQuery.mapper;

import com.kgc.xka.homework.realEstateInformationQuery.pojo.RealEstate;
import com.kgc.xka.homework.realEstateInformationQuery.pojo.RealEstateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RealEstateMapper {
    int countByExample(RealEstateExample example);

    int deleteByExample(RealEstateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RealEstate record);

    int insertSelective(RealEstate record);

    List<RealEstate> selectByExample(RealEstateExample example);

    RealEstate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RealEstate record, @Param("example") RealEstateExample example);

    int updateByExample(@Param("record") RealEstate record, @Param("example") RealEstateExample example);

    int updateByPrimaryKeySelective(RealEstate record);

    int updateByPrimaryKey(RealEstate record);
}