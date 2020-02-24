package com.csdj.crmproject.crmproject.controller;

import com.csdj.crmproject.crmproject.entity.Department;
import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.service.RegisterService;
import com.csdj.crmproject.crmproject.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author BlueWhaleMain
 * 注册控制器
 */
@RequestMapping("register")
@Controller
public class RegisterController {
    @Resource
    private RegisterService registerService;
    @Resource
    private UserService userService;
    private final Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @RequestMapping("")
    public String index(){
        return "register";
    }

    @GetMapping("username_check")
    @ResponseBody
    public Map<String, Object> usernameCheck(@RequestParam("username") String username) {
        Map<String, Object> result = new HashMap<>(3);
        try {
            User user = userService.login(username);
            if (user == null) {
                result.put("occupy", false);
            } else {
                result.put("occupy", true);
            }
            result.put("code", 200);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            result.put("code", 500);
            result.put("msg", "服务器错误");
        }
        return result;
    }

    @PostMapping("register")
    @ResponseBody
    public Map<String, Object> register(@RequestParam("user_name") String userName,
                                        @RequestParam("user_password") String password,
                                        @RequestParam("department_id") Integer departmentId,
                                        @RequestParam(value = "user_iphone", required = false) String userIphone,
                                        @RequestParam(value = "user_email", required = false) String userEmail) {
        Map<String, Object> result = new HashMap<>(3);
        try {
            User user = userService.login(userName);
            if (user == null) {
                List<Department> departments = registerService.getDepartment(departmentId);
                if (departments.size() > 0 && departments.get(0).getPkDepartmentId() == departmentId) {
                    result.put("count", registerService.register(userName, password, departmentId, userIphone, userEmail));
                    result.put("code", 200);
                } else {
                    result.put("code", 400);
                    result.put("msg", "未知部门ID");
                }
            } else {
                result.put("code", 400);
                result.put("msg", "用户名已被占用");
            }
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            result.put("code", 500);
            result.put("msg", "服务器错误");
        }
        return result;
    }
}
