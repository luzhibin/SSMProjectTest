package service;

import domain.Customer;
import mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("CustomerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void saveCustomer(Customer customer) {
        System.out.println("service层，保存customer"+customer);
        //调用Dao层
        customerMapper.insertCustomer(customer);
    }
}
