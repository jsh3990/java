package day01;

public class DataTypeEx {
    public static void main(String[] args) {

        byte b = 127; //-128~128
        byte b2 = -128;
        short s = 32767; //-32768~32767
        int i = 2147483647; //21억정도까지 (기본타입)
        long l = 9223372036854775807L; //L을 붙임

         /*
         2진수 - 0b 붙임
         8진수 - 0붙임
         16진수 - 0x붙임
         */
        int i2 = 01010; //9

        System.out.println("----------------------------------");
        float f = 3.142323324543f; //뒤에 f를 붙임
        double d = 3.142323324543; //뒤에 f를 붙임
        System.out.println(f);
        System.out.println(d);
        System.out.println("----------------------------------");

        boolean b1 = true; //false



    }
}
