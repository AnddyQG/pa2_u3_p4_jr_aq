package com.example.demo.funcional;

public class PersonaUnaryImpl implements IPersonaUnary<Double>{

	@Override
	public Double aplicar(Double arg) {
		Double num = arg * 0.3;
		return num;
	}

	
	
}
