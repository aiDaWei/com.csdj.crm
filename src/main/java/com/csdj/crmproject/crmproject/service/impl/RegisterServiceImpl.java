package com.csdj.crmproject.crmproject.service.impl;

import com.csdj.crmproject.crmproject.dao.RegisterMapper;
import com.csdj.crmproject.crmproject.entity.Department;
import com.csdj.crmproject.crmproject.service.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author BlueWhaleMain
 * @date 2020-2-21 20:33:23
 * 注册服务实现
 */
@Service("RegisterServiceImpl")
public class RegisterServiceImpl implements RegisterService {
    @Resource
    private RegisterMapper registerMapper;

    @Override
    public int register(String userName, String password, Integer departmentId, String userIphone, String userEmail) {
        return registerMapper.register(userName, password, departmentId, (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date()), userIphone, userEmail);
    }

    @Override
    public List<Department> getDepartment(Integer departmentId) {
        return registerMapper.getDepartment(departmentId);
    }
}
