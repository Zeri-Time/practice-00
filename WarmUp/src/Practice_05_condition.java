import java.util.Scanner;
public class Practice_05_condition {
    public static void main (String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("정수를 입력해 주세요");
//        int i = scanner.nextInt();
//        scanner.close();
//        if (i > 10) {
//            System.out.println("10보다 큽니다");
//        } else if (i == 10) {
//            System.out.println("10과 같습니다");
//        }
//        else {
//            System.out.println("10보다 작습니다");
//        }
//-----------------랜덤 숫자 뽑기----------------------
        int num = (int) (Math.random() * 6) + 1;
        //0.0보다 크거나 같고 6.0보다 작은 범위이기 때문에 +1을 하고 소수는 날려서 정수로 맞춤
//        System.out.println(num);
//        System.out.println(num + "번이 나왔습니다");
        if (num ==1) {
            System.out.println("1이 나왔습니다");
        }else if (num==2) {
            System.out.println("2가 나왔습니다");
        }else if (num==3) {
            System.out.println("3이 나왔습니다");
        }else if (num==4) {
            System.out.println("4가 나왔습니다");
        }else if (num==5) {
            System.out.println("5가 나왔습니다");
        }else {
            System.out.println("6이 나왔습니다");
        }
        
        char alpha = 'a';
        switch (alpha) {
            case 'a':
                System.out.println("a입니다");
                break;
            case 'b':
                System.out.println("b입니다");
                break;
            default:
                System.out.println("a나 b가 아닙니다");
        }
    }
}
