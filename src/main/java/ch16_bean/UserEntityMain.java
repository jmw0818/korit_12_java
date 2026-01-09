package ch16_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntitiy user1 = new UserEntitiy(1, 9876, "a@test.com", "정명원");
        System.out.println(user1);
        System.out.println(user1.getName());

        UserEntityLombok user2 = new UserEntityLombok("email", "정명원"); // @RequiredArgsConstructor
        UserEntityLombok user3 = new UserEntityLombok();        // @NoArgsConstructor
        System.out.println(user3.getEmail());
        user2.setPassword(1234);
        System.out.println(user2);  // @ToString
        System.out.println(user3);
        UserEntityLombok user4 = new UserEntityLombok(2, 1234, "jmw5679", "정명원");
        // @AllArgsConstructor
    }
}
