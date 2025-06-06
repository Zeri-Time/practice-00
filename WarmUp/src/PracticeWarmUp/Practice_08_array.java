package PracticeWarmUp;

public class Practice_08_array {
    public static void main (String[] args){
        //배열은 같은 타입의 데이터만 저장가능 (예: int는 int만, String은 문자열끼리)
        // 한번 생성된 배열은 길이를 늘리거나 줄일수 없음
//        int[] intArray = {1, 2, 3};
//        int sum = 0;
//            for (int i = 0; i <=2; i++) {
//                sum += intArray[i];
//
//            }
//            double avg = (double) sum / 3;
//            System.out.println("총합: " + sum);
//            System.out.println("평균: " + avg);
//
//            int[] intArray = new int[3];
//            System.out.println(intArray[0]);
//            String[] stringArray = new String[3];
//            System.out.println(stringArray[0]);
//            boolean[] booleanArray = new boolean[3];
//            System.out.println(booleanArray[0]);
//            intArray[0] = 30;
//            intArray[1] = 40;
//            intArray[2] = 50;
//            System.out.println(intArray[0]);
//            for (int i = 0; i <3; i++){
//                System.out.println(intArray[i]);
//            }
//            int num = intArray.length;
//            System.out.println(num);
//


        //-----------------행열------------------
//---행열을 우선 생성하는 경우
//        int array [][] = new int[2][3];
//        //2행 3열의 배열
//        array[0][0] = 10;
//        //1행1열의 값을 입력
//        System.out.println(array[0][0]);
//        System.out.println(array[0].length);
//        //1행의 열의 길이
//        System.out.println(array[1].length);
//        //2행의 열의 길이


////---행열에 바로 값을 입력하는 경우
//        int [][] array2 = {{1,2,3,},{20,30,40},{400,500}};
//        for (int i = 0; i < array2.length; i++) {
//            for (int k = 0; k < array2[i].length; k++){
//                System.out.println("["+i+"],["+k+"]" + " = " + array2[i][k]);
//            }
//        }

        //----------향상된 for문----------
        int [] x = {10, 20, 30};
        int sum = 0;
        for (int y : x){
            //배열 x의 값이 존재할 경우 y로 가져와 조건문을 실행. 실행 후 다음 값을 가져와 동일. 더 이상 없을 경우 종료.
            System.out.println("가져온 값:" + y);
            sum += y;
            System.out.println("합산: " + sum);
        }
        System.out.println("총합: " + sum);
        double avg = (double) sum / x.length;
        System.out.println("평균: " + avg);

    }




    }

