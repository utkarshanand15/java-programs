import java.util.Scanner;

public class BookSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int n = scanner.nextInt();

        
        int max_book_count = scanner.nextInt();

        
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        
        
        int startIndex = 0;

        
        for (int i = 0; i <= n - max_book_count; i++) {
            int sum = 0;
    
            for (int j = i; j < i + max_book_count; j++) {
                sum += prices[j];
            }

        
           
    
            
        }


        
        for (int i = startIndex; i < startIndex + max_book_count; i++) {
            System.out.print(prices[i] + " ");
        }
        System.out.println();
        
}
}