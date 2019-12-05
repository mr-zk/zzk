package cn.zk.service;

import cn.zk.dao.CustomerMapper;
import cn.zk.pojo.Customer;
import cn.zk.pojo.QueryVo;
import cn.zk.util.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public Page getCustomerByQueryVo(QueryVo queryVo) {
        queryVo.setStart((queryVo.getPage()-1)*queryVo.getRows());
        System.out.println(queryVo.getStart());
        System.out.println(queryVo.getPage()+"*****"+queryVo.getRows());
        List<Customer> list=customerMapper.getCustomerByQueryVo(queryVo);
        System.out.println(list.size()+"//////");
        Integer total=customerMapper.getCountByVo(queryVo);
        System.out.println("*******"+total);
        Page<Customer> page=new Page<Customer>(total,queryVo.getPage(),queryVo.getRows(),list);
        return page;
    }
    @Override
    public Customer selectById(Integer id) {

        return customerMapper.selectById(id);
    }

    @Override
    public void getUpdate(Customer customer) {
        customerMapper.getUpdate(customer);
    }

    @Override
    public void getdelete(Integer id) {
        customerMapper.getdelete(id);
    }
}
