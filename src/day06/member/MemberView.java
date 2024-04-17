package day06.member;

import day06.util.SimpleInput;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
* 역할: 회원 데이터 관리를 위한 입출력
* */
public class MemberView {
    MemberRepository mr;
    SimpleInput si = new SimpleInput();

    MemberView() {
        this.mr = new MemberRepository();
    }

    public void showMembers() {
        System.out.printf("======= 현재 회원 목록 (총 %d명) ======== \n", this.mr.members.length);
        for (Member m : mr.members) {
            System.out.println("m = " + m);
        }
    }

    public void inputMember() {
        String email = null;
        while (true) {
            email = si.input("- 이메일: ");
            if (!mr.isDuplicateEmail(email)) break;
            System.out.println("중복된 이메일 입니다. \n다시 입력해주세요.");
        }
        String name = si.input("- 이름: ");
        String password = si.input("- 패스워드: ");
        String gender = si.input("- 성별[M/F]: ");
        int age = parseInt(si.input("- 나이: "));
        mr.addNewMember(new Member(email, password, name, gender, age));
        System.out.println("회원 가입 성공 !!");
    }

    public String showProgramMenu() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        if (mr.members.length != 0)   {
            System.out.println("* 5. 회원 정보 삭제하기");
        }
        System.out.println("* 6. 회원 정보 복구하기");
        System.out.println("* 7. 프로그램 종료");
        System.out.println("============================");
        String menuNumber = si.input(" - 메뉴 번호 입력 ");
        return menuNumber;
    }
    public boolean exitProgram() {
        System.out.println("프로그램 종료");
        String exit = si.input("- 프로그램을 종료할까요? [y/n]\n>> ");
        if (exit.equals("y")) {
            System.out.println("프로그램을 종료합니다.");
            return true;
        } else {
            System.out.println("프로그램을 종료를 취소합니다.");
            return false;
        }
    }
    public void wrongMenuNumber() {
        System.out.println("메뉴 번호를 확인해주세요.");
    }

    /**
     *
     * @method   continueProgram
     * @author   hoho
     * @date     2024 04 16 12:36
     *
     */
    public void continueProgram() {
        String enter = si.input("======== 엔터를 눌러서 계속 =======");
        return ;
    }

    public void showMemberByEmail() {

        String email = si.input("조회를 시작합니다. \n이메일: ");
        Member find = mr.selectMember(email);
        if (find != null) {
            System.out.println("========조회결과========");
            System.out.println("# 이름: " + find.memberName);
            System.out.println("# 비밀번호: " + find.password);
            System.out.println("# 성별: " + find.gender);
            System.out.println("# 나이: " + find.age);
            System.out.println();
        } else {
            System.out.println("존재하지 않는 회원입니다.!");
        }
    }

    /**
     *
     * @method   deleteMemberByEmail
     * @author   hoho
     * @date     2024 04 16 14:15
     * @detail   삭제할
     */
    public void deleteMemberByEmail() {
        String email = si.input("삭제할 멤버의 이메일을 입력하세요. \n이메일: ");
        Member find = mr.selectMember(email);
        if (find != null) {
            System.out.printf("%s님의 ", find.memberName);
            String isCheck = si.input("비밀번호를 입력해주세요: ");
            if (isCheck.equals(find.password)) {
                mr.deleteMember(find.email);
                System.out.println("회원이 삭제되었습니다.!");
            } else {
                System.out.println("취소하셨습니다.");
            }
        } else {
            System.out.println("존재하지 않는 회원입니다.!");
        }
    }

    public void updatePassword() {
        String email = si.input("수정할 멤버의 이메일을 입력하세요. \n이메일: ");
        Member found = mr.selectMember(email);
        if (found == null) {
            System.out.println("존재하지 않는 회원입니다.!");
        }
        while (found != null) {
            System.out.printf("# %s님의 비밀번호를 변경합니다.", found.memberName);
            String newPassword = si.input("# 새 비밀번호: ");
            if (newPassword.equals(found.memberName)) {
                System.out.println("이전 비번과 같습니다. 다시 변경해주세요");
            } else {
                found.setPassword(newPassword);
                break;
            }
        }
    }

    public void restoreMember() {
        String email = si.input("복구할 멤버의 이메일을 입력하세요. \n이메일: ");
        Member found = mr.findRestoreMemberByEmail(email);
        if (found != null) {
            String password = si.input("비밀번호를 입력하세요. \n비밀번호: ");
            if (found.password.equals(password)) {
                mr.deleteRestoreMember(found);
                System.out.println("복구되었습니다.");
            } else {
                System.out.println("비밀번호를 확인해주세요.");
            }
        } else {
            System.out.println("존재하지 않습니다.!");
        }
    }
}
