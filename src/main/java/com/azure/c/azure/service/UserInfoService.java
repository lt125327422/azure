package com.azure.c.azure.service;


import com.azure.c.azure.form.UserInfoForm;
import com.azure.c.azure.po.UserInfo;

import java.util.List;

public interface UserInfoService {

    List<UserInfo> findByUserName(String userName);


    void registerAccount(UserInfoForm userInfoForm);


    void updateAccount(UserInfoForm userInfoForm);

}
