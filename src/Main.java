public class Main {

    public static void main(String[] args) {
/*
        Чтобы запустить код, введите значение, соответственно условию каждой задачи.
        Чтобы посмотреть код, спуститесь в соответствующий метод.
        Методы названы по номеру задач в ДЗ.
        Ответы программы дают на английском языке.

        Введи в 1 или 4 задаче, сколько лет ребенку - программа скажет, сколько до совершеннолетия, или поздравит.
        Введи во 2, 5, 7 задаче, сколько тебе лет - программа ответит куда тебе - в садик, школу, универ или работать.
        Введи в 3 или 6, сколько в вагоне уже занято мест из 102 - программа скажет, какие места доступны и сколько их.
        Введи в 8 задаче, сколько лет ребенку, и посмотрим, можно ли ему кататься на аттракционе без взрослых.
        Введи в 9 задаче любые три числа, и увидишь, какое из них большее!
*/
//      ДЗ1
        task1(2);
        task2(2);
        task3(101);
//      ДЗ2
        task4(20);
        task5(16);
        task6(102);
//      ДЗ3
        task7(100);
        task8(16);
        task9(114,916,128);

    }

    public static int task1(int age) {
        System.out.println();
        System.out.println("Task №1");
        if (age >= 18) {
            System.out.printf("Happy %sth Birthday! Drink whatever you want)", age);
            System.out.println();
        }
        if (age < 18) {
            System.out.printf("Wait for %s years, don't drink alcohol!", (18 - age));
            System.out.println();
        }
        return 0;
    }

    public static int task2(int age) {
        System.out.println();
        System.out.println("Task №2");
        boolean school = age >= 7 && age < 18;
        boolean university = age >= 18 && age < 24;
        boolean work = age >= 24;
        if (school) {
            System.out.println("Go to the school!");
        }
        if (age < 7) {
            System.out.println("Go to the kindergarten!");
        }
        if (work) {
            System.out.println("You graduated from the university! Find a job!");
        }
        if (university) {
            System.out.println("You graduated from the school! Go to the university!");
        }
        return 0;
    }

    public static int task3(int seatsTaken) {
        System.out.println();
        System.out.println("Task №3");
        int capacity = 102;
        int seats = 60;
        int stands = capacity - seats;
        boolean standsOnly = seatsTaken < capacity && seatsTaken >= seats;
        boolean standsAndSeats = seatsTaken < seats;
        if (standsOnly) {
            System.out.println("Only " + (capacity - seatsTaken) + " standing place(s) available!");
        }
        if (standsAndSeats) {
            System.out.println(stands + " standing places and " + (capacity - seatsTaken - stands));
            System.out.println(" seat(s) are available.");
        }
        if (seatsTaken >= capacity) {
            System.out.println("Unfortunately, there are no seats available anymore!");
        }
        return 0;
    }

    public static int task4(int age) {
        System.out.println();
        System.out.println("Task №4");
        if (age >= 18) {
            System.out.printf("Happy %sth Birthday! Drink whatever you want)", age);
            System.out.println();
        } else {
            System.out.printf("Wait for %s years, don't drink alcohol!", (18 - age));
            System.out.println();
        }
        return 0;
    }

    public static int task5(int age) {
        System.out.println();
        System.out.println("Task №5");
        boolean school = age >= 7 && age < 18;
        boolean university = age >= 7 && age >= 18 && age < 24;
        boolean work = age >= 24;
        if (school) {
            System.out.println("Go to the school!");
        } else if (university) {
            System.out.println("You graduated from the school! Go to the university!");
        } else if (work) {
            System.out.println("You graduated from the university! Find a job!");
        } else {
            System.out.println("Go to the kindergarten!");
        }
        return 0;
    }

    public static int task6(int seatsTaken) {
        System.out.println();
        System.out.println("Task №6");
        int capacity = 102;
        int seats = 60;
        int stands = capacity - seats;
        boolean standsOnly = seatsTaken < capacity && seatsTaken >= seats;
        boolean standsAndSeats = seatsTaken < seats;
        if (standsOnly) {
            System.out.println("Only " + (capacity - seatsTaken) + " standing place(s) available!");
        } else if (standsAndSeats) {
            System.out.println(stands + " standing places and " + (capacity - seatsTaken - stands));
            System.out.println(" seat(s) are available.");
        } else {
            System.out.println("Unfortunately, there are no seats available anymore!");
        }
        return 0;
    }

    public static int task7(int age) {
        System.out.println();
        System.out.println("Task №7");
        boolean youngOld = age < 2 || age >= 70;
        boolean kindergarten = age >= 2 && age <= 6;
        boolean university = age >= 18 && age < 24;
        boolean work = age >= 24 && age < 70;
        if (kindergarten) {
            System.out.printf("You are %s year(s) old. Go to the kindergarten!", age);
            System.out.println();
        } else if (university) {
            System.out.printf("You are %s year(s) old. You graduated from the school! Go to the university!", age);
            System.out.println();
        } else if (work) {
            System.out.printf("You are %s year(s) old. You graduated from the university! Find a job!", age);
            System.out.println();
        } else if (youngOld) {
            System.out.printf("You are %s year(s) old. Relax and don't go anywhere!", age);
            System.out.println();
        } else {
            System.out.printf("You are %s year(s) old. Go to the school!", age);
            System.out.println();
        }
        return 0;
    }

    public static int task8(int age) {
        System.out.println();
        System.out.println("Task №8");
        boolean child = age < 5;
        boolean teenager = age >= 14;
        if (child) {
            System.out.printf("You are %s year(s) old. It's not allowed to ride!", age);
            System.out.println();
        } else if (teenager) {
            System.out.printf("You are %s year(s) old. You can ride without the adults!", age);
            System.out.println();
        } else {
            System.out.printf("You are %s year(s) old. Do not ride without the adults!", age);
            System.out.println();
        }
        return 0;
    }

    public static int task9(int one, int two, int three) {
        System.out.println();
        System.out.println("Task №9");
        boolean bigOne = one > two && one > three;
        boolean bigTwo = two > one && two > three;
        if (bigOne) {
            System.out.printf("%s is the biggest.", one);
            System.out.println();
        }
        else if (bigTwo) {
            System.out.printf("%s is the biggest.", two);
            System.out.println();
        } else {
            System.out.printf("%s is the biggest.", three);
            System.out.println();
        }
        return 0;
    }
}