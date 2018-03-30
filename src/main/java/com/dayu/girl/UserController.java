package com.dayu.girl;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dayu.girl.poji.IMoocJSONResult;
import com.dayu.girl.poji.User;

//@Controller
@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
	// @ResponseBody
	public User getUser() {
		User u = new User();
		u.setName("dayumissyou");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("123123");
		u.setDesc("good boy!");
		return u;
	}

	@GetMapping("/getUserJson")
	// @ResponseBody
	public IMoocJSONResult getUserJson() {
		User u = new User();
		u.setName("DAYU");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("123123");
		u.setDesc("学生优秀");

		return IMoocJSONResult.ok(u);
	}

}
