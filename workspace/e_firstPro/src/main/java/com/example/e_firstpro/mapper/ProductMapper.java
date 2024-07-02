package com.example.e_firstpro.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProductMapper {

    @Select("SELECT SYSDATE FORM DUAL")
    String getTimeQuick();

    String getTime();




}
