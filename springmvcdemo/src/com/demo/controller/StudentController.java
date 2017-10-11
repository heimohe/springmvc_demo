package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.service.StudentManager;
//@Controller 负责注册一个bean 到spring 上下文中，bean 的ID 默认为类名称开头字母小写
@Controller
@RequestMapping("/student-module")
public class StudentController {
	// @Autowired 根据bean 类型从spring 上线文中进行查找，注册类型必须唯一，否则报异常。
	@Autowired
    StudentManager manager;
	//@RequestMapping 可以声明到类或方法上
    @RequestMapping(value = "/getStudentInfo", method = RequestMethod.GET)
    public String getStudentInfo(Model model) {
        model.addAttribute("students", manager.getAllStudents());
        return "showStudentInfo";
    }
}
