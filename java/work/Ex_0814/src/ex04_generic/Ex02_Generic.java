package ex04_generic;
interface Person{
	
}

class Student implements Person{
	
}

class Worker{
	
}

//Person 인터페이스를 구현한 클래스만(Student) 제네릭 타입으로 들어올 수 있다.
class School<T extends Person>{
	
}

public class Ex02_Generic {
	public static void main(String[] args) {
		//Worker 클래스가 person 인터페이스를 구현(implements)하지 않았기 때문에 불가능하다.
		//School<WorkER> s = new School<>();
		School<Student> s2 = new School<>();
	}
}


