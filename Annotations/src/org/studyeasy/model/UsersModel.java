package org.studyeasy.model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.studyeasy.entity.User;

public class UsersModel {

	@Resource
	public List<User> listusers(DataSource datasource) {
		
		List<User> list = new ArrayList<>();
    	Connection con = null;
    	Statement state = null;
    	ResultSet rs = null;
    	
    	try {
			con = datasource.getConnection();
			String query = "select * from execution";
			state = con.createStatement();
			rs = state.executeQuery(query);
			while(rs.next()) {
				
				list.add(new User(rs.getInt("userid"), rs.getString("executionenv"), 
						rs.getInt("noofcases")));
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    		return list;
	}
}
