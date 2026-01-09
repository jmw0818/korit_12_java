package ch17_static.builders;

import lombok.ToString;

@ToString
public class Person {
    private String name;
    private int age;
    private String address;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;

        /*
        class 내에 static class라고 하는 것을 정의했는데,
        Builder 라고 하는 static 클래스 내에 field를 정의했다.
        근데 클래스니깐 field와 method 들로 이루어져있을 것이다.
        이하는 method들을 정의하는 영역이 됩니다. 이하의 부분이 builder pattern의 필수영역이 됨.
        */

        public Builder name(String name) {  // name이라는 method, method 이름은 field 이름과 동일한 명사 형태
            this.name = name;   // argument로 들어온 String data를 Builder의 field인 name을 대입
            return this;    // 일반적으로 생성자는 return이 없기때문에, method라는 것을 알 수 있음.
            // name() 호출 전에는 field의 name에 값이 없다가 19번 코드라인 시점에
            // name field에 값이 들어간 상태에서 Builder 클래스의 객체가 return
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }
        /*
            field 명과 동일한 메서드들을 이상에서 정의함
            그리고 메서드가 호출된 결과로 Builder 객체에 field 값이 대입된 상태된 후에
            그 객체가 return 되는 형태다.
         */

        public Person build() {
            return new Person(this);
        }

    }

}