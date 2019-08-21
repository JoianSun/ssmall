package com.echo.service;

import com.echo.dao.EmployeeDao;
import com.echo.domain.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author joians
 * createTime: 2019-08-20 21:30:10
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> findAll() {
        List<Employee> emps = employeeDao.findAll();
        return emps;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }
}
