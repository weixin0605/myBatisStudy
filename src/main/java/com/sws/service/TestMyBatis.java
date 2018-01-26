package com.sws.service;

import com.sws.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class TestMyBatis {
    //根据id查询，得到一条记录的结果
    @Test
    public void findUserByIdTest() throws IOException {
        //mybatis配置文件
        String resource = "SqlMapConfig.xml";
        //得到配置流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //通过sqlSession操作数据库
        //第一个参数：映射文件statement的id，等于=namesapce+"."+statement的id
        //第二个参数：指定和映射文件所匹配的类型参数
        //sqlSession.selectOne结果是与映射文件所匹配的resultType类型的对象
       User user =  sqlSession.selectOne("test.findUserByID",1);
       System.out.println(user);
       //释放资源
        sqlSession.close();

    }

    //根据用户名，模糊查询用户列表
    public void findUserByName() throws IOException {
        //mybatis配置文件
        String resource = "SqlMapConfig.xml";
        //得到配置流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //通过sqlSession操作数据库
//        List<User> list = sqlSession.selectList("test.findUserByName","%小明%");
        List<User> list = sqlSession.selectList("test.selectUserByName","小明");
        sqlSession.close();
    }

    //添加用户信息
    public void insertUser() throws IOException {
        //mybatis配置文件
        String resource = "SqlMapConfig.xml";
        //得到配置流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //插入用户对象
        User user = new User();
        user.setUsername("xxx");
        user.setBirthday(new Date());
        user.setSex("1");
        user.setAddress("xxx");
        //通过sqlSession操作数据库
        sqlSession.insert("test.insertUser",user);
        //需要执行提交
        sqlSession.commit();
        //获取用户id
        sqlSession.close();
    }

    //删除用户信息
    public void deleteUser() throws IOException {
        //mybatis配置文件
        String resource = "SqlMapConfig.xml";
        //得到配置流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //通过sqlSession操作数据库
        sqlSession.delete("test.deleteUser",1);
        //需要执行提交
        sqlSession.commit();
        //获取用户id
        sqlSession.close();
    }

    //更新用户信息
    public void updateUser() throws IOException {
        //mybatis配置文件
        String resource = "SqlMapConfig.xml";
        //得到配置流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //插入用户对象
        User user = new User();
        user.setId(1);
        user.setUsername("xxx");
        user.setBirthday(new Date());
        user.setSex("1");
        user.setAddress("xxx");
        //通过sqlSession操作数据库
        sqlSession.update("test.updateUser",user);
        //需要执行提交
        sqlSession.commit();
        //获取用户id
        sqlSession.close();
    }
}
