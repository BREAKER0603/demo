package com.example.demo.dao.db1;

import com.example.demo.core.universal.Mapper;
import com.example.demo.model.UserInfo;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author:SHIGS
 * @Description
 * @Date Created in 20:33 2018/5/29
 * @modified By
 */

public interface UserInfoMapper extends Mapper<UserInfo>{
    UserInfo selectById(@Param("id") Integer id);

    List<UserInfo> selectAll();
}
