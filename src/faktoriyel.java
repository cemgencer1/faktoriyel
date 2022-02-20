import java.util.Scanner;
public class faktoriyel {
    public static void main (String[]args){
        int n,r,p;
        int nfonk=1,rfonk=1,nrfonk=1,sonuc=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("n Fonksiyon Değerini Giriniz :");
        n = inp.nextInt();
        System.out.print("r Fonksiyon Değerini Giriniz :");
        r = inp.nextInt();

        for (int i=1;i<=n;i++){
            nfonk*=i;
        }

        for (int s=1;s<=r;s++){
            rfonk*=s;
        }
        p=n-r;
        for (int t=1;t<=p;t++){
            nrfonk*=t;
        }
        sonuc=nfonk/(rfonk*nrfonk);
        System.out.print("Kombinasyon sonucu :"+ sonuc);

    }
}
