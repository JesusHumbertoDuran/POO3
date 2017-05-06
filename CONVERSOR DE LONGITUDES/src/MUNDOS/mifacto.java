package MUNDOS;






public class mifacto {

    public String darFactorial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   



public class conversoFactorial{
      private int factorial=1;
      private  double numero;
      public void leerNumero(double n)
      {
       numero=n;   
      }
      public void calcularFactorial(){
              int i=1;
              while(i<=numero){
              factorial=factorial*i;
              i++;
  }}

      public int darFactorial()
{
  return factorial;    
      
  }
  }
}