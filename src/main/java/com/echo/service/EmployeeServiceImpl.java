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

        /* 用于验证事务是否配置成功，find 系列方法是 readOnly
        save 是非 readOnly 的，会导致异常：
            java.sql.SQLException: Connection is read-only.
        employeeDao.saveEmployee(null);*/
        return emps;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }

    @Override
    public void deleteById(Integer id) {
        employeeDao.deleteById(id);
    }
}
