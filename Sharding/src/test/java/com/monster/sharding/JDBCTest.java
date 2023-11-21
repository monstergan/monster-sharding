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

@SpringBootTest
@RunWith(SpringRunner.class)
public class JDBCTest {

    @Resource
    private CourseMapper courseMapper;

    @Test
    public void addcourse() {
        for (int i = 0;i < 10;i++){
            Course c = new Course();
            c.setCname("java");
            c.setUserId(1001L);
            c.setCstatus("1");
            courseMapper.insert(c);
//insert into course values ....
            System.out.println(c);
        }
    }

    @Test
    public void queryCourse(){
        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("cid",1724352748638789637L);
        List<Course> courses = courseMapper.selectList(queryWrapper);
        System.out.println(courses);
    }
}
