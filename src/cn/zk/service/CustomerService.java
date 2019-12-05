package cn.zk.service;

import cn.zk.pojo.Customer;
import cn.zk.pojo.QueryVo;
import cn.zk.util.Page;

public interface CustomerService{

    public Page getCustomerByQueryVo(QueryVo queryVo);

    Customer selectById(Integer id);

    public void getUpdate(Customer customer);

    void getdelete(Integer id);
}
