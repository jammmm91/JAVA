
public abstract class AClass {
	int number;
	
	public abstract void todoMethod();
	
	@Override
	public String toString() {
		this.todoMethod();
		return "" + this.number;
	}

}
