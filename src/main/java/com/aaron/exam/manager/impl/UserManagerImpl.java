package com.aaron.exam.manager.impl;

import com.aaron.exam.SpringServicesContextUtil;
import com.aaron.exam.dao.IUserDao;
import com.aaron.exam.entity.User;
import com.aaron.exam.manager.IUserManager;

public class UserManagerImpl implements IUserManager {
	
	private IUserDao getUserDao(){
		return SpringServicesContextUtil.getBean("userDao");
	}
	public int lookUser() {
		return getUserDao().lookUser();
	}
	/**
	 * 删除表数据
	 * @return
	 */
	public int deleteUser(int id){
		return getUserDao().deleteUser(id);
	}
	/**
	 * 添加数据
	 * @param user
	 */
	public void saveUser(User user){
		getUserDao().saveUser(user);
	}
}
