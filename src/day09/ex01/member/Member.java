package day06.member;

import java.time.LocalDate;

/*
*   역할 : 회원 정보
*
*   생성자: 회원정보가 생성될 떄 초기 데이터 처리
*   - 객체가 생성될 시점에 호출되는 함수, 객체 초기화
*   - 시스템이 부여하는 데이터 : 회원번호, 회원가입일자
*   - 사용자가 입력하는 데이터 : 이메일, pw, 이름, 성별, 나이
* */
public class Member {
    static int idx = 0;
    int id;
    String email;
    String memberName;
    String password;
    String gender;
    int age;
    LocalDate regDate;


    Member(String email, String password, String memberName, String gender, int age) {
        idx++;
        this.id = idx;
        this.regDate = LocalDate.now();
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return String.format("# %d 번 이름: %s # 이메일: %s # 성별: %s # 나이: %d", this.id, this.memberName, this.email, this.gender, this.age);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
