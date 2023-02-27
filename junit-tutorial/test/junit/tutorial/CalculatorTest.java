package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class CalculatorTest extends Calculator {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void multiplayで3と4の乗算結果が取得できる() {
		Calculator calc=new Calculator();
		int expected=12;
		int actual=calc.multiply(3, 4);
		assertThat(actual,is(expected));
	}

	@Test
	void multiplayで5と7の乗算結果が取得できる() {
		Calculator calc=new Calculator();
		int expected=12;
		int actual=calc.multiply(5, 7);
		assertThat(actual,is(expected));
	}

}
