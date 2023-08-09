package fc.java.model;

public class PersonDTO {
    public String name;
    public int age;
    public String phone;
    public void play(){
        System.out.println("운동을 한다");
    }
    public void eat(){
        System.out.println("음식을 먹다");
    }
    public void walk(){
        System.out.println("걷다");
    }

}
//객체지향 측면 : 현실세계의 객체를 객체지향 프로그램에서 사용하기 위해
//객체의 상태정보(멤버변수) 와 행위정보(멤버메서드)를 뽑아서 설계하는 도구
//객체(Object) = 상태정보(멤버변수) + 행위정보(멤버메서드)
