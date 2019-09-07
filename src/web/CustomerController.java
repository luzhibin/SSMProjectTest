package web;

import domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CustomerService;

@Controller
public class CustomerController {

    /*注入service层*/
    @Autowired
    private CustomerService customerService;

    @RequestMapping("addcustomer")
    public String addcustomer(Customer customer){
        //接收参数
        System.out.println("Web层,"+customer);
        //调用service层
        customerService.saveCustomer(customer);
        return "result";
    }
}
