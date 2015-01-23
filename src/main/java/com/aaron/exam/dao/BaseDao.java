package com.aaron.exam.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.aaron.exam.SpringServicesContextUtil;

public class BaseDao {

	public Session getCurrentSession() {
		return ((SessionFactory) SpringServicesContextUtil
				.getBean("sessionFactory")).getCurrentSession();
	}
}