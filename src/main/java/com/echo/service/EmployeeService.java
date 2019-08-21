package com.echo.service;

import com.echo.domain.Employee;

import java.util.List;

/**
 * @author joians
 * createTime: 2019-08-20 21:29:50
 */
public interface EmployeeService {

    /**
     * findAll：查询所有的员工信息
     *
     *  @return 员工列表
     */
    List<Employee> findAll();

    /**
     * saveEmployee：保存员工信息
     *
     * @param employee：待保存的 POJO 员工实例
     */
    void saveEmployee(Employee employee);
}
