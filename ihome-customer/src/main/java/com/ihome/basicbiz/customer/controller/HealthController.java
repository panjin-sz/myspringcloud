package com.ihome.basicbiz.customer.controller;

import com.ihome.basicbiz.customer.domain.CpCustomerBase;
import com.ihome.basicbiz.customer.service.CustomerBaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author panjin.
 * @date 2018/7/22.
 */
@RestController
@Slf4j
public class HealthController {

    private Map<Long, Boolean> map = new HashMap<>();

    @Value("${from}")
    private String from;

    @Resource
    private CustomerBaseService customerBaseService;

    @GetMapping(value = "/health")
    public String health() {
        log.info("--------------------info health-------------------");

        from += "8";
        log.info("from is {}", from);
        return "hello, customer!";
    }

    @GetMapping(value = "/createCustomer")
    public String createCustomer() {
        log.info("--------------------create customer-------------------");
        customerBaseService.createCustomer();
        return "hello, create customer!";
    }

    @GetMapping(value = "/queryList")
    @ResponseBody
    public Object queryList() {
        log.info("--------------------create customer-------------------");
        List<CpCustomerBase> customerBaseList = customerBaseService.queryList();
        return customerBaseList;
    }

    @GetMapping(value = "/addCustomer")
    @ResponseBody
    public Object addCustomer() {
        log.info("--------------------add customer-------------------");
        CpCustomerBase customerBase = new CpCustomerBase();
        customerBase.setVerificationLevel(2);
        customerBase.setRiskLevel(2);
        customerBase.setRegisterSource(2);
        customerBase.setRegisterChannel(2);
        customerBase.setMobile("13699999999");
        customerBase.setEmail("www.myjack@gmail.com");
        customerBase.setCustomerStatus(2);
        customerBase.setCustomerId(new Random().nextLong());
        customerBase.setCreatedTime(new Date());
        customerBase.setCustomerLevel(2);

        int N = 5;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N);


        for (int i = 0; i < N; i++) {
            new Demo(cyclicBarrier, customerBase).start();
        }
        return 1;
    }

    class Demo extends Thread {
        private CyclicBarrier cyclicBarrier;
        private CpCustomerBase customerBase;
        public Demo(CyclicBarrier cyclicBarrier, CpCustomerBase customerBase) {
            this.cyclicBarrier = cyclicBarrier;
            this.customerBase = customerBase;
        }

        @Override
        public void run() {
            try {
                System.out.println("线程"+Thread.currentThread().getName()+"正在写入数据...");
                Thread.sleep(2000);
                System.out.println("线程"+Thread.currentThread().getName()+"写入数据完毕，等待其他线程写入完毕");
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("所有线程写入完毕，继续处理其他任务...");
            Long customerId = customerBase.getCustomerId();
            if (null != map.get(customerId)) {
                return;
            }
            map.put(customerId, true);
            System.out.println("插入数据...");
            customerBaseService.addCustomer(customerBase);
        }
    }
}


