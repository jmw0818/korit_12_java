package ch19_collections;

import java.util.*;

public class FiledTrip {
    public static void main(String[] args) {
        List<String> filedTrips = new ArrayList<>();
        Set<String> filedTripSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까? ");
        int studentNum = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < studentNum; i++) {
            System.out.print((i+1) + " 번 학생의 수학 여행지를 입력하세요 >>> ");
            filedTrips.add(scanner.nextLine());
        }
        for (int i = 0; i < filedTrips.size(); i++) {
            System.out.println((i+1) + " 번 학생의 후보지 : " + filedTrips.get(i));
        }
        List<String> finalFiedList = new ArrayList<>();
        filedTripSet.addAll(filedTrips);
        finalFiedList.addAll(filedTripSet);

        System.out.println("수학 여행 후보지는");
        for (String trip : finalFiedList) {
            System.out.println(trip);
        }
        System.out.println("입니다.");
    }
}
