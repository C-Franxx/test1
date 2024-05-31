import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ascii {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String w1 = scan.next();
        Scanner scan2 = new Scanner(System.in);
        String w2 = scan2.next();
        byte[] WG = w1.getBytes(StandardCharsets.US_ASCII);
        byte[] WG2 = w2.getBytes(StandardCharsets.US_ASCII);
        boolean judge2and4 = true;
        boolean judeg3 = false;
        if (WG.length == WG2.length){
            for (int i = 0;i<= WG.length-1;i++){
                if (WG[i] != WG2[i]){
                    judge2and4 = false;
                    judeg3 = true;
                    if (WG[i] != WG2[i] && WG[i]<100){
                        if (WG[i]+32 != WG2[i]){
                            judeg3 = false;
                        }
                    }else if(WG[i] != WG2[i] && WG[i]>100){
                        if (WG[i]-32 != WG2[i]){
                            judeg3 = false;
                        }
                    }
                }
            }
            if (judeg3){
                System.out.println("3");
            }else {
                if (judge2and4){
                    System.out.println("2");
                }else {
                    System.out.println("4");
                }
            }
        }else {
            System.out.println("1");
        }
    }
}
