package com.example.demo.funcional;

public class PersonaPredicaImpl implements IPersonaPredicate<Integer>{

	@Override
	public boolean evaluar(Integer arg) {
		
			if (arg.compareTo(2) >= 0) {
				return true;
			} else {
				return false;
			}

		
	}



	
	
}
