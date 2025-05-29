package com.br.blueticket.model;

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
	
}
