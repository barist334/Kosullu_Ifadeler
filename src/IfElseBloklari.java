public class IfElseBloklari {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 1;

        //boolean compare = a == b;
        //String str = compare ? "Eşittir" : "Eşit Değildir";
        //System.out.println(str);
        /*
        if (compare){
            System.out.println("Eşittir");
        }
        else{
            System.out.println("Eşit Değildir");
        }

         */

        if (a < b && a < c) {
            System.out.println("A en küçük sayıdır.");
        }

        else if (b < a && b < c) {
            System.out.println("B en küçük sayıdır.");
        }
        /*
        else if (c < a && c < b) {
            System.out.println("C en küçük sayıdır.");
        }

         */

        else {
            System.out.println("C en küçük sayıdır.");
        }

        if (a < b ){
            if (a < c){
                System.out.println("A en küçüktür.");
            }
        } else {
            System.out.println("A sayısı C den küçüktür.");
        }

        int var2 = 6;
        System.out.println(+var2);

    }
}
