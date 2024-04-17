package day06.member;
/*
* 역할 : 회원 멤버를 관리하는 역할
* */
public class MemberRepository {
    static Member[] members;
    static Member[] restoreList;
    MemberRepository() {
        this.members = new Member[3];
        this.restoreList = new Member[0];
        members[0] = new Member("abc@def.com", "1234", "콩순이", "여성", 50);
        members[1] = new Member("ghi@def.com", "5432", "팥돌이", "남성", 40);
        members[2] = new Member("xyz@def.com", "7890", "팥죽이", "여성", 30);
    }

    /**
     *
     * @param member - 사용자 입력으로 전달된 회원 정보 객체
     * @since
     */
    public void addNewMember(Member member) {
        Member[] tmp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            tmp[i] = members[i];
        }
        tmp[tmp.length - 1] = member;
        members = tmp;
    }


    /**
     * 회원정보 중 이메일 중복 확인 기능
     * @param email
     * @return boolean
     */
    public boolean isDuplicateEmail(String email) {
        for (Member member : members) {
            if (email.equals(member.email)) return true;
        }
        return false;
    }

    /**
     *
     * @method   findMember
     * @param    targetEmail
     * @return   Member type
     * @author   hoho
     * @date     2024 04 16 12:39
     *
     */
    public Member selectMember(String targetEmail) {
        Member find = null;
        for (Member member : members) {
            if (targetEmail.equals(member.email)) find = member;
        }
        return find;
    }

    /**
     * member 삭제
     * @method   deleteMember
     * @param    targetEmail
     * @author   hoho
     * @date     2024 04 16 14:26
     *
     */
    public void deleteMember(String targetEmail) {
        Member[] tmp = new Member[members.length - 1];
        for (int i = 0, j = 0; i < members.length; i++) {
            if (members[i].email.equals(targetEmail)) {
                addRestoreMember(members[i]);
                continue;
            }
            tmp[j] = members[i];
            j++;
        }
        members = tmp;
    }

    public void addRestoreMember(Member target) {
        Member[] tmp = new Member[restoreList.length + 1];
        for (int i = 0; i < restoreList.length; i++) {
            tmp[i] = restoreList[i];
        }
        tmp[tmp.length - 1] = target;
        restoreList = tmp;
    }

    public Member findRestoreMemberByEmail(String email) {
        for (int i = 0; i < restoreList.length; i++) {
            Member member = restoreList[i];
            if (member.email.equals(email)) {
                return member;
            }
        }
        return null;
    }
    public void deleteRestoreMember(Member member) {
        Member[] tmp = new Member[restoreList.length - 1];
        for (int i = 0, j = 0; i < restoreList.length; i++) {
            if (restoreList[i].id == member.id) {
                addNewMember(restoreList[i]);
                continue ;
            }
            tmp[j] = restoreList[i];
            j++;
        }
        restoreList = tmp;
    }
}
