class Employee{
	int id;
	String name;
	float salary;
	void insert(int i, String n, float s) {
		id=i;
		name=n;
		salary=s;
	}
	void display(){System.out.println(id+" "+name+" "+salary);}
}
public class TestEmployee {
public static void main(String[] args) {
	Employee e1=new Employee();
	Employee e2=new Employee();
	Employee e3=new Employee();
	e1.insert(1111,"Amit",35000);
	e2.insert(2222,"Mohan",45000);
	e3.insert(3333,"Rahul",55000);
	e1.display();
	e2.display();
	e3.display();
}
}
