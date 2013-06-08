public class Main {
    public static void main(String[] args) {
        int a1 = '\u0030';
        int b1 = '\u0041';
        int c1 = '\u007A';
        System.out.println(a1+","+b1+","+c1);
        System.out.println("48 \u0030");
        System.out.println("65 \u0041");
        System.out.println("122 \u007A");

        System.out.println("\u0048\u0065\u006C\u006C\u006F \u0057\u006F\u0072\u006C\u0064\u0021");
        
        int a2 = 2;
        int b2 = 4217;
        float c2 = 3.531203313914162463126318921213891263911512f;
        int d2 = 2147483647;
        double e2 = Double.MAX_VALUE;
        System.out.println(Integer.MAX_VALUE+" <= "+d2);
        System.out.println(d2+" + 1 = "+(d2+1));
        System.out.println(a2+" + "+b2+" = "+(a2+b2));
        System.out.println(a2+" - "+c2+" = "+(a2-c2));
        System.out.println(b2+" * "+c2+" = "+(b2*c2));
        System.out.println(b2+" / "+a2+" = "+(b2/a2));
        System.out.println(e2+" * "+c2+" = "+(e2*c2));
        
        System.out.println((e2*e2));
        System.out.println(0/0);
    }
}
