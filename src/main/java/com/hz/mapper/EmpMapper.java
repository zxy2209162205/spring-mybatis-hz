package com.hz.mapper;

import com.hz.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface EmpMapper {
    @Select("select * from emp where id = #{id}")
    public Emp getEmpById(int id);
}
