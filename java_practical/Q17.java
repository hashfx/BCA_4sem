// Base Class
class Parent {
	void show()
	{
		System.out.println("Parent show()");
	}
}

// Inherited class
class Child extends Parent {

	@Override
	void show()
	{
		System.out.println("Child show()");
	}
}

// Driver class
class Q17 {
	public static void main(String[] args)
	{
		Parent obj1 = new Parent();
		obj1.show();

		Parent obj2 = new Child();
		obj2.show();
	}
}

// Output
// Parent Show()
// Child Show()
