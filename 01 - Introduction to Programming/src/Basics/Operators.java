package Basics;

public class Operators {
    public static void main(String[] args) {
//        1. Arithmetic Operators -> +, -, *, / -> gives quotient, % -> gives remainder
//        int a = 10;
//        int b = 3;
//        System.out.println("a + b = " + (a + b));
//        System.out.println("a - b = " + (a - b));
//        System.out.println("a * b = " + (a * b));
//        System.out.println("a / b = " + (a / b));
//        System.out.println("a % b = " + (a % b));

//        2. Unary Operators -> ++, --
//        int a = 10;
//        int b = 10;
//        System.out.println("Postincrement : " + (a++)); // a++ means -> use the value first, then increase by 1
//        System.out.println("Preincrement : " + (++a));  // ++a means -> increase first, then use the value
//
//        System.out.println("Postdecrement : " + (b--));  // b-- means -> use the value first, then decrease by 1
//        System.out.println("Predecrement : " + (--b));   // --b means -> decrease first, then use the value

//        3. Assignment Operator -> +=, -=, *=, /=, %=
//        int f = 7;
//        System.out.println("f += 3: " + (f += 3)); // f += 3 simply means, f = f + 3
//        System.out.println("f -= 2: " + (f -= 2)); // f -= 3 simply means, f = f - 3
//        System.out.println("f *= 4: " + (f *= 4)); // f *= 3 simply means, f = f * 3
//        System.out.println("f /= 3: " + (f /= 3)); // f /= 3 simply means, f = f / 3
//        System.out.println("f %= 2: " + (f %= 2)); // f %= 3 simply means, f = f % 3

//        4. Relational Operators -> ==, !=, >, >=, <, <=  (gives result in either true or false)
//        int a = 10;
//        int b = 3;
//        int c = 5;
//
//        System.out.println("a > b: " + (a > b));
//        System.out.println("a < b: " + (a < b));
//        System.out.println("a >= b: " + (a >= b));
//        System.out.println("a <= b: " + (a <= b));
//        System.out.println("a == c: " + (a == c));
//        System.out.println("a != c: " + (a != c));

//        5. Logical Operator -> &&, ||, !  (gives result in either true or false)
//        boolean x = true;
//        boolean y = false;
//
//        System.out.println("x && y: " + (x && y));
//        System.out.println("x || y: " + (x || y));
//        System.out.println("!x: " + (!x));

//        6. Ternary Operator
//        int a = 20, b = 10;
//
//        int result = (a > b) ? a : b;
//        System.out.println(result);

//        7. Bitwise Operator -> &, |, ^, ~, <<, >>
        int d = 3;
        int e = 5;

        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
    }
}
