package com.arvato.baboci.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.arvato.baboci.Model.Bug;

public class BugMapper implements RowMapper<Bug> {

	@Override
	public Bug mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bug bug = new Bug();
		
		bug.setBugId(rs.getInt("BugId"));
		bug.setName(rs.getString("name"));
		bug.setDescription(rs.getString("description"));
		bug.setBugHoldersName(rs.getString("BugHoldersName"));
		bug.setImportance(rs.getString("Importance"));
		
		return bug;
	}

	
	
}
