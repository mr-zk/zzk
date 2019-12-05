package cn.zk.dao;

import cn.zk.pojo.Customer;
import cn.zk.pojo.QueryVo;

import java.util.List;

public interface CustomerMapper {
    List<Customer> getCustomerByQueryVo(QueryVo queryVo);

    Integer getCountByVo(QueryVo queryVo);

    Customer selectById(Integer id);

    void getUpdate(Customer customer);

    void getdelete(Integer id);
}
