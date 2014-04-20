class MyIndexOutOfBoundException extends Exception {
	
}
public interface MyList {

    // add x somewhere in array. Return true, if element was actually added, otherwise no
    public boolean add(int x);

    // add x on the position k. Throw exception if the k is > real size of list.
    // write MyIndexOutOfBoundException by yourself, it inherits from Exception class,
    // just write the class-inheritance, you don't need any code in it.
    public void add(int k, int x) throws MyIndexOutOfBoundException;

    // replace the element on the position k by x. Throw exception if the k is >= real size of list.
    // when calling throw, write the error message that is different from the error message in 'add'
    public void set(int k, int x) throws MyIndexOutOfBoundException;

    // check if x is in list. Return true or false
    public boolean contains(int x);

    // add all elements from array a to list. Return the actual number of added elements
    public int add(int [] a);

    // check if our list contains all elements from array a. Return the actual number of contained elements.
    public int contains(int [] a);

}

 
