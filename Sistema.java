import java.util.Scanner;

public class Sistema{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        Brinquedos b = new Brinquedos();
        System.out.println("digite o nome do vendedor");
        b.setNome(obj.nextLine());

        System.out.println("digite o nome do briquedo");
        b.setBrinquedo(obj.nextLine());

        System.out.println("digite a referencia");
        b.setReferencia(obj.nextLine());

        System.out.println("digite o tipo");
        b.setTipo(obj.nextLine());

        System.out.println("digite o preço");
        b.setPreco(obj.nextDouble());

     
        System.out.println(b);

    }
}