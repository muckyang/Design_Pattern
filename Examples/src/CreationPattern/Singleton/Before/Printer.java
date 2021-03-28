package CreationPattern.Singleton.Before;

//여러명이 공유해서 사용하는 프린터
public class Printer {

    private static Printer printer = null;

    private Printer() { // 외부생성 불가하게 private

    }

    public static Printer getPrinter() {
        // 조건 검사 구문 (문제의 원인!)
        if (printer == null) {
            try {
                // 스레드 스케줄링 변경(스레드 실행 1ms동안 정지)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            // Printer 인스턴스 생성
            printer = new Printer();
        }
        return printer;
    }

    public void print(String str) {
        System.out.println(str + " 출력 완료!");

    }
}
