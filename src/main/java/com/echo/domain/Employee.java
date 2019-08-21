package com.echo.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * POJO Employee
 * @author joians
 * @create 2019-08-20 21:04:34
 */
@Data
@Builder
public class Employee implements Serializable {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
}
