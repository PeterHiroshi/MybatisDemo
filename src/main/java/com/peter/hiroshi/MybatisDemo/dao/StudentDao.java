package com.peter.hiroshi.MybatisDemo.dao;

import com.peter.hiroshi.MybatisDemo.entity.Student;

import java.util.List;

public interface StudentDao {

    public List<Student> findAll();

}
