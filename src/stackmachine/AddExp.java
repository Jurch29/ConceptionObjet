package stackmachine;

public class AddExp extends BinExp {

	private Exp exp1;
	private Exp exp2;
	
	public AddExp(IntExp exp1, IntExp exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	protected Exp getValue() {
		// TODO Auto-generated method stub
		return null;
	}
}
