package com.azure.c.azure.converter;

import com.azure.c.azure.form.UserInfoForm;
import com.azure.c.azure.po.UserInfo;

/**
 * @Author chino_cocoa
 * @Description
 * @Date 20:07 2018/10/2
 */
public class UserInfoFormUserInfoConvert {

    public static UserInfo  convert(UserInfoForm userInfoForm){
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount(userInfoForm.getAccount());
        userInfo.setEmail(userInfoForm.getEmail());
        userInfo.setGender(userInfoForm.getGender());
        userInfo.setPassword(userInfoForm.getPassword());
        userInfo.setPhone(userInfoForm.getPhone());
        userInfo.setPicture(userInfoForm.getPicture());
        userInfo.setUserName(userInfoForm.getUserName());
        return userInfo;
    }



}
