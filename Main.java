import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Adinizi giriniz : ");
        String studentName = input.nextLine();
        System.out.println("Lutfen Soyadinizi giriniz : ");
        String studentSurname = input.nextLine();
        System.out.println("Lutfen Quiz sonucunuzu giriniz : ");
        int quizResult = input.nextInt();
        System.out.println("Lutfen Vize sonucunuzu giriniz : ");
        int vizeResult = input.nextInt();
        System.out.println("Lutfen final sonucunuzu giriniz : ");
        int finalResult = input.nextInt();

        double examOrtalama = (quizResult*0.1) + (vizeResult*0.3) + (finalResult*0.6);
        System.out.println("Sinav ortalamasi : " + examOrtalama + "'dir");

        if(examOrtalama>=85)
        {
            System.out.println("Sayin " + studentName + " " + studentSurname + " Not ortalamaniz : " + examOrtalama + "'dir . AA aldiniz ve Sinifi Gectiniz .");
        }
        else if (examOrtalama<85 && examOrtalama>=70)
        {
            System.out.println("Sayin " + studentName + " " + studentSurname + " Not ortalamaniz : " + examOrtalama + "'dir . BB aldiniz ve Sinifi Gectiniz ." );
        }
        else if (examOrtalama<70 && examOrtalama>=60)
        {
            System.out.println("Sayin " + studentName + " " + studentSurname + " Not ortalamaniz : " + examOrtalama + "'dir . CC aldiniz ve Sinifi Gectiniz ." );
        }
        else if (examOrtalama<60 && examOrtalama>=45)
        {
            System.out.println("Sayin " + studentName + " " + studentSurname + " Not ortalamaniz : " + examOrtalama + "'dir . DD aldiniz ve Sinifi Gectiniz ." );
        }
        else{
            System.out.println("Sayin " + studentName + " " + studentSurname + " Sinifta Kaldiniz " );
        }
    }
}
