package com.azure.c.azure.service.impl;


import com.azure.c.azure.converter.UserInfoFormUserInfoConvert;
import com.azure.c.azure.enums.ResultEnum;
import com.azure.c.azure.exception.AzureException;
import com.azure.c.azure.form.UserInfoForm;
import com.azure.c.azure.po.UserInfo;
import com.azure.c.azure.repository.UserInfoRepository;
import com.azure.c.azure.service.UserInfoService;
import com.azure.c.azure.utils.KeyUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public List<UserInfo> findByUserName(String userName) {
        List<UserInfo> byUserName = userInfoRepository.findByUserName(userName);
        return byUserName;
    }


    @Override
    public void registerAccount(UserInfoForm userInfoForm) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoForm, userInfo);


//        String userId = UUID.randomUUID().toString();
        String genUniqueKey = KeyUtil.genUniqueKey();
        userInfo.setId(genUniqueKey);

        userInfoRepository.save(userInfo);

    }

    @Override
    public void updateAccount(UserInfoForm userInfoForm) {
        UserInfo userInfoPO = userInfoRepository.getOne(userInfoForm.getId());
        if (userInfoPO != null) {
            throw new AzureException(ResultEnum.ACCOUNT_HAS_EXIST);
        }


        UserInfo convert = UserInfoFormUserInfoConvert.convert(userInfoForm);
        userInfoRepository.save(convert);
    }


}
