package cn.zk.service;

import cn.zk.dao.BaseDictMapper;
import cn.zk.pojo.BaseDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseDictServiceImpl implements BaseDictService{
    @Autowired
   private BaseDictMapper baseDictMapper;
    @Override
    public List<BaseDict> getBasedictsByCode(String code) {
        return baseDictMapper.getBasedictsByCode(code);
    }
}
