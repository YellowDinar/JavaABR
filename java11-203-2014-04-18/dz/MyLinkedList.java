import java.util.Random;

public class MyLinkedList implements MyList {
	
	Node head;
	public MyLinkedList(int n) {
		Random r1 = new Random();
		head = null;
		for (int i = 0; i < n; i++) {
			add(r1.nextInt(100));
		}
	}
	@Override
	public boolean add(int x) {
        Node p = new Node(x, head);
        head = p;
        return true;
    }

	@Override
	public void add(int k, int x) throws MyIndexOutOfBoundException {
		Node a = head;
		int i = 1;
		while (i < k & a.next != null) {
			a = a.next;
			i++;
		}
		if (i == k) {
			Node p = new Node(x, a.next);
			a.next = p;
		}
		else {
			throw new MyIndexOutOfBoundException();
		}
	}

	@Override
	public void set(int k, int x) throws MyIndexOutOfBoundException {
		Node a = head;
		int i = 1;
		while (i < k && a.next != null) {
			a = a.next;
			i++;
		}
		if (i == k) {
			a.info = x;
		}
		else {
			throw new MyIndexOutOfBoundException();
		}
		
	}

	@Override
	//МА: а почему так сложно? ведь нет никаких отличий с массивом? проверка и если да, то return true, а в конце return false;
	public boolean contains(int x) {
		Node a = head;
		if (a.info == x) 
			return true;
		while (a.next != null) {
			a = a.next;
			if (a.info == x)
				return true;
		}
		return false;
	}

	@Override
	public int add(int[] a) {
		for (int i = 0; i<a.length; i++) {
			add(a[i]);
		}
		return a.length;
	}

	@Override
	public int contains(int[] a) {
		int i = 0;
		for (int j = 0; j<a.length; j++) {
			if (contains(a[j]))
				i++;
		}
		return i;
	}
	
	public String toString() {
        String s1 = "";
        for (Node p = head; p != null; p = p.next) {
            s1 += p.info + " ";
        }
        return s1;
    }

}
