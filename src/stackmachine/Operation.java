package stackmachine;

public interface Operation {
	
	public Exp add(Exp op);
	public Exp sub(Exp op);
	public Exp mult(Exp op);
	public Exp div(Exp op);
	
	public Exp addInt(IntExp exp);
	public Exp addFloat(FloatExp exp);
	public Exp addString(StringExp exp);
	
}
