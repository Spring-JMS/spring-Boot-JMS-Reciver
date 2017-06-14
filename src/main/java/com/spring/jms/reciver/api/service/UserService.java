package com.spring.jms.reciver.api.service;

import java.util.List;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.jms.sender.api.model.User;

@Service
public class UserService {
	@Autowired
	private JmsTemplate template;

	private Logger log = LoggerFactory.getLogger(UserService.class);

	@SuppressWarnings("unchecked")
	public List<User> recive() throws JMSException, JsonProcessingException {
		Message message = template.receive();
		ObjectMessage objectMessage = (ObjectMessage) message;
		log.debug(": - " + objectMessage);
		List<User> users = (List<User>) objectMessage.getObject();
		log.info("Received  : " + new ObjectMapper().writeValueAsString(users));
		return users;
	}
}
