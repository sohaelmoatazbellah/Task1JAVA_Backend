import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The even number from 1 to 20 is : ");
        for(int i = 1; i<= 20; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
