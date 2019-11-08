package test;

import org.junit.jupiter.api.Test;

import stackmachine.AddExp;
import stackmachine.Calculator;
import stackmachine.FloatExp;
import stackmachine.IntExp;
import stackmachine.MultExp;
import stackmachine.SubExp;

class Stackmachine {

	@Test
	void addExp() {
		Integer i1 = Integer.valueOf(5);
		IntExp ie1 = new IntExp(3);
		IntExp ie2 = new IntExp(2);
		
		AddExp ad1 = new AddExp(ie1,ie2);
		IntExp ie3 = (IntExp) ad1.getValue();
		
		assert(ie3.getVal() == i1.intValue());
	}
	
	@Test
	void subExp() {
		Integer i1 = Integer.valueOf(1);
		IntExp ie1 = new IntExp(3);
		IntExp ie2 = new IntExp(2);
		
		SubExp ad1 = new SubExp(ie2,ie1);
		IntExp ie3 = (IntExp) ad1.getValue();
		
		assert(ie3.getVal() == i1.intValue());
	}

	@Test 
	void interpreteurAddExp() {
		IntExp ie1 = new IntExp(Integer.valueOf(10));
		IntExp ie2 = new IntExp(Integer.valueOf(20));
		
		AddExp ad1 = new AddExp(ie1,ie2);
		IntExp ie3 = (IntExp) ad1.getValue();
		assert(ie3.getVal() == 30);
	}
	
	@Test
	void interpreteurMultIntAndFloat() {
		IntExp ie1 = new IntExp(Integer.valueOf(10));
		FloatExp fe1 = new FloatExp(Float.valueOf((float) 5.8));
		
		MultExp ml1 = new MultExp(ie1,fe1);
		FloatExp fe2 = (FloatExp) ml1.getValue();
		assert(fe2.getVal() == 58.0);
	}
	
	@Test
	void testCalculator() {
		Calculator c = new Calculator();
		IntExp ie1 = new IntExp(10);
		IntExp ie2 = new IntExp(5);
		IntExp ie3 = new IntExp(20);
		IntExp ie4 = new IntExp(15);
		c.addExp(ie1);
		c.addExp(ie2);
		c.addExp(ie3);
		c.addExp(ie4);
		c.sub();
		c.add();
		c.add();
		IntExp result = (IntExp) c.result();
		assert(result.getVal()==20);
	}
}
