package cn.zk.controller;

import cn.zk.pojo.BaseDict;
import cn.zk.pojo.Customer;
import cn.zk.pojo.QueryVo;
import cn.zk.service.BaseDictService;
import cn.zk.service.CustomerService;
import cn.zk.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private BaseDictService dictService;
    @Autowired
    private CustomerService customerService;
    @RequestMapping("list")
    public String list(Model model, QueryVo queryVo){
        List <BaseDict> fromType=dictService.getBasedictsByCode("002");
        List <BaseDict> industryType=dictService.getBasedictsByCode("006");
        List <BaseDict> levelType=dictService.getBasedictsByCode("001");

        model.addAttribute("fromType",fromType);
        model.addAttribute("industryType",industryType);
        model.addAttribute("levelType",levelType);

        Page<Customer> page=customerService.getCustomerByQueryVo(queryVo);
        model.addAttribute("page",page);
        model.addAttribute("vo",queryVo);
        return "customer";
    }
    @RequestMapping("edit")
    @ResponseBody
    public Customer edit(Integer id){
        Customer customer = customerService.selectById(id);
        return customer;

    }
    @RequestMapping("update")
    public String update(Model model,Customer customer){
        customerService.getUpdate(customer);
        return "customer";
    }
    @RequestMapping("delete")
    public String delete(Integer id){
        customerService.getdelete(id);
        return "customer";
    }
}
