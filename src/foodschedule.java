import java.util.Random;

//음식 종류 설정.
class Food {
    Random rand = new Random();
    String[] main_foods = {"제육볶음", "고등어구이", "삼겹살", "감자탕", "라면", "초밥", "고추장불고기"};
    String[] sub_foods = {"김치", "참치캔", "스팸", "샐러드", "감자채볶음", "콩나물무침"};

    //식단표 출력
    void Print_foodSchedule() {
        String[] days = {"Sun", "Mun", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : days)
            System.out.printf("%7s", day);
        System.out.println();
        for (int i = 0; i < 7; i++) {
            int rand_number = rand.nextInt(6);
            System.out.printf("%6s", main_foods[rand_number]);
        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            int rand_number = rand.nextInt(5);
            System.out.printf("%6s", sub_foods[rand_number]);
        }
        System.out.println();

    }
}

public class foodschedule {
    public static void main(String[] args) {
        Food f = new Food();
        f.Print_foodSchedule();
    }
}
