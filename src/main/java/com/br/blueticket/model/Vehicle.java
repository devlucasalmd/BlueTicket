package com.br.blueticket.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {

	@NotNull
	private String plate;
	
	@NotNull
	private String model;
	
	@NotNull
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
}
