

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(4, 'A', 'B', 'C');
    }

    public static void hanoi(int n, char src, char helper, char destination){
        if (n == 0) return;

        // tak n-1 disks from A to B via C
        hanoi(n-1, src, destination, helper);

        // largest from A to C
        System.out.println(src+ " -> " + destination);

        // tak n-1 disks from B to C via A
        hanoi(n-1, helper, src, destination);
    }
}
