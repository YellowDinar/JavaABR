public class MyArrayList implements MyList {
	private int[] a;
	private int i;
	public MyArrayList() {
		a = new int[100];
		i = 0;
	}
	@Override
	public boolean add(int x) {
		if (i < a.length) {
			a[i] = x;
			i++;
			return true;
		}
		return false;
	}

	@Override
	public void add(int k, int x) throws MyIndexOutOfBoundException {
		if (k<i & i+1 < a.length) {
			for (int j=i+1; j>k; j--) {
				a[j] = a[j-1];
			}
			a[k] = x;
			i++;
		}
		else {
			throw new MyIndexOutOfBoundException();
		}
	}

	@Override
	public void set(int k, int x) throws MyIndexOutOfBoundException {
		if (k < i) {
			a[k] = x;
			i++;
		}
		else {
			throw new MyIndexOutOfBoundException();
		}
	}

	@Override
	public boolean contains(int x) {
		for (int j=0; j<=i; j++)
			if (a[j]==x) {
				return true;
			}
		return false;
	}

	@Override
	//MA: очень круто!
	public int add(int[] a) {
		boolean b;
		int j;
		for (j = 0; j<a.length; j++) {
			b = add(a[j]);
			if (!b) {
				break;
			}
		}
		return j;
	}

	@Override
	public int contains(int[] a) {
		boolean b;
		int z = 0;
		for (int j = 0; j < a.length; j++) {
			b = contains(a[j]);
			if (b)
				z++;
		}
		return z;
	}
	
	public String toString() {
		// TODO
		String s1 = "";
		for (int j=0; j<i; j++) {
			s1 += " " + a[j];
		}
		return s1;
	}
	
}
