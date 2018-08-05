package com.peter.hiroshi.test;

import com.peter.hiroshi.MybatisDemo.dao.StudentDao;
import com.peter.hiroshi.MybatisDemo.dao.StudentDaoImpl;
import com.peter.hiroshi.MybatisDemo.entity.Student;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestStudentDao {

    Logger logger = Logger.getLogger(TestStudentDao.class);

    @Test
    public void findAllTest() {
        StudentDao studentDao = new StudentDaoImpl();
        List<Student> students = studentDao.findAll();
        Assert.assertEquals(2, students.size());
        logger.debug(students);
    }

}
