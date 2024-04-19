package day09.ex01.member;

import day09.ex01.Gender;

/*
 * 역할 : 회원 멤버를 관리하는 역할
 * */
public class MemberRepository {
	static BookUser[] members;
	static BookUser[] restoreList;

	MemberRepository() {
		this.members = new BookUser[3];
		this.restoreList = new BookUser[0];
		members[0] = new BookUser("hoho", "1234", 12, Gender.MALE, 0);
		members[1] = new BookUser("hoho2", "5432", 18, Gender.FEMALE, 0);
		members[2] = new BookUser("hoho3", "7890", 15, Gender.MALE, 0);
	}

	/**
	 * @param member - 사용자 입력으로 전달된 회원 정보 객체
	 * @since
	 */
	public static void addNewMember(BookUser member) {
		BookUser[] tmp = new BookUser[members.length + 1];
		for (int i = 0; i < members.length; i++) {
			tmp[i] = members[i];
		}
		tmp[tmp.length - 1] = member;
		members = tmp;
	}


	/**
	 * 회원정보 중 이메일 중복 확인 기능
	 *
	 * @param name
	 * @return boolean
	 */
	public boolean isDuplicateEmail(String name) {
		for (BookUser member : members) {
			if (name.equals(member.getName())) return true;
		}
		return false;
	}

	/**
	 * @param target
	 * @return BookUser type
	 * @method findMember
	 * @author hoho
	 * @date 2024 04 16 12:39
	 */
	public static BookUser selectMember(String target) {
		for (BookUser member : members) {
			if (target.equals(member.getName()))
				return member;
		}
		return null;
	}

	/**
	 * member 삭제
	 *
	 * @param targetEmail
	 * @method deleteMember
	 * @author hoho
	 * @date 2024 04 16 14:26
	 */
	public BookUser deleteMember(String targetEmail) {
		BookUser target = null;
		BookUser[] tmp = new BookUser[members.length - 1];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i].getName().equals(targetEmail)) {
				target = members[i];
				continue;
			}
			tmp[j] = members[i];
			j++;
		}
		members = tmp;
		return target;
	}

	public void addRestoreMember(BookUser target) {
		BookUser[] tmp = new BookUser[restoreList.length + 1];
		for (int i = 0; i < restoreList.length; i++) {
			tmp[i] = restoreList[i];
		}
		tmp[tmp.length - 1] = target;
		restoreList = tmp;
	}

	public BookUser findRestoreMemberByEmail(String name) {
		for (int i = 0; i < restoreList.length; i++) {
			BookUser member = restoreList[i];
			if (member.getName().equals(name)) {
				return member;
			}
		}
		return null;
	}

	public BookUser deleteRestoreMember(BookUser member) {
		BookUser target = null;
		BookUser[] tmp = new BookUser[restoreList.length - 1];
//        for (int i = 0, j = 0; i < restoreList.length; i++) {
//            if (restoreList[i].id == member.id) {
//                target = restoreList[i];
//                continue ;
//            }
//            tmp[j] = restoreList[i];
//            j++;
//        }
		restoreList = tmp;
		return target;
	}
}
