package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.service.StudentManager;
//@Controller ����ע��һ��bean ��spring �������У�bean ��ID Ĭ��Ϊ�����ƿ�ͷ��ĸСд
@Controller
@RequestMapping("/student-module")
public class StudentController {
	// @Autowired ����bean ���ʹ�spring �������н��в��ң�ע�����ͱ���Ψһ�������쳣��
	@Autowired
    StudentManager manager;
	//@RequestMapping ������������򷽷���
    @RequestMapping(value = "/getStudentInfo", method = RequestMethod.GET)
    public String getStudentInfo(Model model) {
        model.addAttribute("students", manager.getAllStudents());
        return "showStudentInfo";
    }
}
