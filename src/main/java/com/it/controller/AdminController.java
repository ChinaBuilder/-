package com.it.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.it.dto.DataTableResult;
import com.it.pojo.User;
import com.it.service.UserService;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	@Autowired
	private UserService UserService;

	/**
	 * 显示管理员首页
	 * 
	 * @return
	 */
	@RequestMapping(value = "/home")
	public String showHome() {
		return "/admin/home";
	}

	@RequestMapping(value = "/user/new")
	@ResponseBody
	public String showInsertPage(User user) {
		UserService.insertOne(user);
		return "success";
	}

	/**
	 * 显示用户列表界面（需要管理员权限）
	 * 
	 * @return
	 */
	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
	public String showUserList() {
		return "/admin/userlist";
	}

	/**
	 * 异步加载用户列表
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/userlist/load", method = RequestMethod.GET)
	@ResponseBody
	public DataTableResult<User> loadUserList(HttpServletRequest request) {
		String draw = request.getParameter("draw");
		String start = request.getParameter("start");
		String length = request.getParameter("length");
		String keyword = request.getParameter("search[value]");

		DataTableResult<User> dataTableResult = UserService.findByParam(draw, start, length, keyword);
		return dataTableResult;
	}

	@RequestMapping(value = "/user/resetpassword")
	@ResponseBody
	public String resetPassword(Integer id, HttpServletRequest req) {
		// Integer id = req.getParameter()
		if (UserService.resetPassword(id)) {
			return "success";
		} else {
			return "fail";
		}
	}
}
