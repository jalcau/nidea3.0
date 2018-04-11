package com.ipartek.nidea.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Test;

import com.ipartek.formacion.nidea.pojo.Bebida;

public class BebidaTest {

	@Test
	public void validar() {

		try {

			// Crear Factoria y Validador
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			// Si ponemos precio correcto, solo falla el nombre que es == ""
			Bebida bebida = new Bebida();

			Set<ConstraintViolation<Bebida>> violations = validator.validate(bebida);

			assertTrue(violations.size() == 2);
			bebida.setPrecio(0.2f);
			bebida.setNombre("ab");
			violations = validator.validate(bebida);
			assertTrue(violations.size() == 1);
			Iterator<ConstraintViolation<Bebida>> it = violations.iterator();
			ConstraintViolation<Bebida> violation = null;
			while (it.hasNext()) {
				violation = it.next();
				assertEquals("nombre", violation.getPropertyPath().toString());
				assertEquals("ab", violation.getInvalidValue());

				// violation.getMessage();

			}

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

}