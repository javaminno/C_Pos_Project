package com.javaGG.C_Pos_Project.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javaGG.C_Pos_Project.dao.Dao;

public class OrderCommand implements Command	{

	@Override
	public void excute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String product = request.getParameter("product");
		String price = request.getParameter("price");
		
		Dao dao = new Dao();
		
		dao.order(product, price);
	}
}
