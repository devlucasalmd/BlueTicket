package com.br.blueticket.model;


public enum Category {

	CAR("Carro"),
	MOTORCYCLE("Moto"),
	TRUCK("Caminhao"),
	BUS("Onibus");
	
	private String description;
	
	private Category(String description) {
		this.description = description;
	}

	private String getDescription() {
		return description;
	}
}
