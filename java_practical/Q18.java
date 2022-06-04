// within same class Using this() keyword
class Q18{
    Q18(){
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }
 
    // parameterized constructor 2
    Q18(int x){
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }
 
    // parameterized constructor 3
    Q18(int x, int y){
        System.out.println(x * y);
    }
 
    public static void main(String args[]){
        // invokes default constructor first
        new Q18();
    }
}

// Output:  
// 75
// 5
// The Default constructor

