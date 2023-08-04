package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosHighOrder {

	private static final Logger LOG = LoggerFactory.getLogger(MetodosHighOrder.class);

	//SUPPLIER
	public void metodo(IPersonaSupplier<String> funcion) {
		LOG.info("High order supplier: " + funcion.getId());
	}

	//CONSUMER
	public void metodoCons(IPersonaConsumer<String> nombre, String arg) {
		nombre.accept(arg);
		LOG.info("High order consumer: " + arg);
	}
	//predicate
	public void metodoPred(IPersonaPredicate<Integer> numero,Integer n) {
		
		LOG.info("High order predicate "+numero.evaluar(n));
	}
	
	//function
	
	public void metodoFunc(IPersonaFunction<String, Integer> function,Integer arg) {
		
		
		LOG.info("High order function " + function.aplicar(arg) + " String");
	}
	//Unary
	public void metodoUnary(IPersonaUnary<Double>unary,Double arg) {
		
		
		LOG.info("High order unary " + unary.aplicar(arg));
		
	}
	
}
