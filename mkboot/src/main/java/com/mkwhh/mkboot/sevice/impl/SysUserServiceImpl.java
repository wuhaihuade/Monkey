package com.mkwhh.mkboot.sevice.impl;

import com.mkwhh.mkboot.dao.SysUserMapper;
import com.mkwhh.mkboot.model.SysUser;
import com.mkwhh.mkboot.sevice.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByUserId(Long userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.selectAll();
    }
}
