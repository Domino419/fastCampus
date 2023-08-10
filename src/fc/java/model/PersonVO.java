package fc.java.model;

public class PersonVO {
    private String name ;
    private int age ;
    private String phone ;
    //생략된 생성자 메서드가 있다 >> 기본 생성자 dafault Constructer)
    public PersonVO() {
       // 객체를 생성하는 코드는 내부에서 만들어진다.
       this.name ="홍길동" ;
       this.age = 10 ;
        this.phone = "010-0000-0000" ;
    }

    public PersonVO(String name, int age, String phone) {
        // 객체를 생성하는 코드는 내부에서 만들어진다.
        this.name =name ;
        this.age = age ;
        this.phone = phone ;
    }


    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getPhone(){
        return this.phone;
    }

    public String toString(){
        return name +"\t"+age + "\t" + phone ;
    }
}


