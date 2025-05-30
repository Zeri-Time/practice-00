import java.util.Scanner;

public class Practice_02_operator {
    public static void main (String[] args){
        int a = 3;
        int b = 5;
        int sum = a+b;
        int minus = b-a;
        int multi = a*b;
        int div = b/a;
        int rest = b%a;
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multi);
        System.out.println(div);

        System.out.println("이름을 입력하세요");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
//        scanner.close();
        System.out.println("반갑습니다, " + name + "님");

        System.out.println("태어난 년도를 입력하세요");
        int currentYear = 2025;
        int yearOfBirth = scanner.nextInt();
        scanner.close();
        int yourAge = currentYear - yearOfBirth;
        System.out.println("당신의 나이는 " + yourAge + "살 입니다");


        //이스케이프 문자: \(역슬래시) -> 데이터로써 큰 따옴표를 사용하거나 띄움, 줄바꿈 등으로 사용
        String text = "안녕 \"안녕\" 하세요 ";
        System.out.println(text);
        String text2 = "안녕히\t계세요";
        System.out.println(text2);
        String text3 = "처음\n뵙겠습니다";
        System.out.println(text3);

    }
}
