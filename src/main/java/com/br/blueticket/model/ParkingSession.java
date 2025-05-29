package com.br.blueticket.model;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ParkingSession {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
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
