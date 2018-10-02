package com.azure.c.azure.repository;

import com.azure.c.azure.po.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserInfoRepository extends JpaRepository<UserInfo,String> {

    public List<UserInfo> findByUserName(String userName);



}
