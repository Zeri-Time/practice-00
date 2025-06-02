public class Practice_06_condition_for {
    public static void main (String[] args){
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
            sum += i;
//            System.out.println(sum);
        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("put value of a");
//        int a = scanner.nextInt();
//        for (; a <= 10; a++){
//            int sum2 = a;
//            sum2 = sum2 + a;
//            System.out.println(a);
//            System.out.println(sum2);
//        scanner.close();
//        }
        //---------------구구단 실습-------------------
        for (int x= 2; x < 10; x++){
            System.out.println(x + "단");
            for (int y = 1; y <10; y++){
                int z = x*y;
                System.out.println(x + "x" + y + "=" + z);
            }
        }
    }
}
