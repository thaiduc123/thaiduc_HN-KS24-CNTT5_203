public class b2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;// sao chép GIÁ TRỊ
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Ect s1 = new Ect("duc");
        Ect s2 = s1;// sao chép ĐỊA CHỈ
        s2.name = "thai";
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}
