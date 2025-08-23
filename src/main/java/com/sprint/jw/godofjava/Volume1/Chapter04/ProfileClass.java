package com.sprint.jw.godofjava.Volume1.Chapter04;

/*
* 1. byte 타입의 나이를 나타내는 age와 String 타입의 이름을 나타내는 name이라는 인스턴스 변수를 선언하자
* 2. 그 사람이 결혼했는지 여부를 boolean 타입의 인스턴스 변수로 선언하고, 그 이름을 isMarried로 지정하자
* 3. byte 타입의 매개 변수를 받아 인스턴스 변수의 나이를 지정하는 public void setAge(byte Age) 매소드를 만들자
* 4. 나이를 리턴하는 getAge()라는 이름의 메소드를 만들자
* 5. String 타입의 매개 변수를 받아 인스턴스 변수인 name을 지정하는 public void setName(String name) 메소드를 만들자
* 6. 이름을 리턴하는 getName() 메서드를 만들자
* 7. 결혼 여부를 지정하는 public void setMarried(beelean flag) 메서드를 만들자
* 8. 결혼 여부를 리턴하는 public boolean isMarried() 메소드를 만들자
* 9. profilePrint 클래스를 실행할 수 있도록 profilePrint 클래스에 public static void main(String args[]) 메소드를 만들자
* 10. main 메소드에서 ProfilePrint 클래스의 객체를 생성한 후 그 객체의 3, 5, 7에서 생성한 메소드를 호출하도록 만들자.
*     메소드를 호출할 때에는 본인의 나이, 이름, 결혼 여부를 매개 변수로 넘겨주자
* 11. 4, 6, 8에서 생성한 메소드를 호출하여 그 결과를 출력하자
*/

public class ProfileClass {
    byte age;
    String name;
    boolean isMarried;

    public void setAge(byte age) {
        this.age = age;
    }
    public byte getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
    public boolean isMarried() {
        return isMarried;
    }

    public static void main(String[] args) {
        ProfileClass profileClass = new ProfileClass();
        profileClass.setAge((byte) 29);
        profileClass.setName("An");
        profileClass.setMarried(false);

        System.out.println(profileClass.getAge());
        System.out.println(profileClass.getName());
        System.out.println(profileClass.isMarried());
    }
}
