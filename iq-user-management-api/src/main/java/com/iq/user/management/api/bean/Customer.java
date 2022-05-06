package com.iq.user.management.api.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author obula
 *The class Customer
 */
@Setter
@Getter
@NoArgsConstructor
public class Customer {

	/**  The customer_id */
	private Integer customer_id;

	/** The first_name */
	private String first_name;

	/** The last_name */
	private String last_name;

	/** The email */
	private String email;

	/** The last_update */
	private String last_update;
}
