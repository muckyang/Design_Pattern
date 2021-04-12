package Patterns.CreationPattern.Singleton.Before;

public class Client {
    private static final int USER_NUM = 5;

    public static void main(String[] args) {
        UserThread[] user = new UserThread[USER_NUM];
        for (int i = 0; i < USER_NUM; i++) {
            // User 인스턴스 생성
            user[i] = new UserThread((i + 1));
            user[i].print();
        }
    }
}