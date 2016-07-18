package com.controller;

import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.models.LoginLog;
import com.models.User;
import com.repository.LoginLogRepository;
import com.repository.UserRepository;



@Controller
@RequestMapping("/login")
@Configuration
public class LoginController {
	private final Log log = LogFactory.getLog(LoginController.class);
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	LoginLogRepository logRepository;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@ModelAttribute("userBean") User user,HttpServletRequest req){
		
		User result = userRepository.findByName(user.getName());
		if(null == result){
			log.info("error : userName not found!");
			return "error";
		}else if(!(result.getPassword()).equals(user.getPassword())){
			log.error("error : password not right!");
			return "error";
		}
		
		insertLog(result,req);
		log.info("Ok : "+result.getName()+"--"+result.getId());
		return "home";
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public void login0(@ModelAttribute("userBean") User user){
		
		User u = userRepository.findByName("hi");
		System.out.println("Ok : "+u.getId()+u.getName()+u.getPassword());
	}
	
	
	private void insertLog(User user,HttpServletRequest req){
		HttpSession session = req.getSession(true);
		session.setAttribute("user", user);
		LoginLog log = new LoginLog();
		log.setLogid(UUID.randomUUID().getLeastSignificantBits());
		log.setIsactive(1);
		log.setUser(user);
		log.setLogintime(new Date());
		log.setSessionid(session.getId());
		logRepository.save(log);
	}
	

}
