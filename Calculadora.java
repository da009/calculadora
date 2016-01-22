 
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
        if (numA > numB && numA > 0)
        {
            num = numA;
            num2 = numB;
            mayor = numA;
        }
        else if (numA < numB && numB > 0)
        {
            num = numB;
            num2 = numA;
            mayor = numB;
        }
        else if (numA == numB && numA > 0)
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
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador != n))
        {
            if (n % contador == 0)
            {
                primo = false;
            }
            contador = contador +1;
        }
        return primo;
    }
    
    /**
     * Permite múltiplicar dos valores introducidos por teclado.
     */
    public void multiplicar(int factor1, int factor2)
    {
        int producto = 0;
        int suma = 0;
        if (factor1 > 0 && factor2 > 0)
        {
            if (factor2 > 1)
            {
                while (factor2 !=0)
                {
                    suma = suma + factor1;
                    factor2 = factor2 - 1;
                }
                producto = suma;
            }
            else
            {
                producto = suma;
            }
            System.out.println("El resultado es: " + producto + ".");
        }
        else if (factor1 == 0 || factor2 == 0)
        {
            System.out.println("Los factores deben tener un valor superior a 0.");
        }
        else
        {
            System.out.println("-1");
            System.out.println("Error, el valor debe ser positivo.");
        }
    }
}
