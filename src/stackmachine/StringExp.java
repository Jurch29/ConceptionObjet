package stackmachine;

public class StringExp extends UnaryExp {
	
	private String val;
	
	public StringExp(String valeur) {
		this.val = valeur;
	}
	
	public String getVal() {
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
		return op.addString(this);
	}

	@Override
	public Exp sub(Exp op) {
		// TODO Auto-generated method stub
		return op.subString(this);
	}

	@Override
	public Exp mult(Exp op) {
		// TODO Auto-generated method stub
		return op.multString(this);
	}

	@Override
	public Exp div(Exp op) {
		// TODO Auto-generated method stub
		return op.divString(this);
	}

	// Opération interne
	//add
	
	@Override
	public Exp addInt(IntExp exp) {
		// TODO Auto-generated method stub
		return super.addInt(exp);
	}

	@Override
	public Exp addFloat(FloatExp exp) {
		// TODO Auto-generated method stub
		return super.addFloat(exp);
	}

	@Override
	public Exp addString(StringExp exp) {
		// TODO Auto-generated method stub
		return new StringExp(this.val + exp.getVal());
	}
	
	//sub
	
	@Override
	public Exp subInt(IntExp exp) {
		// TODO Auto-generated method stub
		return super.subInt(exp);
	}

	@Override
	public Exp subFloat(FloatExp exp) {
		// TODO Auto-generated method stub
		return super.subFloat(exp);
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
		return super.multInt(exp);
	}

	@Override
	public Exp multFloat(FloatExp exp) {
		// TODO Auto-generated method stub
		return super.multFloat(exp);
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
		return super.divInt(exp);
	}

	@Override
	public Exp divFloat(FloatExp exp) {
		// TODO Auto-generated method stub
		return super.divFloat(exp);
	}

	@Override
	public Exp divString(StringExp exp) {
		// TODO Auto-generated method stub
		return super.divString(exp);
	}
	
}
