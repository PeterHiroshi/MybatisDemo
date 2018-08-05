package com.peter.hiroshi.MybatisDemo.dao;

import com.peter.hiroshi.MybatisDemo.entity.Student;
import com.peter.hiroshi.MybatisDemo.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    public List<Student> findAll() {
        SqlSession session = null;
        List<Student> students = null;

        try {
            session = SessionFactoryUtil.getSession();
            StudentDao mapper = session.getMapper(StudentDao.class);
            students = mapper.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return students;

    }

}
