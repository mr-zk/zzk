package cn.zk.service;

import cn.zk.pojo.BaseDict;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseDictService {
    public List<BaseDict> getBasedictsByCode(String code);
}
