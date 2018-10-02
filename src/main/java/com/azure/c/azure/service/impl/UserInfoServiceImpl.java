package com.azure.c.azure.service.impl;


import com.azure.c.azure.po.UserInfo;
import com.azure.c.azure.repository.UserInfoRepository;
import com.azure.c.azure.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public List<UserInfo> findByUserName(String userName) {
        List<UserInfo> byUserName = userInfoRepository.findByUserName(userName);
        return byUserName;
    }

    @Override
    public void createAccount() {

    }


    // String token = UUID.randomUUID().toString();


}
