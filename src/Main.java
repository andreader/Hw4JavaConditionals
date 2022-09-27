public class Main {
    static int task;
    public static void taskNum () {
        task++;
        System.out.println();
        System.out.println("Task №" + task);
    }
    public static void main(String[] args) {
        taskNum();
        int age = 18;
        if (age >= 18) {
            System.out.println("Happy " + age + "th birthday!");
        }
    }
}