package com.echo.controller;

import com.echo.domain.Employee;
import com.echo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * web 控制层
 *
 * @author joians
 * createTime: 2019-08-20 21:34:37
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/findAll")
    public String findAll(Map<String,Object> map) {
        List<Employee> employees = employeeService.findAll();
        map.put("emps",employees);
        return "list";
    }
}
