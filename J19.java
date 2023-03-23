/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.pkg9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import static java.lang.ProcessBuilder.Redirect.to;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import static java.util.Date.from;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Админ
 */
public class J19 {

    /**
     * @param args the command line arguments
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        J19 a = new J19();
        //a.laba1();
        //a.laba2();
        //a.laba3();
        //a.laba4();
        //a.laba5();
        //a.laba6();
        //a.laba7();
        a.laba8();
    }

    public boolean Check(String s) {
        int k = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++, k--) {
            if (s.charAt(i) != s.charAt(k)) {
                return false;
            }
        }
        return true;
    }

    public void laba1() {

        double x = 0;
        double y = 0;
        String result;
        try {
            //string result2 = string.Format("{0:f4}", number2);
            System.out.println("Лаба 1");
            System.out.println("Я люблю арбузы\nВвведите а");
            double a = Double.parseDouble(br.readLine());
            x = 12 * Math.pow(a, 2) + 7 * a + 6;
            System.out.println("Задание 1 а) х = " + x);

            System.out.println("=======");

            System.out.println("Ввведите х");
            x = Double.parseDouble(br.readLine());
            y = 7 * Math.pow(x, 2) - 3 * x + 6;
            System.out.println("Задание 1 б) y = " + y);

            double b = 0;

            System.out.println("=======");

            System.out.println("Perimeter\nВвведите storonu a");
            a = Double.parseDouble(br.readLine());
            System.out.println("Ввведите storonu b");
            b = Double.parseDouble(br.readLine());
            System.out.println("Задание 2 a) perimeter = " + 2 * (a + b));

            System.out.println("=======");
            System.out.println("Задание 2 b) ploshad = " + a * b);
            System.out.println("=======");

            System.out.println("Vvod temperature");
            a = Double.parseDouble(br.readLine());

            System.out.println("=======");
            System.out.println("Задание 3 a) F = " + a * 1.8 + 32);

            System.out.println("=======");
            System.out.println("Задание 3 b) K = " + a + 273.16);
        } catch (Exception e) {
            System.out.println("= AAAAAAAAA WE HAVE PROBLEMS!!!!");
        }
    }

    public void laba2() {
        double b = 0;
        System.out.println("Лаба 2");
        System.out.println("=======");
        System.out.println("1) Вы ввели число = ");
        try {
            b = Double.parseDouble(br.readLine());
        } catch (Exception e) {
            System.out.println("= AAAAAAAAA WE HAVE PROBLEMS!!!!");
        }
        System.out.println(b);

        System.out.println("2) ");
        try {
            b = Double.parseDouble(br.readLine());
        } catch (Exception e) {
            System.out.println("= AAAAAAAAA WE HAVE PROBLEMS!!!!");
        }
        System.out.println(b);
        System.out.println(" - вот какое число Вы ввели");

        System.out.println("3) (1 13 49)");

        System.out.println("4) 50");
        System.out.println("   10");

        int x = 0, y = 0;
        System.out.println("5)");
        System.out.println("7 см");
        try {
            x = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(J19.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(x + " 25");
        try {
            y = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(J19.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(x + " " + y);
    }

    public void laba3() {

        System.out.println("Лаба 3");
        System.out.println("=======");
        String formattedDouble = new DecimalFormat("#0.00").format(Math.E);
        System.out.println("1.1 задание " + formattedDouble);
        formattedDouble = new DecimalFormat("#0.00").format(Math.PI);
        System.out.println("1.2 задание " + formattedDouble);
        System.out.println("2 задание " + "Math.sqrt(Math.pow(x1,2)+Math.pow(x2,2))" + "x1*x2+x1*x3+x2*x3" + "v0*t+(a*Math.pow(t,2))/2" + "(m*Math.pow(v,2) )/2+" + "*g*h" + "1/R1+1/R2" + "m * g * Math.cos(alpha)" + "2*Math.PI*R" + "Math.pow(b,2)-4*a*c" + "gamma*(m1 * m2)/Math.pow(r,2)" + "Math.pow(I,2)*R" + "a*b*Math.sin(c)" + "Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2a*b*Math.cos(c))" + "(a*d+b*c)/a*d" + "Math.sqrt(1-Math.pow(Math.sin(x),2))" + "1/(Math.sqrt(a*Math.pow(x,2)+b*x+c))" + "(Math.sqrt(x+1)+Math.sqrt(x-1))/(2*Math.sqrt(x))" + "Math.abs(x)+Math.abs(x+1)" + "Math.abs(1-Math.abs(x))");

        System.out.println("3 Задание");
        double x = 0, y = 0;
        try {
            x = Double.parseDouble(br.readLine());
            y = Double.parseDouble(br.readLine());
        } catch (IOException ex) {
            System.out.println("= AAAAAAAAA WE HAVE PROBLEMS!!!!");
        }
        System.out.println("z = " + (Math.pow(x, 3) - 2.5 * x * y + 1.78 * Math.pow(x, 2) - 2.5 * y + 1));

        System.out.println("4 Задание");
        double a = 0, b = 0;
        try {
            a = Double.parseDouble(br.readLine());
            b = Double.parseDouble(br.readLine());
        } catch (IOException ex) {
            System.out.println("= AAAAAAAAA WE HAVE PROBLEMS!!!!");
        }
        System.out.println("Периметр " + (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b));
    }

    public void laba4() {
        try {
            System.out.println("Лаба 4");
            System.out.println("=======");

            System.out.println("Задание 1");
            double max = 0, min = 0, a = 0, b = 0, c = 0;
            if (a >= b && a >= c) {
                max = a;
            } else {
                if (b >= a && b >= c) {
                    max = b;
                } else {
                    if (c >= b && c >= a) {
                        max = c;
                    }
                }
            }
            if (a <= b && a <= c) {
                max = a;
            } else {
                if (b <= a && b <= c) {
                    max = b;
                } else {
                    if (c <= b && c <= a) {
                        max = c;
                    }
                }
            }
            System.out.println("min = " + min + "\n max = " + max);

            System.out.println("Задание 2");
            LocalDateTime _Dt = LocalDateTime.now();
            int year = 2000;
            int mounth = 5;
            int age = _Dt.getYear() - year;
            if (_Dt.getMonthValue() == mounth || _Dt.getMonthValue() > mounth) {
                age += 1;
            }
            System.out.println("Вот столько лет " + age);

            System.out.println("Задание 3\nВведите дней в году и день недели первого января");
            int k = 0, d = 0;
            try {
                k = Integer.parseInt(br.readLine());
                d = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("= AAAAAAAAA WE HAVE PROBLEMS!!!!");
            }
            switch ((k - d) % 7) {
                case 5:
                    System.out.println("Суббота");
                    break;
                case 6:
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.out.println("Рабочий день");
                    break;
            }

            System.out.println("Задание 4");

            String str = br.readLine();
            String[] mas = str.split(" ");
            int pobeda = 0, nich = 0, porag = 0;

            for (String s : mas) {
                switch (s) {
                    case "3":
                        pobeda++;
                        break;
                    case "0":
                        porag++;
                        break;
                    case "1":
                        nich++;
                        break;
                }
            }
            System.out.println("команда провела " + mas.length
                    + "игры " + pobeda
                    + " побед " + nich + " ничей " + porag + " поражения ");

            System.out.println("Задание 5\n Введите нмоер месяца.");
            try {
                k = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("= AAAAAAAAA WE HAVE PROBLEMS!!!!");
            }

            switch (k) {
                case 1:
                    System.out.println("Зима, Январь, 31 день");
                    break;
                case 2:
                    System.out.println("Зима, Февраль, 28 дней");
                    break;
                case 3:
                    System.out.println("Весна, Март, 31 день");
                    break;
                case 4:
                    System.out.println("Весна, Апрель, 30 дней");
                    break;
                case 5:
                    System.out.println("Весна, Май, 31 день");
                    break;
                case 6:
                    System.out.println("Лето, Июнь, 30 дней");
                    break;
                case 7:
                    System.out.println("Лето, Июль, 31 день");
                    break;
                case 8:
                    System.out.println("Лето, Август, 31 день");
                    break;
                case 9:
                    System.out.println("Осень, Сентябрь, 30 дней");
                    break;
                case 10:
                    System.out.println("Осень, Октябрь, 31 день");
                    break;
                case 11:
                    System.out.println("Осень, Ноябрь, 30 дней");
                    break;
                case 12:
                    System.out.println("Зима, Декабрь, 31 день");
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(J19.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void laba5() {
        System.out.println("Задание 1");
        double puti = 10;
        double obshee_puti = 0;
        for (int i = 1; i < 10; i++) {
            System.out.println("День " + i + " пробег " + puti);
            puti = puti + 0.1 * puti;
            obshee_puti = obshee_puti + puti;
        }
        System.out.println("Всего пробежал " + obshee_puti);

        System.out.println("Задание 2");
        int predel = 0;
        try {
            System.out.println("Ввведите число вместо 1000");
            predel = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("= AAAAAAAAA WE HAVE PROBLEMS!!!!");
        }
        int summa = 0;
        for (int i = 1; i <= predel; i++) {
            summa = summa + i;
        }

        System.out.println("Среднее арифметическое равно = " + summa / predel);

        System.out.println("Задание 3");
        int chislo = 0;
        try {
            System.out.println("Ввведите число вместо ");
            chislo = Integer.parseInt(br.readLine());
            summa = 0;
        } catch (Exception e) {
            System.out.println("= AAAAAAAAA WE HAVE PROBLEMS!!!!");
        }
        for (int i = 1; i < chislo; i++) {
            if (chislo % i == 0) {
                summa = summa + i;
            }
        }
        if (summa == chislo) {
            System.out.println("Совершенное");
        } else {
            System.out.println("не Совершенное");
        }

        System.out.println("Задание 4");
        int schetchik = 0;
        for (int i = 100; i < 100000; i++) {
            if ((i % 10 == 7) && (i % 9 == 0)) {
                System.out.println(i);
                schetchik += 1;
            }
            if (schetchik == 10) {
                break;
            }
        }

        System.out.println("Задание 5");

        System.out.println("Введите: ");
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(J19.class.getName()).log(Level.SEVERE, null, ex);
        }

        int step = 1;
        int value = 0;

        while (true) {
            value += step;

            step += 2;

            if (value > n) {

                System.out.println("Число больше " + n + " это " + value);

                break;
            }
        }
    }

    public void laba6() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println("Задание 1 а)");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                System.out.println(nums[i]);
            }
        }
        System.out.println("Задание 1 б)");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                System.out.println(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                System.out.println(nums[i]);
            }
        }
        System.out.println("Задание 1 в)");

        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() == 1) {
                System.out.println(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() == 2) {
                System.out.println(nums[i]);
            }
        }

        System.out.println("Задание 2");
        int min = 500, max = 0, sred = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        sred = (min + max) / 2;
        String nomera = "";
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > sred) {
                count += 1;
                nomera = nomera + " " + i;
            }
        }
        System.out.println("Их кол-во " + count + " Их номера " + nomera);

        System.out.println("Задание 3");
        double[] nums_double = {0.1, -0.44, -0.66, 223.44, 101.65, -105.10};
        double sred_double = 0;
        for (int i = 0; i < nums_double.length; i++) {
            sred_double = sred_double + nums_double[i];
            if (nums_double[i] > 0) {
                nums_double[i] += 1;
            }
            if (nums_double[i] < 0) {
                nums_double[i] -= 1;
            }
        }
        sred_double = sred_double / nums_double.length;
        for (int i = 0; i < nums_double.length; i++) {
            if (nums_double[i] == 0) {
                nums_double[i] = 0;
            }
            System.out.println(nums_double[i]);
        }

        System.out.println("Задание 4");
        int[][] nums2 = {{1, 5, 5, 4}, {3, 0, 0, 1}};
        min = 500;
        max = 0;
        //Console.WriteLine((nums2.GetUpperBound(0) + 1)+ " " + nums2.Length/ (nums2.GetUpperBound(0) + 1));
        int countmax = 0;
        int countmin = 0;

        for (int i = 0; i < (nums2.length); i++) {
            for (int j = 0; j < nums2[0].length; j++) {
                //System.out.print(" "+nums2[i][j]);
                if (nums2[i][j] > max) {
                    max = nums2[i][j];
                    countmax += 1;
                }
                if (nums2[i][j] < min) {
                    min = nums2[i][j];
                    countmin += 1;
                }
            }
            //System.out.print("\n");
        }

        System.out.println("\n\nmax " + max + " min " + min);

        int XX = 0;
        int YY = 0;

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[0].length; j++) {
                if (nums2[i][j] == max) {
                    XX = i;
                    YY = j;
                    break;
                }
            }
        }

        System.out.println("максимальный элемент массива строка " + XX + " столбец " + YY);
        XX = 0;
        YY = 0;
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[0].length; j++) {
                if (nums2[i][j] == min) {
                    XX = i;
                    YY = j;
                }
            }
        }
        System.out.println("минимальный элемент массива строка " + XX + " столбец " + YY);

        //for (int i = 0; i < (coords.GetUpperBound(0) + 1); i++)
        //{
        //    for (int j = 0; j < coords.Length / (nums2.GetUpperBound(0) + 1); j++)
        //    {
        //        Console.Write(coords[i, j] + " ");
        //    }
        //    Console.Write("\n");
        //}
        System.out.println("Задание 5");
        int[][] c = {{1, 1, 1}, {5, 1, 1}, {1, 1, 1}};
        int leftDiag = 0;
        int rightDiag = 0;
        int[] rowSums = new int[c[1].length];
        int[] colSums = new int[c[1].length];
        Boolean magicornot = true;
        for (int i = 0; i < (c[0].length + 1); i++) {
            for (int j = 0; j < c.length / (c[0].length + 1); j++) {
                rowSums[i] += c[i][j];
                colSums[i] += c[j][i];
                if (i == j) {
                    leftDiag += c[i][j];
                }

                if (j == c[1].length - i - 1) {
                    rightDiag += c[i][j];
                }
            }
        }
        if (leftDiag != rightDiag) {
            System.out.println("Это НЕ магический квадрат");
        } else {
            for (int i = 0; i < c[1].length - 1; i++) {
                if (rowSums[i] != rowSums[i + 1] || colSums[i] != colSums[i + 1]) {
                    System.out.println("Это НЕ магический квадрат");
                } else {
                    if (leftDiag != rowSums[0] || rowSums[0] != colSums[0]) {
                        System.out.println("Это НЕ магический квадрат");
                    } else {
                        System.out.println("Это магический квадрат!!!");
                    }
                }
            }
        }

    }

    public void laba7() {
        System.out.println("Задание 1");
        String s1 = "алигортм";
        int indexI = s1.indexOf("и");
        int indexT = s1.indexOf("т");
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            if (i == indexI) {
                s2 = s1 + s1.charAt(indexT);
            } else {
                if (i == indexT) {
                    s2 = s1 + s1.charAt(indexT);
                } else {
                    s2 = s2 + s1.charAt(i);
                }
            }
        }

        System.out.println("Задание 2");
        s1 = "jhBHaghfgjakshguhuahiugirOKGO";
        int count = s1.split("a").length - 1;
        System.out.println("Кол-во вхождений " + count);

        System.out.println("Задание 3");
        String str = "ыыыыыыыыыыыыыыыыыыыыыыыыАыыыыыыыыыыыыыыыыыБыыыЙ====112";

        String result = "";
        count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count += 1;
                }
            }
            if (count == 1) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);

        System.out.println("Задание 4");

        System.out.println("введите слово: ");
        str = "Ежу хуже";
        //str = Console.ReadLine();
        str = str.toLowerCase();
        String modifiedString = str.replace(" ", "");
        System.out.println(Check(modifiedString) ? "палиндром" : "не палиндром");

        System.out.println("Задание 5");
        //str = Console.ReadLine();
        str = "Жамыс батыров аликбеков жынщина жытели iss шыка";

        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'ж' || str.charAt(i) == 'ш') {
                str2 = str2 + str.charAt(i) + "и";
                i += 1;
            } else {
                str2 = str2 + str.charAt(i);
            }
        }

        System.out.println(str2);
    }

    public void laba8() {
        System.out.println("Задание 1");
        LocalDateTime d1 = LocalDateTime.of(2015, 12, 31, 00, 00, 00);//fact
        LocalDateTime d2 = LocalDateTime.of(2015, 12, 31,00,00,00);//zaplanirvn
        if (d1.isAfter(d2)) {
            System.out.println("Позже");
        } else {
            if (d1.isBefore(d2)) {
                System.out.println("Раньше");
            } else {
                System.out.println("вовремя");
            }
        }

        System.out.println("Задание 2");

        LocalDateTime date1 = LocalDateTime.of(2008, 3, 1, 7, 00, 00);
        LocalDateTime date2 = LocalDateTime.of(2008, 3, 1, 7, 7, 00);

        if (date1.getYear() == date2.getYear()) {
            System.out.println("Year");
        }
        if (date1.getMonth() == date2.getMonth()) {
            System.out.println("Month");
        }
        if (date1.getDayOfMonth() == date2.getDayOfMonth()) {
            System.out.println("Day");
        }
        if (date1.getHour() == date2.getHour()) {
            System.out.println("Hour");
        }
        if (date1.getMinute() == date2.getMinute()) {
            System.out.println("Minute");
        }
        if (date1.getSecond() == date2.getSecond()) {
            System.out.println("Second");
        }

        System.out.println("Задание 3");

        LocalDateTime Birthday = LocalDateTime.of(2000, 1, 10, 00, 00, 00);
        LocalDateTime end = LocalDateTime.now();
        
        Duration duration = Duration.between(Birthday, end);

        System.out.println("Y " + duration.toDays()/365 + " M " + duration.toDays()/30 + " D " + duration.toDays() + "\nTMills " + duration.toMillisPart());

        System.out.println("Задание 4");
        LocalDateTime voteTime = LocalDateTime.of(2022, 12, 24, 6, 00, 00);
        duration = Duration.between(Birthday, end);
        System.out.println("D " + duration.toDays() + " : H " + duration.toHours() + " : M " + duration.toMinutes() + " : S " + duration.toSeconds());

        System.out.println("Задание 5");
        //Москва, Лондон, Нью-Йорк, Токио, Пекин.
        System.out.println("Москва " +end.minusHours(4));
        System.out.println("Лондон " + end.minusHours(7));
        System.out.println("Нью-Йорк " + end.minusHours(12));
        System.out.println("Токио " + end.plusHours(2));
        System.out.println("Пекин " + end.plusHours(1));
    }
}
