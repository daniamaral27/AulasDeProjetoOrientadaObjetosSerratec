package br.edu.senai.model;

public enum estadoCivil {
	SOLTEIRO('S'), CASADO('C'), VIUVO('V'), DIVORCIADO('D');
	
	private char estadocivil;

	private estadoCivil(char estadocivil) {
		this.estadocivil = estadocivil;
	}

	public char getEstadocivil() {
		return estadocivil;
	}

	
}
