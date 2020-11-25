package lesson1;

import java.util.Scanner;

// создаем пустой проект в IntelliJ IDEA
public class lesson1 {

    //создаем метод main
    public static void  main (String[] args){
        //cоздаем и инициализируем целочисленные переменные
        int a = 1, b = 2;
        // создаем и инициализируем чисденную переменную с плавающей запятой
        double r = 0.72;
        // создаем и инициализируем байтовую переменную
        byte byt = 22;
        // создаем и инициализиуем логическую переменную
        boolean pravda = true;
        // создаем и инициализируем символьную переменную
        char bukva = 'h';
        // Переход к задаче 3. прописываем метод
        zadacha();
        // Переход к задаче 4. вывод результата задачи
        System.out.println(check());
        // Переход к задаче 5. Проверка числа
        positivech();
        // Переход к задаче 6. Проверка числа. Оператор boolean. Вывод в консоль true false
        System.out.println(positivcheckfalse());
        // Переход к задаче 7. Приветствие
        privetName();
        // Переход к задаче 8*. Определение високосного года
        year();
    }

// №3
    public static void zadacha(){
        //cоздаем и инициализируем целочисленные переменные
        int a = 1, b = 2, c = 3, d = 4;
        System.out.println("Задача №3");
        //объявляем переменную a
        System.out.println("Переменная а=" + a);
        //объявляем переменную b
        System.out.println("Переменная b=" + b);
        //объявляем переменную c
        System.out.println("Переменная c=" + c);
        //объявляем переменную d
        System.out.println("Переменная d=" + d);
        // объявляем решение задачи
        System.out.println("Выражение a*(b+(c/d))=" + a + "*" + "(" + b + "+(" + c + "/" + d + ")=" + (a * (b + (c / d))));
    }

// №4
    public static boolean check() {
        // объявляем задание под номером 4
        System.out.println("Задача №4");
        // просим ввести значение а
        System.out.println("Введите число а");
        // создаем сканнер для ввода значения переменной
        Scanner scanner = new Scanner(System.in);
        // создаем и инициализируем перменную а
        int a = scanner.nextInt();
        // просим ввести значение b
        System.out.println("Введите число b");
        // создаем и инициализируем перменную b
        int b = scanner.nextInt();
        // создаем и инициализируем перменную для расчета суммы чисел a и b
        int summ = a + b;
        // условный операто IF, проверяем, попадает ли сумма чисел a и b в диапазон
        if (summ > 10 && summ < 20) {
            // если сумма попадает в диапазон, то выводим в консоль true
            return true;
        }
        else {
            // если сумма не попадает в диапазон, то выводим в консоль false
            return false;
        }
    }

// №5
    private static void positivech(){
        // объявляем задание под номером 5
        System.out.println("Задача №5");
        // просим ввести число
        System.out.println("Введите любое число");
        // создаем сканнер для ввода числа
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        // задаем условия и ответ программы
        if(a >= 0) {
                System.out.println("Введенное число положительное");
        } else{
                System.out.println("Введенное число отрицательное");
        }
    }

// №6
    public static boolean positivcheckfalse(){
        System.out.println("Задача №6");
        System.out.println("Введите положительное или отрицательное число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        // задаем условия при которых значение метода positivcheckfalse будет выводить в консоль true & false
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }

// №7
    public static void privetName(){
        System.out.println("Задача №7");
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        // создаем строковую переменную и присваиваем ей значение
        String name = scanner.next();
        // система дает ответ
        System.out.println("Привет, " + name);
    }

//№8*
    public static void year() {
        System.out.println("Задача №8*");
        // Спрашиваем у пользователя какой год
        System.out.println("Введите год, чтобы определить, високосный ли он.");
        Scanner scanner = new Scanner(System.in);
        // создаем переменную, в которую вводим год
        int a = scanner.nextInt();
        // создаем переменную b из переменной а делением по модулю на 4
        int b = a %= 4;
        // создаем переменную c из переменной а делением по модулю на 100
        int c = a %= 100;
        // создаем переменную d из переменной а делением по модулю на 400
        int d = a %= 400;
        /* создаем оператор if, в котором в случае одновременного соблюдения
        3х условий (b=0, c=0, d=0) будет выводиться сообщение что год високосный.
        в противном случае, если какое либо из 3х или все условия не соблюдены,
        будет выводиться сообщение что год не високосный
         */
        if (b == 0) {
            if (c == 0) {
                if (d == 0) {
                    System.out.println("Год високосный");
                }
            }
        } else {
            System.out.println("Год Не високосный");
        }
    }


}
