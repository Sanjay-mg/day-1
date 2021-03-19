import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestMath {
	Math math;
	@BeforeEach
	void init(){
		System.out.println("init");
		math = new Math();
	}
	@Test
	void testAdd() {
		int result = math.add(1,2,3);
		assertEquals(6, result);
	}
	@Test
	void testAddWithNegativeNumbers() {
		int result1 = math.add(-1,-2,-3);
		assertEquals(-6, result1);
	}
	@Test
	void testMultiply() {
		int result2 = math.multiply(3, 4);
		assertEquals(12, result2);
	}
	@Test
	void testMultiplyWithOneZero() {
		int result3 = math.multiply(5, 0);
		assertEquals(0, result3);
	}
//	@Test
//	void testMultiplyWithOneNegative() {
//		Exception exception = assertThrows(IllegalArgumentException.class,()->{
//			math.multiply(-2, 4);
//		});
//	}
}
