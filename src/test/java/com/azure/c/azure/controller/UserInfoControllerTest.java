package com.azure.c.azure.controller;

import com.azure.c.azure.form.UserInfoForm;
import com.azure.c.azure.po.UserInfo;
import com.azure.c.azure.service.UserInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.Valid;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoControllerTest {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void findUserByUserName() {
        List<UserInfo> cocoa = userInfoService.findByUserName("COCOA");
        Assert.assertEquals(1, cocoa.size());
    }

    @Test
    public void registerAccount() {
        UserInfoForm userInfoForm = new UserInfoForm();
        userInfoForm.setAccount("cocoa");
        userInfoForm.setPassword("123456");
        userInfoForm.setUserName("可可");
        userInfoService.registerAccount(userInfoForm);
    }


}