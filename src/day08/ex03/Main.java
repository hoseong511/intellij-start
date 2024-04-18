package day08.ex03;

/**
 * packageName    : day08.ex03
 * fileName       : Main
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */
enum TeamRole {
	LEADER("Manages the team and coordinates."),
	DEVELOPER("Develops the software."),
	DESIGNER("Designs the user interface."),
	TESTER("Tests the software for bugs.");
	private String role;

	TeamRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}
}

// TeamMember class: 팀원의 이름과 역할을 관리
class TeamMember {
	private String name;
	private TeamRole role;

	public TeamMember(String name, TeamRole role) {
		this.name = name;
		this.role = role;
	}

	public void assignTask() {
		System.out.println(this.name + " is assigned to " + this.role.getRole());
	}
}

// Main class: 팀원 생성과 작업 할당을 시뮬레이션
public class Main {
	public static void main(String[] args) {
		TeamMember alice = new TeamMember("Alice", TeamRole.DEVELOPER);
		TeamMember bob = new TeamMember("Bob", TeamRole.DESIGNER);
		TeamMember charlie = new TeamMember("Charlie", TeamRole.LEADER);
		TeamMember david = new TeamMember("David", TeamRole.TESTER);

		alice.assignTask(); // Alice is assigned to Develops the software.
		bob.assignTask();   // Bob is assigned Designs the user interface.
		charlie.assignTask(); // Charlie is assigned Manages the team and coordinates.
		david.assignTask();  // David is assigned Tests the software for bugs.
	}
}
