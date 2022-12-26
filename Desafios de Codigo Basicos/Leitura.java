import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
          int paginas = leitor.nextInt();
          int paginasLidas = 3;
          int resultado = paginas / paginasLidas;
          
          if (paginas >= 1){
            System.out.println(resultado + " dias");
          };
        }

    }
}
