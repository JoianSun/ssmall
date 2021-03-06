package com.echo.dao;

import com.echo.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author joians
 * createTime: 2019-08-20 21:16:50
 */
@Repository("employeeDao")
public interface EmployeeDao {

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


    /**
     * deleteById：删除指定 id 的员工信息
     *
     * @param id： 待删除的员工的 id
     */
    void deleteById(Integer id);
}
