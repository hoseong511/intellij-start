package day07.practice;

/**
 * packageName    : day07.practice
 * fileName       : Student
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 *
 *      **학생 정보 시스템**
 *     - 학생의 이름(name), 학번(studentId), 학과(department) 정보를 관리하는 `Student` 클래스를 만드세요.
 *     - 모든 정보 필드는 private으로 선언하고, 각 필드의 getter와 setter 메소드를 public으로 만드세요.
 *     - setter 메소드에서는 유효하지 않은 입력(예: null 값 또는 빈 문자열)에 대한 검증 로직을 포함하세요.
 */
public class Student {
    private String name;
    private String studentId;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().equals("")) {
            System.out.println("입력값을 확인해주세요!");
            return ;
        }
        this.name = name;

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId == null || studentId.trim().equals("")) {
            System.out.println("입력값을 확인해주세요!");
            return ;
        }
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department == null || department.trim().equals("")) {
            System.out.println("입력값을 확인해주세요!");
            return ;
        }
        this.department = department;
    }
}
