import java.util.Scanner;
public class Edad
{
    public static Scanner sc=new Scanner(System.in);
    public static int an,aa,r;
    
    public static void calcularEdad()
    {
        System.out.println("Ingrese año de nacimiento: ");
        an=sc.nextInt();
        aa=2024;
        r=aa-an;
        System.out.println(r + " años");
}
}
