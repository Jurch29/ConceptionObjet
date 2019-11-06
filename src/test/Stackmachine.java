package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import stackmachine.AddExp;
import stackmachine.Exp;
import stackmachine.IntExp;
import stackmachine.SubExp;

class Stackmachine {

	@Test
	void addExp() {
		Integer i1 = new Integer(5);
		IntExp ie1 = new IntExp(3);
		IntExp ie2 = new IntExp(2);
		
		AddExp ad1 = new AddExp(ie1,ie2);
		IntExp ie3 = (IntExp) ad1.getValue();
		
		assert(ie3.getVal() == i1.intValue());
	}
	
	@Test
	void subExp() {
		Integer i1 = new Integer(1);
		IntExp ie1 = new IntExp(3);
		IntExp ie2 = new IntExp(2);
		
		SubExp ad1 = new SubExp(ie1,ie2);
		IntExp ie3 = (IntExp) ad1.getValue();
		
		assert(ie3.getVal() == i1.intValue());
	}

}
