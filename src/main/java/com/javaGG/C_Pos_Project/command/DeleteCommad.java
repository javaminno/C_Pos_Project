package com.javaGG.C_Pos_Project.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javaGG.C_Pos_Project.dao.Dao;

public class DeleteCommad implements Command {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String num = request.getParameter("num");
		
		Dao dao = new Dao();
		
		dao.delete(num);

	}

}
