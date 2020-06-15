package vo;

public class Person {


    //Person 테이블의 칼럼(속성)을
    //Person 클래스의 인스턴스 변수(필드)로 설정
    private int num;
    private String name;
    private int age;

    //기본 생성자
    public Person(){}

    //name을 제외한 초기화 생성자
    //name 값은 sequence로 조작해줄 것

    public Person(int num, String name, int age){
        this.num = num;
        this.name = name;
        this.age = age;
    }


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "번호: "+this.num+
                "\n이름: "+this.name+
                "\n나이: "+this.age;
    }
    //toString: 객체를 인자로 전달하면 자동으로 호출됨
    //toString에서 반환된 문자열이 sysout으로 출력됨

    
}