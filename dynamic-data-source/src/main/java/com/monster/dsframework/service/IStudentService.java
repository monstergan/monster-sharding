package com.monster.dsframework.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.monster.dsframework.entity.Student;

import java.util.List;

public interface IStudentService extends IService<Student> {
    List<Student> getAll();

    Boolean addStudent();
}
