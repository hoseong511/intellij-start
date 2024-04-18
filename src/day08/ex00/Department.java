package day08.ex00;

/**
 * packageName    : day08.ex00
 * fileName       : Department
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 *
 * 1. **클래스 `Department` 생성**
 *         - `departmentName` (학과 이름, 문자열, 인스턴스 변수)
 *         - `studentCount` (학과별 학생 수, 정수형, 인스턴스 변수)
 *         - `totalStudents` (전체 학생 수, 정수형, static 변수)
 *     - 메소드:
 *         - 생성자: `departmentName`과 학과별 초기 학생 수를 매개변수로 받아 초기화하며, `totalStudents`를 적절히 업데이트합니다.
 *         - `addStudent(int number)`: 주어진 수만큼 학과 학생 수를 증가시키고 `totalStudents`도 적절히 업데이트합니다.
 *         - `getStudentCount()`: 현재 학과의 학생 수를 반환합니다.
 *         - `getTotalStudents()`: 전체 학생 수를 반환하는 static 메소드입니다.
 */
public class Department {
    String departmentName;
    int studentCount;
    static int totalStudents = 0;

    public Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
        totalStudents += studentCount;
    }

    public void addStudent(int num) {
        this.studentCount += num;
        totalStudents += num;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
