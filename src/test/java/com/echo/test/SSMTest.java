package com.echo.test;

import com.echo.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author joians
 * createTime: 2019-08-20 21:47:13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SSMTest {

    @Autowired
    private EmployeeService employeeService;
    @Test
    public  void  testService(){
        employeeService.findAll();
        employeeService.saveEmployee(null);
    }
}
