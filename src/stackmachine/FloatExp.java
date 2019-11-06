package stackmachine;

public class FloatExp extends UnaryExp {

	private Float val;
	
	public FloatExp(Float valeur) {
		this.val = valeur;
	}
	
	public Float getVal() {
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
		return op.addFloat(this);
	}

	@Override
	public Exp sub(Exp op) {
		// TODO Auto-generated method stub
		return op.subFloat(this);
	}

	@Override
	public Exp mult(Exp op) {
		// TODO Auto-generated method stub
		return op.multFloat(this);
	}

	@Override
	public Exp div(Exp op) {
		// TODO Auto-generated method stub
		return op.divFloat(this);
	}
	
	// Opération interne
	//add
		
	@Override
	public Exp addInt(IntExp exp) {
		// TODO Auto-generated method stub
		return new FloatExp(this.val + exp.getVal());
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
		return new FloatExp(this.val - exp.getVal());
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
		return new FloatExp(this.val * exp.getVal());
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
		return new FloatExp(this.val / exp.getVal());
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
