package com.efren.imc;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Imc {

	private static int peso = Integer.parseInt(JOptionPane.showInputDialog("Introduce un peso"));
	private static double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce una altura"));
	private static double imc;

	public static double mostrarImc() {

		imc = peso / Math.pow(altura, 2);
		return Math.round(imc);
	}

	public static void inputPeso() {

		int entradaPeso = peso;
	}

	public static void inputAltura() {

		double entradaAltura = altura;
	}

	public static EImc mostrarTipo() {

		EImc tipo = null;

		if (mostrarImc() < 18.5) {

			tipo = EImc.PESO_INSUFICIENTE;

		} else if (mostrarImc() >= 18.5 && mostrarImc() < 24.9) {

			tipo = EImc.NORMOPESO;

		} else if (mostrarImc() >= 25 && mostrarImc() < 26.9) {

			tipo = EImc.SOBREPESO_GRADO_I;

		} else if (mostrarImc() >= 27 && mostrarImc() < 29.9) {

			tipo = EImc.SOBREPESO_GRADO_II;

		} else if (mostrarImc() >= 30 && mostrarImc() < 34.9) {

			tipo = EImc.OBESIDAD_TIPO_I;

		} else if (mostrarImc() >= 35 && mostrarImc() < 39.9) {

			tipo = EImc.OBESIDAD_TIPO_II;

		} else if (mostrarImc() >= 40 && mostrarImc() < 49.9) {

			tipo = EImc.OBESIDAD_TIPO_III;

		} else if (mostrarImc() >= 50) {

			tipo = EImc.OBESIDAD_TIPO_IV;
		}

		return tipo;
	}

}
