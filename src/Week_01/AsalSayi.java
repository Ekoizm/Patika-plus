package Week_01;

public class AsalSayi {
    public static void main(String[] args) {

        int count = 0;

        //En küçük asal sayı 2 olduğundan döngümüzü burdan başlatıyoruz
        for(int sayi=2;sayi<=100;sayi++)
        {
            int check = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    check = 1;
                    break;
                }
            }
            //Sayının asal olup olmadığını kontrol ediyoruz.Asal ise ekrana yazdırıyoruz
            if(check==0)
            {
                System.out.print(sayi+" Asal Sayıdır\n");
                count++;
            }
        }
    }
}
