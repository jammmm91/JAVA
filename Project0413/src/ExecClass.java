
public class ExecClass {
	public static void main(String[] args) {
		AClass ac = new AClass() {
			@Override
			public void todoMethod() {
				this.number = 100;
			}
		};
		System.out.println(ac);
	}
}
