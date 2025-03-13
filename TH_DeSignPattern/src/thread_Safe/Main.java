package thread_Safe;

public class Main {
	public static void main(String[] args) {
		ThreadSafeSingleton obj1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton obj2 = ThreadSafeSingleton.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		ThreadSafeSingleton obj3 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		ThreadSafeSingleton obj4 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		
	}
}
