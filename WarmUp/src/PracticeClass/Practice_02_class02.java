//-----------------실행 클래스-----------------
package PracticeClass;

public class Practice_02_class02 {
    public static void main (String[] args){
        Practice_01_class01 myCar = new Practice_01_class01();
        System.out.println(myCar.company);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.maxSpeed);

        myCar.maxSpeed = 250;
        System.out.println(myCar.maxSpeed);
    }
}
