package com.iq.user.management.api.sql;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum UserManagementEnum {

	GET_USER_DETAILS("select c.customer_id as customer_id,c.first_name as first_name,\r\n"
			+ "c.last_name as last_name,c.email as email,\r\n" + "c.last_update as last_update\r\n"
			+ "from sakila.customer as c;");

	private String qry;

}
