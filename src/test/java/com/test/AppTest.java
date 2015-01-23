package com.test;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.aaron.exam.SpringServicesContextUtil;
import com.aaron.exam.entity.User;
import com.aaron.exam.manager.IUserManager;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-*-config.xml"})
@Transactional
@TransactionConfiguration(transactionManager="H4TxManager",defaultRollback=false)
public class AppTest {
	@Test
    public void testService() {  
    	IUserManager userManage=SpringServicesContextUtil.getBean("userManager");
        Assert.notNull(userManage);  
    }  
	
	@Test
    public void addUser(){
    	IUserManager userManage=SpringServicesContextUtil.getBean("userManager");
    	int num = userManage.lookUser();
    	userManage.saveUser(newUser());
    	assertEquals(userManage.lookUser(), num+1);
    }
    
    
    public User newUser(){
    	User u = new User();
    	u.setUsername("test");
    	u.setPassword("pwd");
    	return u;
    }
    
}
