package com.waciao.dao.impl;

import com.waciao.dao.UserMapper;
import com.waciao.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author: Waciao
 * @Date: 2020/3/27
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
public class UserMapperImpl implements UserMapper {

    // 所有操作都使用 sqlSession 来执行，在原来，现在都使用SqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> query() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.query();
    }
}
