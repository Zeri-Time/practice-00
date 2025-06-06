package PracticeWarmUp;

public class Practice_07_condition_while {
    public static void main (String[] args){
        int a = 1;
//        while (a < 5){
//            System.out.println(a);
//            a++;
//        }
//        int sum = 0;
//        while (a <= 10) {
//            sum += a;
//            a++;
//        }
//        System.out.println(sum);

//        while (true) {
//            int random = (int) (Math.random() * 6)+ 1;
//            System.out.println(random);
//            if (random == 6) {
//                break;
//            }
//        }

        for (int i = 0; i <=10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
