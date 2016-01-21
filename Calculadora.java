
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    // Almacena los números.
    private int numero;
    // Número al cual se suma.
    private int num;
    // Número sumado.
    private int num2;
    
    public Calculadora()
    {
        numero = 0;
    }
    
    /**
     * Musetra los múltiplos de 5.
     */
    public void multiplesOfFive()
    {
        numero = 15;
        while (numero < 95 && numero % 5 == 0)
        {
            System.out.println(numero);
            numero = numero + 5;
        }
    }
    
    
    /**
     * Suma valores.
     * 
     */
    public void sumValues()
    {
        num = 0;
        num2 = 0;
        while (num2 <= 10)
        {
            num = num + num2;
            num2 = num2 + 1;
        }
        System.out.println(num);
    }
}
