package com.monster.sharding;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.monster.sharding.entity.Course;
import com.monster.sharding.mapper.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Monster gan
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JDBCTest {

    @Resource
    private CourseMapper courseMapper;

    @Test
    public void addcourse() {
        for (int i = 0; i < 10; i++) {
            Course c = new Course();
            c.setCname("java");
            c.setUserId(1001L);
            c.setCstatus("1");
            courseMapper.insert(c);
//insert into course values ....
            System.out.println(c);
        }
    }

    /**
     * 单个查询
     */
    @Test
    public void queryCourse() {
        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("cid", 934481244211642369L);
        List<Course> courses = courseMapper.selectList(queryWrapper);
        // 添加断言来验证结果
        assertNotNull(courses); // 断言结果不为null
        courses.forEach(System.out::println);
    }

    /**
     * 多个查询
     */
    @Test
    public void queryCourseIn() {
        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("cid", 934481244278751233L, 934481244182282241L);
        List<Course> courses = courseMapper.selectList(queryWrapper);
        // 添加断言来验证结果
        assertNotNull(courses); // 断言结果不为null
        courses.forEach(System.out::println);
    }
}
