import javax.swing.JOptionPane;

public class exe3{


    static String primeiroValor;                    //Declarar variável do tipo texto: primeiroValor 
    static String segundoValor;                     //Declarar variável do tipo texto: segundoValor 

    public static void main(String[] args) {
        primeiroValor  = JOptionPane.showInputDialog("Digite o primeiro valor");   //caixa de msg(digite o primeiro valor)
        segundoValor = JOptionPane.showInputDialog("Digite o segundo valor");    //caixa de msg(digite o segundo valor)

System.out.println("Primeiro valor digitado: "+ segundoValor);  //digitar primeiro valor e aparecer o segundo valor          
System.out.println("Segundo valor digitado: " + primeiroValor);  //digitar o segundo valor e aparecer o primeiro
       
    }
   
   
    
   
       

}