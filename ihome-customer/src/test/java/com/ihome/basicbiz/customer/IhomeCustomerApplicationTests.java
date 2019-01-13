package com.ihome.basicbiz.customer;

import com.ihome.basicbiz.customer.domain.CpCustomerBase;
import com.ihome.basicbiz.customer.mapper.CpCustomerBaseDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IhomeCustomerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private CpCustomerBaseDAO cpCustomerBaseDAO;

	@Test
	public void testQueryList() throws Exception {
		List<CpCustomerBase> customerBaseList = cpCustomerBaseDAO.queryList();
		for (CpCustomerBase customerBase : customerBaseList) {
			System.out.println(customerBase);
		}
	}

	@Test
	public void testQueryByCustomerId() throws Exception {
		CpCustomerBase customerBase = cpCustomerBaseDAO.queryByCustomerId(999L);
		System.out.println(customerBase);
	}

	@Test
	public void testQueryById() throws Exception {
		CpCustomerBase customerBase = cpCustomerBaseDAO.selectByPrimaryKey(3L);
		System.out.println(customerBase);
	}
}
