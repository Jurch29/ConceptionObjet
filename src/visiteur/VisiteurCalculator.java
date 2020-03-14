package visiteur;

import stackmachine.UnaryExp;

public abstract class VisiteurCalculator {

	public abstract void addExp(UnaryExp u);
	public abstract void add();
	public abstract void sub();
	public abstract void mult();
	public abstract void div();
	public abstract UnaryExp output(); 
	
}
