package org.example.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.BrandMapper;
import org.example.pojo.Brand;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mybatisTest {
    @Test
    public void testSelectAll() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = brandMapper.brandSelectAll();
        System.out.println(brands);
        sqlSession.close();
    }

    @Test
    public void testSelectByID() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = brandMapper.brandSelectById(1);
        System.out.println(brand);
        sqlSession.close();
    }

    @Test
    public void testSelectByCondition() throws IOException {
        int status=0;
        String companyName="三";
        //String brandName="三";
        companyName="%"+companyName+"%";
        //brandName="%"+brandName+"%";
        //System.out.println(companyName+brandName);

        Brand brand=new Brand();
        //brand.setBrandName(brandName);
        brand.setStatus(status);
        brand.setCompanyName(companyName);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
        //System.out.println(brands);
        System.out.println(brandMapper.selectByCondition(brand));
        sqlSession.close();
    }


    @Test
    public void testSelectByConditionSingle() throws IOException {
        int status=0;
        String companyName="华";
        //String brandName="三";
        companyName="%"+companyName+"%";
        //brandName="%"+brandName+"%";
        //System.out.println(companyName+brandName);

        Brand brand=new Brand();
        //brand.setBrandName(brandName);
        //brand.setStatus(status);
        //brand.setCompanyName(companyName);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
        //System.out.println(brands);
        System.out.println(brandMapper.selectByCondition(brand));
        sqlSession.close();
    }

    @Test
    public void testAdd() throws IOException {
        int status=0;
        String companyName="联想技术有限公司";
        String brandName="联想";
        Integer ordered=100;
        String description="事事联想";

        //System.out.println(companyName+brandName);

        Brand brand=new Brand();
        brand.setBrandName(brandName);
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setOrdered(ordered);
        brand.setDescription(description);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
        //System.out.println(brands);
        brandMapper.add(brand);
        sqlSession.commit();
        System.out.println(brandMapper.brandSelectAll());
        sqlSession.close();
    }

    @Test
    public void updata() throws IOException {
        int status=0;
        String companyName="联想技术有限公司";
        String brandName="联想";
        Integer ordered=100;
        String description="事事联想";

        //System.out.println(companyName+brandName);

        Brand brand=new Brand();
        brand.setBrandName(brandName);
        //brand.setStatus(status);
        //brand.setCompanyName(companyName);
        brand.setOrdered(ordered);
        brand.setDescription(description);
        brand.setId(3);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
        //System.out.println(brands);
        brandMapper.update01(brand);
        System.out.println(brandMapper.brandSelectAll());
        sqlSession.close();
    }


    @Test
    public void testDelectById() throws IOException {
        int status=0;
        String companyName="联想技术有限公司";
        String brandName="联想";
        Integer ordered=100;
        String description="事事联想";

        //System.out.println(companyName+brandName);

        Brand brand=new Brand();
        brand.setBrandName(brandName);
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setOrdered(ordered);
        brand.setDescription(description);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
        //System.out.println(brands);
        brandMapper.deleteById(4);
        System.out.println(brandMapper.brandSelectAll());
        sqlSession.close();
    }

    @Test
    public void testDelectByIdS() throws IOException {
        int status=0;
        String companyName="联想技术有限公司";
        String brandName="联想";
        Integer ordered=100;
        String description="事事联想";

        //System.out.println(companyName+brandName);

        Brand brand=new Brand();
        brand.setBrandName(brandName);
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setOrdered(ordered);
        brand.setDescription(description);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
        //System.out.println(brands);
        brandMapper.deleteByIdS(new int[]{2,3});
        System.out.println(brandMapper.brandSelectAll());
        sqlSession.close();
    }
}
