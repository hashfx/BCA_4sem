// #include<bits/stdc++.h>
// using namespace std;

// namespace cool{

// 	// template<typename t, typename e>
// 	// auto sum(t var, e var1, ...){
// 	// 	cout << "inside" << endl;
// 	// 	return var1 + ... + var;
// 	// }

// void print() {
//     cout << endl;
// }

// template <typename T> void print(const T& t) {
//     cout << t << endl;
// }

// 	template<typename... All>
// 	void print(const All&... all){
// 		print(all...); 
// 	}
// }

// int main(){
//     // cout << "HEy" << endl ;
//     // int a = 10;
//     // int b = 10;
//     // cout << &a << endl;
//     // cout << &b << endl;
//     // int c = cool::sum(1,5);

//     cool::print(2, "HEy");
// }




// -----------------------------------------------------
#include <iostream>

using namespace std;

// Using Ellipsis
namespace cool{

	// PRINT TEMPLATE
	void print() {
	    cout << endl;
	}

	template <typename T> 
	void print(const T& t) {
	    cout << t << endl;
	}

	template <typename First, typename... Rest> 
	void print(const First& first, const Rest&... rest) {
	    cout << first << ", ";
	    print(rest...); // recursive call using pack expansion syntax
	}


	// MULTIPLY
	auto multiply(){
		return 1;
	}

	template<typename First, typename... Rest>
	auto multiply(First first, Rest... rest){
		return first * multiply(rest...);
	}



}

// using Fold expressions
namespace fun{

	template<typename... Args>
	auto mul(Args... args){
		return (args * ...);
	}

	template<typename... Args>
	auto add(Args... args){
		return (args + ...);
	}

	template<typename... Args>
	auto div(Args... args){
		return (... / args);
	}


	template<typename... Args>
	auto avg(Args... args){
		return (args * ...) / sizeof...(args);
	}

	template<typename ... Args>
	void print(Args ... args){
	    ((cout << args << ' '), ...);
	    cout << endl;
	}

}


int main()
{
    // cool::print(); // calls first overload, outputting only a newline
    // cool::print(1); // calls second overload

    // // these call the third overload, the variadic template,
    // // which uses recursion as needed.
    // cool::print(10, 20);
    // cool::print(100, 200, 300);
    // cool::print("first", 2, "third", 3.14159);
    // cool::print<int, int, int>(5.57, 4.26, 9.24, 7.5);
    // cout << cool::multiply(5,7) << endl;

    cout << fun::mul(5, 6, 3) << endl;
    cout << fun::add(5, 6) << endl;
    cout << fun::div(12, 6) << endl;
    cout << fun::avg(12, 6) << endl;
    fun::print(1, 2.0, "ka", "four");
    fun::print("hey", 1);
}
























// double findsum( int n, ...){ 
// 	double sum=0;

// 	va_list list; //declare list to acess eliipses

// 	va_start(list,n); //initialize the list using va_start where 1st parameter is the list and 2nd is the last non ellipses paramter

// 	for(int i=0;i<n;i++) //parameters fetched through va_i
// 		sum+=va_arg(list,int);

// 		va_end(list);
// 		return sum;
// 	}

// 	int main()
// 	{
// 	cout<<" Sum: "<<findsum(5,8,9,67,89,23);
// 	return 0;
// }



