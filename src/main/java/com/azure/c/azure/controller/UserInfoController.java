package com.azure.c.azure.controller;

import com.azure.c.azure.form.UserInfoForm;
import com.azure.c.azure.po.UserInfo;
import com.azure.c.azure.service.UserInfoService;
import com.azure.c.azure.utils.ResultVOUtil;
import com.azure.c.azure.vo.ResultVO;
import com.azure.c.azure.vo.UserInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author chino_cocoa
 * @Description //TODO
 * @Date 12:19 2018/10/2
 */
@RestController
@RequestMapping("/userInfo")
@Slf4j
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    //  http://127.0.0.1:8083/azurec/userInfo/findUserByName?userName=cocoa

    /**
     * 根据用户的名字来获取该用户信息
     * @param userName
     * @return
     */
    @GetMapping("/findUser")
    public ResultVO findUserByUserName(@RequestParam("userName")String  userName) {
        List<UserInfo> userInfoList = userInfoService.findByUserName(userName);

        log.info("测试方法{}azure",333 );


        List<UserInfoVO> userInfoVOList = new ArrayList<>();
        for (UserInfo userInfo : userInfoList) {
            UserInfoVO userInfoVO = new UserInfoVO();
            BeanUtils.copyProperties(userInfo, userInfoVO);
            userInfoVOList.add(userInfoVO);
        }

        return ResultVOUtil.success(userInfoVOList);
    }


    /**
     * 跳转注册成功页面或其他主页
     * @param userInfoForm
     */
    @PostMapping("/registerAccount")
    public void registerAccount(@Valid UserInfoForm userInfoForm){
        userInfoService.registerAccount(userInfoForm);

    }


    @PostMapping("/modificationAccount")
    public void  modification(UserInfoForm userInfoForm){
        userInfoService.updateAccount(userInfoForm);


    }


}
