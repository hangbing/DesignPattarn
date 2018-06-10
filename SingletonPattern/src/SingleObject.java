
public class SingleObject {
	private static SingleObject instance = new SingleObject();
	//construct is private
	private SingleObject() {}
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("hello, SingleObject");
	}
}
