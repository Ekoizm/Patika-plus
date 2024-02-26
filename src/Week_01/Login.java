package Week_01;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş yaptınız !!!");
        }else{
            System.out.print("Hatalı veri girdiniz !!!");
        }
        }
    }
