package stackmachine;

public class IntExp extends Exp {

	private Integer val;
	
	public IntExp(Integer valeur) {
		this.val = valeur;
	}

	@Override
	protected Exp getValue() {
		// TODO Auto-generated method stub
		return this;
	}
}
