package cn.itcast.test;

import cn.itcast.dao.IUserDao;
import cn.itcast.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("cn/SqlMapConfig.xml");

        //2.创建工厂SqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);

        //3.使用工厂生产SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //4.使用SqlSession对象创建Dao接口的代理对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();

        for (User user : users) {
            System.out.println(user);
        }

        //6.释放资源

    }
}
