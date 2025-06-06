package PracticeWarmUp;

import java.util.Scanner;

public class Practice_01_scanner {


    public static void main(String[]args)
    //public static void main(String[]args): 매소드 선언부
    //main: 메소드 이름        
    //여기부터
    {

        System.out.println("이름, 나이, 키 순서대로 입력");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        // next(): 공백 이전까지의 문자열을 읽음
        int age = scanner.nextInt();
        // nextInt(): 공백 이전까지의 정수를 읽음
        double height = scanner.nextDouble();
//        boolean single = scanner.nextBoolean();
        // nextLine: 엔터 이전까지의 문자열을 읽음


        System.out.println("이름은 " + name + ", ");
        //println: 줄바꿈
        System.out.print("나이는 " + age + "살, ");
        System.out.println("키는 " + height + "cm ");
        

        scanner.close();

        System.out.println("완료");
    }
    //여기까지 : 메소드 블록
}
