package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test; 

 

public class CalculadoraTeste { 

 

   @Before
   public void exibirInicioTeste() {
	   System.out.println("iniciando caso de teste");
   }
   
   @After
   public void exibirFimTeste(){
	  System.out.println("Caso de teste finalizado"); 
   }

   @Test 
   public void testeSomar() { 
       int nro1 = 5; 
       int nro2 = 5; 
       Calculadora calc= new Calculadora(); 
       int resultadoEsperado = 10; 
       int resultadoReal= calc.somar(nro1, nro2); 
       assertEquals(resultadoEsperado, resultadoReal); 
   } 

 

   /** 

   * Teste de subtrair na  Calculadora. 

   */ 

  @Test 
  public void testeSubtrair() { 
      int nro1 = 5; 
      int nro2 = 3; 
      Calculadora calc = new Calculadora(); 
      int resultadoEsperado= 2; 
      int resultadoReal= calc.subtrair(nro1, nro2); 
      assertEquals(resultadoEsperado, resultadoReal);   
  } 

   

   /** 

   * Teste de multiplicar na Calculadora. 

   */ 

   @Test 

   public void testeMultiplicar() { 
       int nro1 = 3; 
       int nro2 = 3; 
       Calculadora calc = new Calculadora(); 
       int resultadoEsperado = 9; 
       int resultadoReal = calc.multiplicar(nro1, nro2); 
       assertEquals(resultadoEsperado, resultadoReal); 
   } 

 

   /** 

   * Teste de dividir na Calculadora. 

   */ 

  @Test 

  public void testeDividir() { 
      int nro1 = 3; 
      int nro2 = 2; 
      Calculadora calc = new Calculadora(); 
      double resultadoEsperado= 1.5; 
      double resultadoReal = calc.dividir(nro1, nro2); 
      assertEquals(resultadoEsperado, resultadoReal, 0.5); 
  } 

} 
