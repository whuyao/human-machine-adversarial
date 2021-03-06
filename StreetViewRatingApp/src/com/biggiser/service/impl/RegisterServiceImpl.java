package com.biggiser.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.biggiser.beans.UserBean;
import com.biggiser.mapper.UserMapper;
import com.biggiser.service.IRegisterService;

/**
 * @author Jiale Wang, Yao Yao
 * HPSCIL & LIESMARS
 */

@Service
public class RegisterServiceImpl implements IRegisterService{

    @Resource
    private UserMapper um;
	
	@Override
	public int Register(UserBean user) {		
		try {
			return um.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return 0;
	}
	
	@Override
    public UserBean Login(String username, String password) {
        return um.login(username, password);
    }
}
