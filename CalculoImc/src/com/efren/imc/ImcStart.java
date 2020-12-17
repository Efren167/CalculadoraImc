package com.efren.imc;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ImcStart {

	public static void main(String[] args) {

		Imc.inputPeso();
		Imc.inputAltura();
		System.out.println("su IMC es: " + Imc.mostrarImc());
		System.out.println("Su IMC tiene un tipo de: " + Imc.mostrarTipo());
	}

}
