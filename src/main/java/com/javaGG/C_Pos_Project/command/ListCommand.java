package com.javaGG.C_Pos_Project.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javaGG.C_Pos_Project.dao.Dao;
import com.javaGG.C_Pos_Project.dto.Dto;

public class ListCommand implements Command {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		
		Dao dao = new Dao();
		
		ArrayList<Dto> dtos = dao.list();
		model.addAttribute("list", dtos);
	}

}
