package com.api_sysone.rest;

import java.util.Scanner;

public class opcionales extends Automovil{
	
	opcionales(int id, int sedan, int coupe, int familiar) {
		super(id, sedan, coupe, familiar);
		// TODO Auto-generated constructor stub
	}

	protected int TC=12000;
	protected int AA=20000;
	protected int ABS=14000;
	protected int AB=7000;
	protected int LL=12000;

	public int getTC() {
		return TC;
	}

	public void setTC(int tC) {
		TC = tC;
	}

	public int getAA() {
		return AA;
	}

	public void setAA(int aA) {
		AA = aA;
	}

	public int getABS() {
		return ABS;
	}

	public void setABS(int aBS) {
		ABS = aBS;
	}

	public int getAB() {
		return AB;
	}

	public void setAB(int aB) {
		AB = aB;
	}

	public int getLL() {
		return LL;
	}

	public void setLL(int lL) {
		LL = lL;
	}

}

public class MainOpcionales{
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Hola mundo");
	}
	
	
} 

