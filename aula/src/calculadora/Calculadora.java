package calculadora;

public class Calculadora{ 

	  

    // atributo 

    private int resultado = 0; 
    private double resultadoDiv = 0; 



    // método somar 

    public int somar( int n1, int n2 ){ 
        resultado = n1 + n2; 
        return resultado; 
    } 



    // método subtrair 

    public int subtrair( int n1, int n2 ){ 
        resultado = n1 - n2; 
        return resultado; 
    }         



    // método multiplicar 

    public int multiplicar( int n1, int n2 ){ 
        resultado = n1 * n2; 
        return resultado; 
    } 



    // método dividir 

    public double dividir( int n1, int n2 ){ 
        resultadoDiv = n1 / n2; 
        return resultadoDiv; 
    } 

} 
