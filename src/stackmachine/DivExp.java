package stackmachine;

public class DivExp extends BinExp {

	private Exp exp1;
	private Exp exp2;
	
	public DivExp(Exp exp1, Exp exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	public Exp getValue() {
		// TODO Auto-generated method stub
		return exp1.div(exp2);
	}
}
