package com.spring.jms.reciver.api.controller;

import java.util.List;

import javax.jms.JMSException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spring.jms.reciver.api.service.UserService;
import com.spring.jms.sender.api.model.User;

@Controller
public class UserJMSReciverController {
	@Autowired
	private UserService service;

	@RequestMapping(value = "/getUsers")
	public String getUsers(Model model) throws JMSException,
			JsonProcessingException {
		List<User> users = service.recive();
		model.addAttribute("users", users);
		model.addAttribute("total", users.size());
		return "userList";
	}
}
