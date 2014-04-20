public class TestClassForMyArrayList {
public static void main (String [] args) {
		MyArrayList array = new MyArrayList();
		array.add(5);
		System.out.println(array);
		try {
			array.add(0,0);
		}
		
		catch (MyIndexOutOfBoundException e1 ) {
			System.out.println("IndexOutOfBoundException when add");
		}
		
		finally {
			
		}
		
		System.out.println(array);
		try {
			array.set(1,10);
		}
		
		catch (MyIndexOutOfBoundException e2) {
			System.out.println ("IndexOutOfBoundException when set");
		}
		
		finally {
			
		}
		
		boolean b = array.contains(8);
		System.out.println(b);
		int a[] = {1,2,3,4,5};
		array.add(a);
		System.out.println(array);
		int a1[] = {1,2,5,7};
		int x = array.contains(a1);
		System.out.println(x);
		
	}
}
