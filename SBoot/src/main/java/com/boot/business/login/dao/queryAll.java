package com.boot.business.login.dao;

import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface queryAll {

    @Select("select * from user")
    List<?> selectAll();
}
