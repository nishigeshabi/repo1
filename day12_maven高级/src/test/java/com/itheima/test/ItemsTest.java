package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void  findById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        ItemsDao bean = ac.getBean(ItemsDao.class);

        System.out.println(bean.findById(1).getName());
    }
    @Test
    public void  findById1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        ItemsService bean = ac.getBean(ItemsService.class);

        System.out.println(bean.findById(1).getName());
    }
}
