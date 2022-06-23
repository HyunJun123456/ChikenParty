package com.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.test.dto.UserDto;
import com.test.service.UserService;



@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String welcomePage(ModelMap model, UserDto dto) {
		if(dto.getUserId().equals("admin")&&dto.getUserPw().equals("1234")) {
			return "redirect:welcome?userId=admin&userNm=storeA";
		}
		if(dto.getUserId().equals("user1")&&dto.getUserPw().equals("1234")) {
			UserDto test = userService.infoChain(dto.getUserId());
			return "redirect:welcomechain?userId=" +dto.getUserId() + "&userNm=" + test.getUserNm();
		}
		if(dto.getUserId().equals("user2")&&dto.getUserPw().equals("1234")) {
			UserDto test = userService.infoChain(dto.getUserId());
			return "redirect:welcomechain?userId=" +dto.getUserId() + "&userNm=" + test.getUserNm();
	      }
		model.put("errorMsg", "Please provide the correct userid and userpw");
		
		return "login";
	}
	
	@RequestMapping(value="/welcomechain")
	public String welcomeChain(Model model, String userId,String userNm) {
		model.addAttribute("list", userService.infoChain(userId));
		return "StoreInfo";
	}

	@RequestMapping(value="/welcome")
	public String welcomPage(Model model) {
		model.addAttribute("list",  userService.info());
		return "myStoreInfo";
	}


	
	
	}


