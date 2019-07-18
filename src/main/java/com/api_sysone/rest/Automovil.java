package com.api_sysone.rest;

public class Automovil {
	
	protected int id = 1;
	protected int sedan = 270000;
	protected int coupe = 270000;
	protected int familiar = 270000;
	
	Automovil(int id, int sedan, int coupe, int familiar){
		setId(id);
		setSedan(sedan);
		setCoupe(coupe);
		setFamiliar(familiar);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSedan() {
		return sedan;
	}

	public void setSedan(int sedan) {
		this.sedan = sedan;
	}

	public int getCoupe() {
		return coupe;
	}

	public void setCoupe(int coupe) {
		this.coupe = coupe;
	}

	public int getFamiliar() {
		return familiar;
	}

	public void setFamiliar(int familiar) {
		this.familiar = familiar;
	}





}
