package com.javasm.goods.dao;

import java.util.List;

import com.javasm.goods.entity.Good;

public interface GoodMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Good record);

    int insertSelective(Good record);

    Good selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);
    
    List<Good> selectAll();
}