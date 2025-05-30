public class Practice_03 {
    public static void main (String[] args){
    String text = "content";
    char alpha = 'a';
    char letter = '가';
    int numb = 1;
    double numb2 = 1.23;
    float numb3 = 2.34f;
    long longNumb1 = 123123123;
    long longNumb2 =1234123412341234L;

    System.out.println("타입변환");
    //허용 범위가 작은 타입이 더 큰 타입으로 저장될때
    byte smallNumb = 10;
    int biggerNumb = smallNumb;
    System.out.println("biggerNumb: " + biggerNumb);

    System.out.println("강제 타입변환");
    int longValue = 65;
    char shortValue = (char) longValue;
    //(char)-> 캐스팅 연산자
    System.out.println("shortValue: " + shortValue);
    double floatNumb = 3.14;
    int naturalNumb = (int) floatNumb;
    System.out.println("naturalNumb: " + naturalNumb);
    int naturalNumb2 = 10;
    double floatNumb2 = 1.2345;
    double result1 = naturalNumb2 + floatNumb2;
    //double이 더 크기 때문에 int로 연산할 수 없음
        //꼭 int로 해야한다면 double을 int로 강제변환 한 후 실행해야함
    System.out.println("result1: " + result1);

    int x = 1;
    int y = 3;

    int intResult = x/y;
    System.out.println("divResult: " + intResult);

    double doubleResult = x/y;
    System.out.println("doubleResult: " + doubleResult);

    double doubleResult2 = (double) x/y;
    System.out.println("doubleResult2: " + doubleResult2);

    String str = 1 + 2 + "3";
    String str2 = 1 + "2" + 3;
    String str3 = "1" + 2 + 3;
    System.out.println("str: " + str);
    System.out.println("str2: " + str2);
    System.out.println("str3: " + str3);

    String str4 = "1";
    int value = Integer.parseInt(str4);
    //문자열을 숫자타입으로 변경
    System.out.println("value: " + value);
    int sum = value + 4;
    System.out.println("sum: " + sum);
    }
}
