package cn.itsource.aigou.controller;

import cn.itsource.aigou.domain.Employee;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    /**
     * 参数: Employee
     * 返回值:登录是否成功 AjaxResult
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        //模拟账号和密码相对比  现在是直接把账号密码确定好了的
        if ("domain".equals(employee.getName())&&"0".equals(employee.getPassword())){
            return AjaxResult.me();
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或密码错误");
    }
}
