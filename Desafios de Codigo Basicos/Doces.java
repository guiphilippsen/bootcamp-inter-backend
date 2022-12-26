import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        int compra = doce*2;
        
        if (doce >= 1) {
          System.out.println("O cliente obteve " + compra + " doces" );
        }
    }
}
