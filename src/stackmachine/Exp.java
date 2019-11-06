package stackmachine;

public abstract class Exp {
	
	protected abstract Exp getValue();
	
	public Exp add(Exp op) { throw new Error(); }
	public Exp sub(Exp op) { throw new Error(); }
	public Exp mult(Exp op) { throw new Error(); }
	public Exp div(Exp op) { throw new Error(); }
	
	protected Exp addInt(IntExp exp) { throw new Error(); };
	protected Exp addFloat(FloatExp exp) { throw new Error(); };
	protected Exp addString(StringExp exp) { throw new Error(); };
	
	protected Exp subInt(IntExp exp) { throw new Error(); };
	protected Exp subFloat(FloatExp exp) { throw new Error(); };
	protected Exp subString(StringExp exp) { throw new Error(); };
	
	protected Exp multInt(IntExp exp) { throw new Error(); };
	protected Exp multFloat(FloatExp exp) { throw new Error(); };
	protected Exp multString(StringExp exp) { throw new Error(); };
	
	protected Exp divInt(IntExp exp) { throw new Error(); };
	protected Exp divFloat(FloatExp exp) { throw new Error(); };
	protected Exp divString(StringExp exp) { throw new Error(); };

}