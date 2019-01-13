package com.ihome.basicbiz.customer.service;

import com.ihome.basicbiz.customer.domain.CpCustomerBase;
import com.ihome.basicbiz.customer.mapper.CpCustomerBaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author panjin.
 * @date 2018/8/5.
 */
@Service
public class CustomerBaseService {

    @Autowired
    private CpCustomerBaseDAO cpCustomerBaseDAO;

    public void createCustomer() {
        CpCustomerBase customerBase = new CpCustomerBase();
        customerBase.setVerificationLevel(1);
        customerBase.setRiskLevel(1);
        customerBase.setRegisterSource(1);
        customerBase.setRegisterChannel(1);
        customerBase.setMobile("13688888888");
        customerBase.setEmail("www.myjack@gmail.com");
        customerBase.setCustomerStatus(1);
        customerBase.setCustomerId(new Long(new Random().nextInt()));
        customerBase.setCreatedTime(new Date());
        customerBase.setCustomerLevel(1);
        cpCustomerBaseDAO.insert(customerBase);
    }

    public List<CpCustomerBase> queryList() {
        return cpCustomerBaseDAO.queryList();
    }

    public int addCustomer(CpCustomerBase customerBase) {
        CpCustomerBase record = cpCustomerBaseDAO.queryByCustomerId(customerBase.getCustomerId());
        if (record != null) {
            System.out.println("xianchengming:" + Thread.currentThread().getName());
            return 0;
        }
        System.out.println("hahahah:" + Thread.currentThread().getName());
        int result = cpCustomerBaseDAO.insertSelective(customerBase);
        return result;
    }
}
