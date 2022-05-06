package com.iq.user.management.api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.iq.user.management.api.bean.Customer;
import com.iq.user.management.api.constant.UserManagementConstant;
import com.iq.user.management.api.sql.UserManagementEnum;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserManagementDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public List<Customer> getUser() {
		log.info("Starting getUser() :: ");
		Integer id=1;
		SqlParameterSource sqlParameterSource=new MapSqlParameterSource("id", id);

	return namedParameterJdbcTemplate.query(UserManagementEnum.GET_USER_DETAILS.getQry(), 
			(rs,rowNum)->{
				Customer customer=new Customer();
				customer.setCustomer_id(rs.getInt(UserManagementConstant.CUSTOMER_ID));
				customer.setFirst_name(rs.getString(UserManagementConstant.FIRST_NAME));
				customer.setLast_name(rs.getString(UserManagementConstant.LAST_NAME));
				customer.setEmail(rs.getString(UserManagementConstant.EMAIL));
				customer.setLast_update(rs.getString(UserManagementConstant.LAST_UPDATE));
				
				return customer;
			});
			}
}
