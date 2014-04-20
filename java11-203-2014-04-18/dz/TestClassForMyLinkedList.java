
public class TestClassForMyLinkedList {
	public static void main (String [] args) {
		MyLinkedList linkedlist = new MyLinkedList(5);
		linkedlist.add(5);
		System.out.println(linkedlist);
		try {
			linkedlist.add(3,3);
		}
		
		catch (MyIndexOutOfBoundException e1 ) {
			System.out.println("IndexOutOfBoundException when add");
		}
		
		finally {
			
		}
		
		System.out.println(linkedlist);
		try {
			linkedlist.set(1,10);
		}
		
		catch (MyIndexOutOfBoundException e2) {
			System.out.println ("IndexOutOfBoundException when set");
		}
		
		finally {
			
		}
		
		boolean b = linkedlist.contains(5);
		System.out.println(b);
		int a[] = {1,2,3,4,5};
		linkedlist.add(a);
		System.out.println(linkedlist);
		int a1[] = {1,2,5,7};
		int x = linkedlist.contains(a1);
		System.out.println(x);
		
	}
}
