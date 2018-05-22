package com.learning.securedapp.web.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.annotation.Id;


/**
 * <p>Order class.</p>
 *
 * @author rajakolli
 * @version 1: 0
 */
@Data
@Builder
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private UUID orderId;
	private String email;
	private OrderLines orderLines;
	private LocalDate orderDate;
}
