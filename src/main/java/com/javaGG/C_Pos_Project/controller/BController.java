package com.javaGG.C_Pos_Project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaGG.C_Pos_Project.command.*;
import com.javaGG.C_Pos_Project.util.Constant;

@Controller
public class BController {
	
	Command command = null;
	
	private JdbcTemplate template;
	@Autowired		
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		command = new ListCommand();
		command.excute(model);
		
		return "list";
	}	
	
	@RequestMapping("/writeForm")
	public String writeForm(Model model) {
		
		return "writeForm";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new WriteCommand();
		command.excute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new ModifyCommand();
		command.excute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new DeleteCommad();
		command.excute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/order")
	public String order(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		
		command = new OrderCommand();
		command.excute(model);
		
		return "order";
	}
	
}
