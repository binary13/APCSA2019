public class Shining {
    public static void main(String[] args) {
        say(1);
    }

    public static void say(int n) {
        System.out.println("All work and no play makes Jack a dull boy.");
        if (n<=1000) say(n+1);
    }
}
