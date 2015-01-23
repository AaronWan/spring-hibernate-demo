package com.aaron.exam.manager;

import com.aaron.exam.entity.User;

public interface IUserManager {
	public int lookUser();
	public int deleteUser(int id);
	public void saveUser(User user);
	
}
