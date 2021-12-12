public class SwitchCase {
    public static void main(String[] args) {
        int day = 1;
        // Break komutu kullanılmazsa kullanılmayan tüm case işlemleri işleme girer ve çıktı verir.
        switch (day){
            case 1:
                System.out.println("Bugün Pazartesi");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                break;
            case 6:
                System.out.println("Bugün Cumartesi");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız !");

        }
    }
}
