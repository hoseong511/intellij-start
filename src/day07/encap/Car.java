package day07.encap;

/**
 * packageName    : day07.encap
 * fileName       : Car
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 */
public class Car {
    private String model;
    private int speed;
    char mode; // 변속 모드 (D, N, R, P)
    private boolean start;

    Car(String model) {
        this.model = model;
        this.mode = 'P';
    }

    private void injectGasoline() {
        if (start) {
            System.out.println("엔진에 연료가 주입됩니다.");
        } else {
            System.out.println("시동이 켜지지 않았습니다.");
            System.out.println("자동차가 폭발합니다.");
        }
    }

    // 엔진오일이 순환하는 기능
    private void moveEngineOil() {
        System.out.println("엔진오일이 순환합니다.");
    }
    // 엔진 내부에 있는 실린더가 작동하는 기능
    private void moveCylinder() {
        System.out.println("엔진 내부 실린더가 왕복으로 움직입니다.");
    }

    // 시동 버튼을 누르는 기능
    void startStop() {
        this.start = !this.start;
        if (start) {
            System.out.println("시동이 켜짐. 운행준비 시작!");
            injectGasoline();
            moveEngineOil();
            moveCylinder();
        }
    }

    /**
     * 검증로직이 포함된 setter
     * @method   setSpeed
     * @param    speed
     * @author   hoho
     * @date     2024 04 17 11:37
     *
     */
    public void setSpeed(int speed) {
        if (speed < 0 || speed > 200) {
            this.speed = 0;
            this.start = false;
            this.mode = 'P';
            System.out.println("지정된 제한 속도를 준수하세요.");
        } else {
            this.speed = speed;
        }
    }

    /**
     * 은닉된 정보(필드)를 가져오는 getter
     * @method   getSpeed
     * @return   int type
     * @author   hoho
     * @date     2024 04 17 11:42
     *
     */
    public int getSpeed() {
        return speed;
    }

    public boolean isStart() {
        return start;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public char getMode() {
        return mode;
    }

    public void setMode(char mode) {
        char[] modes = {'D', 'N', 'R', 'P'};
        int i;
        for (i = 0; i < modes.length && modes[i] != mode ; i++) {
        }
        if (i == modes.length) {
            System.out.println("지정된 주행 모드를 준수하세요!");
            this.mode = 'P';
            return ;
        }
        this.mode = mode;
    }

    public void setStart(boolean start) {
        this.start = start;
    }
}
