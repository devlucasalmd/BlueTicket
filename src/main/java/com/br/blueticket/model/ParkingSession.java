package com.br.blueticket.model;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;

public class ParkingSession {

	@NotNull
	private User user;
	
	@NotNull
	private Vehicle vehicle;
	
	@NotNull
	private Street street;
	
	@NotNull
	private LocalDateTime duration;
	
	@NotNull
	private LocalDateTime startStop;
	
	@NotNull
	private LocalDateTime endStop;
	
	@NotNull
	private Double value;
		
	private Boolean status;
	
	
}
