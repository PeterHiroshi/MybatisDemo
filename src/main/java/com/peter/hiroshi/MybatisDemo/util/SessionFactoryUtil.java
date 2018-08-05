package com.peter.hiroshi.MybatisDemo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SessionFactoryUtil {

    private static SqlSessionFactory sessionFactory;
    private static final String RESOURCE_NAME = "mybatis-config.xml";

    private SessionFactoryUtil() {
    }

    public static synchronized SqlSession getSession() {

        try {
            InputStream stream = Resources.getResourceAsStream(RESOURCE_NAME);
            if (sessionFactory == null) {
                sessionFactory = new SqlSessionFactoryBuilder().build(stream);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sessionFactory.openSession();

    }

}
