package com.azure.c.azure.service;


import com.azure.c.azure.po.UserInfo;

import java.util.List;

public interface UserInfoService {

    List<UserInfo> findByUserName(String userName);

    void createAccount();

}
