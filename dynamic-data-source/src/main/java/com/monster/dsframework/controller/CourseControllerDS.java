package com.monster.dsframework.controller;

import com.monster.dsframework.service.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 使用DynamicDataSource框架，通过@DS注解快速切换数据源
 */
@RestController
@RequestMapping("/course")
public class CourseControllerDS {

    @Resource
    private IStudentService studentService;


    @GetMapping("/query-all")
    public Object queryAll() {
        return studentService.getAll();
    }


    @GetMapping("/add-student")
    public Boolean addStudent(){
        return studentService.addStudent();
    }
}
