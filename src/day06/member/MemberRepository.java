package day06.member;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
 * 역할 : 회원 멤버를 관리하는 역할
 * */
public class MemberRepository {
	static Member[] members;
	static Member[] restoreList;

	MemberRepository() {
		this.restoreList = new Member[0];
	}

	/**
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
		try (FileWriter fw = new FileWriter("./src/day06/member/save.txt", true);) {
			String input = String.format("%s,%s,%s,%s,%s\n", member.memberName, member.email, member.password, member.gender, member.age);
			fw.write(input);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}


	/**
	 * 회원정보 중 이메일 중복 확인 기능
	 *
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
	 * @param targetEmail
	 * @return Member type
	 * @method findMember
	 * @author hoho
	 * @date 2024 04 16 12:39
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
	 *
	 * @param targetEmail
	 * @method deleteMember
	 * @author hoho
	 * @date 2024 04 16 14:26
	 */
	public Member deleteMember(String targetEmail) {
		Member target = null;
		Member[] tmp = new Member[members.length - 1];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i].email.equals(targetEmail)) {
				target = members[i];
				continue;
			}
			tmp[j] = members[i];
			j++;
		}
		members = tmp;
		return target;
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

	public Member deleteRestoreMember(Member member) {
		Member target = null;
		Member[] tmp = new Member[restoreList.length - 1];
		for (int i = 0, j = 0; i < restoreList.length; i++) {
			if (restoreList[i].id == member.id) {
				target = restoreList[i];
				continue;
			}
			tmp[j] = restoreList[i];
			j++;
		}
		restoreList = tmp;
		return target;
	}

	public void loadFile() {
		try (FileReader fr = new FileReader("./src/day06/member/save.txt");) {
			BufferedReader br = new BufferedReader(fr);

			List<Member> memberList = new ArrayList<>();

			while (true) {
				String s = br.readLine();
				if (s == null) break;
				String[] split = s.split(",");
				Member member = new Member(
						split[0],
						split[2],
						split[1],
						split[3],
						Integer.parseInt(split[4])
				);
				memberList.add(member);
			}
			Member[] tmp = new Member[memberList.size()];
			int idx = 0;
			for (Member member : memberList) {
				tmp[idx++] = member;
			}
			this.members = tmp;
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
