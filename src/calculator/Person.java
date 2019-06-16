package calculator;

public class Person {
	String name;
	int age;
	int x=0;
	int y=0;
	static int count=0;
	
	void constPerson(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.printf("A new person is born\n. Name: %s, Age: %d\n", this.name,this.age);
		Person.count++;
		System.out.printf("Current population: %d\n", Person.count);
	}
	void speak() {
		System.out.printf("Hello my name is %s\n",this.name);
	}
	
	 String getOlder(){
		this.age+=1;
		return "Hello";
	}
	void moving(int x, int y) {
		this.x += x;
		this.y += y;
		System.out.printf("Current position of %s, is x: %d y: %d\n", this.name,this.x,this.y);
	}
}
