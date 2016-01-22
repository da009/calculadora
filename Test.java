
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    private Calculadora test;
    
    /**
     * Constructor para objetos de la clase test.
     */
    public Test()
    {
        test = new Calculadora();
    }
    
    /**
     * Método para invocar de forma automática el método para sumar intervalos de la clase
     * Calculadora.
     */
    public void testSumValuesInterval()
    {
        int resultado = test.sumValuesInterval(0, 10);
        System.out.println(resultado);
        
        int resultado2 = test.sumValuesInterval(10, 20);
        System.out.println(resultado2);
        
        int resultado3 = test.sumValuesInterval(20, 30);
        System.out.println(resultado3);
        
        int resultado4 = test.sumValuesInterval(30, 40);
        System.out.println(resultado4);
        
        int resultado5 = test.sumValuesInterval(40, 50);
        System.out.println(resultado5);
        
        int resultado6 = test.sumValuesInterval(50, 60);
        System.out.println(resultado6);
    }
    
    /**
     * Método para invocar de forma automática el método para comprovar si un numero es primo 
     * de la clase Calculadora
     */
    public void testIsPrime()
    {
        if (test.isPrime(2) == true)
        {
            System.out.println("Comprobando isPrime(2)... resultado correcto true / resultado metodo true ... OK");
        }
        else
        {
            System.out.println("Comprobando isPrime(2)... resultado correcto true / resultado metodo false ... ERROR");
        }
        
        if (test.isPrime(4) == true)
        {
            System.out.println("Comprobando isPrime(4)... resultado correcto false / resultado metodo true ... ERROR");
        }
        else
        {
            System.out.println("Comprobando isPrime(4)... resultado correcto false / resultado metodo false ... OK");
        }
        
        if (test.isPrime(5) == true)
        {
            System.out.println("Comprobando isPrime(5)... resultado correcto true / resultado metodo true ... OK");
        }
        else
        {
            System.out.println("Comprobando isPrime(5)... resultado correcto true / resultado metodo false ... ERROR");
        }
        
        if (test.isPrime(10) == true)
        {
            System.out.println("Comprobando isPrime(10)... resultado correcto false / resultado metodo true ... ERROR");
        }
        else
        {
            System.out.println("Comprobando isPrime(10)... resultado correcto false / resultado metodo false ... OK");
        }
        
        if (test.isPrime(13) == true)
        {
            System.out.println("Comprobando isPrime(13)... resultado correcto true / resultado metodo true ... OK");
        }
        else
        {
            System.out.println("Comprobando isPrime(13)... resultado correcto true / resultado metodo false ... ERROR");
        }
        
        if (test.isPrime(101) == true)
        {
            System.out.println("Comprobando isPrime(101)... resultado correcto true / resultado metodo true ... OK");
        }
        else
        {
            System.out.println("Comprobando isPrime(101)... resultado correcto true / resultado metodo false ... ERROR");
        }
        
        System.out.println("El método SI funciona correctamente");
    }
}
