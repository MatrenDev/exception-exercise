import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Liczba, ktora chcesz spierwiastkowac: ");
        Scanner _load = new Scanner(System.in);
        double load = 0;
        while (true) 
        {
            try 
            {
                load = _load.nextDouble();
                break;
            }
            catch (InputMismatchException e) 
            {
                System.out.println("Podales zla liczbe!");
                _load.next();
            }
        }
        System.out.print(String.format("_/%.2f = %.2f.", load, Math.sqrt(load)));
    }
}




