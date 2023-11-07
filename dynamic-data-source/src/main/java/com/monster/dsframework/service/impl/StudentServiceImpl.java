package com.monster.dsframework.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.monster.dsframework.entity.Student;
import com.monster.dsframework.mapper.StudentMapper;
import com.monster.dsframework.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {


    @Override
    @DS("read")
    public List<Student> getAll() {
        return baseMapper.selectList(new QueryWrapper<>());
    }

    @Override
    @DS("write")
    public Boolean addStudent() {
        Student student = new Student();
        student.setAge(24);
        student.setChineseName("小强");
        student.setEnglishName("xiao强");
        student.setScore(66.7F);
        int insert = baseMapper.insert(student);
        return insert > 0;
    }
}
