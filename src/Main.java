public class Main {
    public static void main(String[] args) {
        System.out.println("задача 1");
        int a = 1;
        byte b = 12;
        short c = 61;
        long d = 1330;
        float i = 3;
        double f = 1.0;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной i с типом float равно " + i);
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println("Задача 2");
        float q = 27.12f;
        long w = 987678965549l;
        double e = 2.786;            // в звдвче написанно 2,786 именно с запятой, ниже в коментариях ответили что это дробное число, а не два разных
        boolean r = false;
        int y = 579;
        short t = -159;
        int u = 27897;
        byte o = 67;
        System.out.println( "задача 3");
        int LP = 23;
        int AS = 27;
        int EA = 30;
        int paper = 480;
        int totalStudents = LP + AS + EA;
        int paperStudent = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");
        System.out.println("Задача 4");
        byte tar = 16;
        byte time = 2;
        int tarPerMinute = tar / time;
        int time20 = tarPerMinute * 20;
        System.out.println("За 20 минут машины произвела бутылок " + time20 + " штук ");
        int dayTar = tarPerMinute * 60 * 34;
        System.out.println("За 20 минут машины произвела бутылок " + dayTar + " штук ");
        int threeDay = dayTar * 3;
        System.out.println("За 20 минут машины произвела бутылок " + threeDay + " штук ");
        int month = dayTar * 30;
        System.out.println("За 20 минут машины произвела бутылок " + month + " штук ");
        System.out.println("Задача 5");
        byte banok = 120;
        byte white = 2;
        byte brown = 4;
        int oneClass = white + brown;
        int classesAtSchcool = banok / oneClass;
        int cansOfWhitePaint = classesAtSchcool * white;
        int cansOfBrownPaint = classesAtSchcool * brown;

        System.out.println("В школе, где " + classesAtSchcool + " классов, нужно " + cansOfWhitePaint + " банок белой краски и " + cansOfBrownPaint + " банок коричневой краски");
        System.out.println("Задача 6");
        byte bananas = 5;
        byte bananaGr = 80;
        short milkMl = 200;
        byte milk100MlInGr = 105;
        int milkGr = milkMl / 100 * milk100MlInGr;
        byte iceCream = 2;
        byte iceCreamGr = 100;
        byte eggs = 4;
        byte eggGr = 70;
        int weightInGrams = bananas * bananaGr + milkGr + iceCream * iceCreamGr + eggs * eggGr;
        double kg = weightInGrams / 1000.0;
        System.out.println("Вес спорт-завтрака " + weightInGrams + " кг");








    }
}