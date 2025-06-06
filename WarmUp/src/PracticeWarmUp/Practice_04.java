package PracticeWarmUp;

public class Practice_04 {
    public static void main (String[] args) {
        int x = 1;
        int y = 2;
        boolean result = x > y;
        System.out.println(result);
        boolean result2 = (x + y) > 2;
        System.out.println(result2);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("a 와 b의 값을 입력하세요");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int sum = a + b;
//        boolean compare = sum > 10;
//        System.out.println("compareResult: " + compare);

        int h = ++x;
        System.out.println(h);
        boolean result3 = true;
        boolean result4 = !result3;
        System.out.println(result3);
        System.out.println(result4);

        boolean ab = (x > 2) ? true : false;
        System.out.println(ab);
        String bc = (x > 2) ? "맞아요" : "아니예요";
        System.out.println(bc);
    }
}
