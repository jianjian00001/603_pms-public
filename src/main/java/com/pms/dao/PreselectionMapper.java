package com.pms.dao;

import com.pms.pojo.Preselection;
import com.pms.pojo.PreselectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreselectionMapper {
    int countByExample(PreselectionExample example);

    int deleteByExample(PreselectionExample example);

    int deleteByPrimaryKey(Integer preId);

    int insert(Preselection record);

    int insertSelective(Preselection record);

    List<Preselection> selectByExample(PreselectionExample example);

    Preselection selectByPrimaryKey(Integer preId);

    int updateByExampleSelective(@Param("record") Preselection record, @Param("example") PreselectionExample example);

    int updateByExample(@Param("record") Preselection record, @Param("example") PreselectionExample example);

    int updateByPrimaryKeySelective(Preselection record);

    int updateByPrimaryKey(Preselection record);

}