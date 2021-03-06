package stackmachine;

public class IntExp extends UnaryExp {

	private Integer val;
	
	public IntExp(Integer valeur) {
		this.val = valeur;
	}
	
	public Integer getVal() {
		return this.val;
	}

	@Override
	protected Exp getValue() {
		// TODO Auto-generated method stub
		return this; 
	}
	
	// Opération publique
	
	@Override
	public Exp add(Exp op) {
		// TODO Auto-generated method stub
		return op.addInt(this);
	}

	@Override
	public Exp sub(Exp op) {
		// TODO Auto-generated method stub
		return op.subInt(this);
	}

	@Override
	public Exp mult(Exp op) {
		// TODO Auto-generated method stub
		return op.multInt(this);
	}

	@Override
	public Exp div(Exp op) {
		// TODO Auto-generated method stub
		return op.divInt(this);
	}
	
	// Opération interne
	//add
	
	@Override
	public Exp addInt(IntExp exp) {
		// TODO Auto-generated method stub
		return new IntExp(this.val + exp.getVal());
	}

	@Override
	public Exp addFloat(FloatExp exp) {
		// TODO Auto-generated method stub
		return new FloatExp(this.val + exp.getVal());
	}

	@Override
	public Exp addString(StringExp exp) {
		// TODO Auto-generated method stub
		return super.addString(exp);
	}
	
	//sub
	
	@Override
	public Exp subInt(IntExp exp) {
		// TODO Auto-generated method stub
		return new IntExp(this.val - exp.getVal());
	}

	@Override
	public Exp subFloat(FloatExp exp) {
		// TODO Auto-generated method stub
		return new FloatExp(this.val - exp.getVal());
	}

	@Override
	public Exp subString(StringExp exp) {
		// TODO Auto-generated method stub
		return super.subString(exp);
	}
	
	//mult
	
	@Override
	public Exp multInt(IntExp exp) {
		// TODO Auto-generated method stub
		return new IntExp(this.val * exp.getVal());
	}

	@Override
	public Exp multFloat(FloatExp exp) {
		// TODO Auto-generated method stub
		return new FloatExp(this.val * exp.getVal());
	}

	@Override
	public Exp multString(StringExp exp) {
		// TODO Auto-generated method stub
		return super.multString(exp);
	}
	
	//div
	
	@Override
	public Exp divInt(IntExp exp) {
		// TODO Auto-generated method stub
		return new IntExp(this.val / exp.getVal());
	}

	@Override
	public Exp divFloat(FloatExp exp) {
		// TODO Auto-generated method stub
		return new FloatExp(this.val / exp.getVal());
	}

	@Override
	public Exp divString(StringExp exp) {
		// TODO Auto-generated method stub
		return super.divString(exp);
	}
}
