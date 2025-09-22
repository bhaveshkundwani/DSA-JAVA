package methods;


public class VarArgs {
    public static void main(String[] args) {
//         Calling the 'names' method with different number of arguments
//        names("Virat", "Rohit");
//        names("Virat", "Rohit", "Dhoni", "Bumrah");

//         Calling the varargs method with one parameter
//        fun(100);

//         four parameters
//        fun(1, 2, 3, 4);

//         no parameter
//        fun();


        // Calling fun2() with different parameter
        fun2("Basketball", 100, 200);
        fun2("Java", 1, 2, 3, 4, 5);
        fun2("Python");
    }

//     Method that accepts variable number of String arguments using varargs
    public static void names(String... n) {

//         Iterate through the array and print each name
        for (String i : n) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

//     A method that takes variable number of integer arguments.
    static void fun(int... a)
    {
        System.out.println("Number of arguments: " + a.length);

//         using for each loop to display contents of a
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }

//     Takes string as a argument followed by varargs
    static void fun2(String s, int... a) {
        System.out.println("String: " + s);
        System.out.println("Number of arguments is: "
                + a.length);

//         using for each loop to display contents of a
        for (int i : a)
            System.out.print(i + " ");

        System.out.println();
    }
}
