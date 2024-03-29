package com.capgemini.bankapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.capgemini.bankapp.model.BankAccount;


public class BankAppMapper implements RowMapper<BankAccount>{
	
	public BankAppMapper(){}

	public BankAccount mapRow(ResultSet rs , int rowNum) throws SQLException{

		BankAccount account = new BankAccount();
		account.setAccountId(rs.getInt(1));
		account.setAccountHolderName(rs.getString(2));
		account.setAccountType(rs.getString(3));
		account.setAccountBalance(rs.getDouble(4));
		return account;
	}
			
}