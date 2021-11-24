package com.javaGG.C_Pos_Project.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javaGG.C_Pos_Project.dao.Dao;

public class WriteCommand implements Command {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String product = request.getParameter("product");
		String quantity = request.getParameter("quantity");
		String price = request.getParameter("price");
		String cpdate = request.getParameter("cpdate");
		
		Dao dao = new Dao();
		
		dao.write(product, quantity, price, cpdate);
	}

}
