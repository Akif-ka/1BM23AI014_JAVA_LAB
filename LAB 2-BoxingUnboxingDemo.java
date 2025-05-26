public class BoxingUnboxingDemo {
    public static void main(String[] args) {
        int primitiveInt = 10;
        Integer boxedInt = Integer.valueOf(primitiveInt);
        Integer autoBoxedInt = primitiveInt;

        System.out.println("Boxed Integer (explicit): " + boxedInt);
        System.out.println("Boxed Integer (auto-boxing): " + autoBoxedInt);

        Integer wrapperInt = Integer.valueOf(20);
        int unboxedInt = wrapperInt.intValue();
        int autoUnboxedInt = wrapperInt;

        System.out.println("Unboxed Integer (explicit): " + unboxedInt);
        System.out.println("Unboxed Integer (auto-unboxing): " + autoUnboxedInt);

        double primitiveDouble = 15.5;
        Double boxedDouble = primitiveDouble;
        double unboxedDouble = boxedDouble;

        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Unboxed Double: " + unboxedDouble);
    }
}
