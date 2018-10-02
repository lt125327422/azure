package com.azure.c.azure.controller;

import com.azure.c.azure.po.UserInfo;
import com.azure.c.azure.service.UserInfoService;
import com.azure.c.azure.utils.ResultVOUtil;
import com.azure.c.azure.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author chino_cocoa
 * @Description //TODO
 * @Date 12:19 2018/10/2
 */
@RestController
@RequestMapping("/userInfo")
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
        System.out.println("userName = " + userName);
        List<UserInfo> byUserName = userInfoService.findByUserName(userName);

        return ResultVOUtil.success(byUserName);

    }

    @GetMapping("/index")
    public String index(){
        return "hello world spring boot ";
    }




}
