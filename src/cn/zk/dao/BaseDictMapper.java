package cn.zk.dao;

import cn.zk.pojo.BaseDict;

import java.util.List;

public interface BaseDictMapper {
    List<BaseDict> getBasedictsByCode(String code);
}
