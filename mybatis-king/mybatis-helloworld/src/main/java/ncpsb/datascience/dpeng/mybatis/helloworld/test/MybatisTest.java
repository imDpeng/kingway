package ncpsb.datascience.dpeng.mybatis.helloworld.test;

import ncpsb.datascience.dpeng.common.model.mybatis.helloworld.Employee;
import ncpsb.datascience.dpeng.mybatis.helloworld.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * hello world
 * <p>
 * use the native way to get the sqlSession and submit sql
 *
 * @author dpeng
 */
public class MybatisTest {


    private SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }


    @Test
    public void testNative() throws IOException {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            Employee employee = session.selectOne(
                    "ncpsb.datascience.dpeng.mybatis.helloworld.mapper.EmployeeMapper.selectEmployee",
                    1);
            System.out.println(employee);
        } finally {
            session.close();
        }
    }


    @Test
    public void testMapper() throws IOException {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            Employee employee = mapper.selectEmployee(1);
            System.out.println(employee);
        } finally {
            session.close();
        }
    }


    @Test
    public void testMapperWithParam() throws IOException {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            Employee employee = mapper.selectEmployeeWithParam(1, "dpeng");
            System.out.println(employee);
        } finally {
            session.close();
        }
    }
}
