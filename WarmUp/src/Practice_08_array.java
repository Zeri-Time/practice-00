public class Practice_08_array {
    public static void main (String[] args){
        //배열은 같은 타입의 데이터만 저장가능 (예: int는 int만, String은 문자열끼리)
        // 한번 생성된 배열은 길이를 늘리거나 줄일수 없음
        int[] intArray = {1, 2, 3};
        int sum = 0;
            for (int i = 0; i <=2; i++) {
                sum += intArray[i];

            }
            double avg = (double) sum / 3;
            System.out.println("총합: " + sum);
            System.out.println("평균: " + avg);
    }
}
