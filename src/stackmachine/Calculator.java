package stackmachine;

import java.util.Stack;

import visiteur.VisiteurCalculator;

public class Calculator extends VisiteurCalculator {
	
	Stack<UnaryExp> s;
	
	public Calculator() {
		this.s = new Stack<UnaryExp>();
	}

	@Override
	public void addExp(UnaryExp u) {
		// TODO Auto-generated method stub
		s.push(u);
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		UnaryExp u = s.pop();
		UnaryExp u1 = s.pop();
		s.push((UnaryExp) u.add(u1));
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		UnaryExp u = s.pop();
		UnaryExp u1 = s.pop();
		s.push((UnaryExp) u.sub(u1));
	}

	@Override
	public void mult() {
		// TODO Auto-generated method stub
		UnaryExp u = s.pop();
		UnaryExp u1 = s.pop();
		s.push((UnaryExp) u.mult(u1));
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		UnaryExp u = s.pop();
		UnaryExp u1 = s.pop();
		s.push((UnaryExp) u.div(u1));
	}

	@Override
	public UnaryExp output() {
		// TODO Auto-generated method stub
		return s.pop();
	}
}
