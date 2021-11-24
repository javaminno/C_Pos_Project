package com.javaGG.C_Pos_Project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.jsp.jstl.sql.Result;
import javax.sql.DataSource;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javaGG.C_Pos_Project.dto.Dto;
import com.javaGG.C_Pos_Project.util.Constant;

public class Dao {

	JdbcTemplate template;

	public Dao() {

		this.template = Constant.template;
	}

	public ArrayList<Dto> list() {
		String query = "select * from c_pos_prod order by num asc";
		return (ArrayList<Dto>) template.query(query, new BeanPropertyRowMapper(Dto.class));
	}

	public void write(final String product, final String quantity, final String price, final String cpdate) {
		this.template.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				String query="insert into c_pos_prod (num, product, quantity, price, cpdate) values (c_pos_prod_seq.nextval, ?, ?, ?, ?)";
				PreparedStatement pstmt =  con.prepareStatement(query);
				pstmt.setString(1, product);
				pstmt.setString(2, quantity);
				pstmt.setString(3, price);
				pstmt.setString(4, cpdate);
				return pstmt;
			}
		});
	}

	public void modify(final String id, final String bName,final String bTitle,final String bContent) {

		String query="update smvc_board set product = ?, quantity = ?, price = ? where bId = ?";
		this.template.update(query,new PreparedStatementSetter() {    		          
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {

				// TODO Auto-generated method stub
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4, Integer.parseInt(id));
			}
		});
	}

	public void delete(final String num) {

		String query="delete from smvc_board where num = ?";
		this.template.update(query,new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {            	
				// TODO Auto-generated method stub
				ps.setInt(1, Integer.parseInt(num));
			}
		});
	}

	public void order(final String product, final String price) {
		String query="select product,price from c_pos_prod";
		this.template.update(query,new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {

				// TODO Auto-generated method stub
				ps.setString(1, product);
				ps.setInt(2,Integer.parseInt(price));
			}
		});
	}
}
