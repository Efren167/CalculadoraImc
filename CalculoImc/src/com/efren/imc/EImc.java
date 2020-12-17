package com.efren.imc;

public enum EImc {

	

	PESO_INSUFICIENTE("Peso insuficiente"), NORMOPESO("Peso normal"), SOBREPESO_GRADO_I(
			"Sobrepeso grado I"), SOBREPESO_GRADO_II("Sobrepeso grado II(Preobesidad)"), OBESIDAD_TIPO_I(
					"Obesidad tipo I"), OBESIDAD_TIPO_II("Obesidad tipo II"), OBESIDAD_TIPO_III(
							"Obesidad tipo III(mórbida)"), OBESIDAD_TIPO_IV("Obesidad tipo IV(extrema)");

	private String tipo;

	private EImc(String tipo) {

		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
		
		
	}
	
	@Override
	public String toString() {
		
		return "tipo: " + tipo;
	}
}
