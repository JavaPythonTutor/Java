import java.util.Scanner;

public class example1 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String input;
        input = in.nextLine();

        String[] arr = input.split(" ");

        int val = Integer.parseInt(arr[0]);
        int val2 = Integer.parseInt(arr[1]);

        System.out.println(val+val2);
        System.out.println(val-val2);
        System.out.println(val*val2);
        System.out.println(val+val2);
        System.out.println(val%val2);


        in.close();

    }
}
