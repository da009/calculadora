
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
    // Guarda el mayor número.
    private int mayor;
    
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
     * Suma el intervalo entre 0 y 10. 
     */
    public void sumValues()
    {
        num = 0;
        num2 = 0;
        while (num2 >= 0 && num2 <= 10)
        {
            num = num + num2;
            num2 = num2 + 1;
        }
        System.out.println(num);
    }
    
    /**
     * Suma el intervalo entre los números introducidos.
     */
    public int sumValuesInterval(int numA, int numB)
    {
        num = 0;
        num2 = 0;
        mayor = 0;
        if (numA > numB)
        {
            num = numA;
            num2 = numB;
            mayor = numA;
        }
        else if (numA < numB)
        {
            num = numB;
            num2 = numA;
            mayor = numB;
        }
        else if (numA == numB)
        {
            System.out.println(numA);
        }
        else
        {
            System.out.println("-1");
        }
        while (num2 >= 0 && num2 <= mayor)
        {
            num = num + num2;
            num2 = num2 + 1;
        }
        return num;
    }
    
    /**
     * Devuelve true si es primo y false si no lo es.
     */
    public boolean isPrime(int n)
    {
        // Número por el que se divide.
        num = 2;
        while (num > n -1)
        {
            n = n / num;
            num = num +1;
            n = num2;
        }
        if (num2 != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
