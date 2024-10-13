package org.example.sept24;

public class App8_9_Casting {
    public static void main(String[] args) {
        byte byteValue = 123;
        short shortValue = 1236;
        int intValue = 1235;
        long longValue = 123444;

        float floatValue = 123.8f;
        float floatValue2 = (float) 95.12;
        double doubleValue = 123.0d;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int) longValue;
        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int) floatValue;
        System.out.println(intValue);


        // The following wont work as expected
        // 128 is too big for byte
        byteValue = (byte) 128;
        System.out.println(byteValue);
    }
}
