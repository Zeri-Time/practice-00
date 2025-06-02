public class Practice_07_condition_while {
    public static void main (String[] args){
        int a = 1;
//        while (a < 5){
//            System.out.println(a);
//            a++;
//        }
        int sum = 0;
        while (a <= 10) {
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}
