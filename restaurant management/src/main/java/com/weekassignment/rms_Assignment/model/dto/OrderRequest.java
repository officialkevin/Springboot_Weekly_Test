package com.weekassignment.rms_Assignment.model.dto;

import com.weekassignment.rms_Assignment.model.Order;
import lombok.Data;

@Data
public class OrderRequest {
    private Order order;
    private AuthenticationInput authenticationInput;
}
