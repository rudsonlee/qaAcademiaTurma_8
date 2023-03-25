import javax.swing.JOptionPane;

public class exeExtra{


    static String primeiroValor;                    //Declarar variável do tipo texto: primeiroValor 
    static String segundoValor;                     //Declarar variável do tipo texto: segundoValor 
    static String terceiroValor;                     //Declarar variável do tipo texto: terceiroValor 


    public static void main(String[] args) {
        primeiroValor  = JOptionPane.showInputDialog("Digite o primeiro valor");   //caixa de msg(digite o primeiro valor)
        segundoValor = JOptionPane.showInputDialog("Digite o segundo valor");    //caixa de msg(digite o segundo valor)
        terceiroValor = JOptionPane.showInputDialog("Digite o terceiro valor");    //caixa de msg(digite o terceiro valor)

        System.out.println("O usuario digitou : "+primeiroValor);   //digitar primeiro valor e aparecer o segundo valor          
        System.out.println("O usuario digitou : "+segundoValor);   //digitar o segundo valor e aparecer o primeiro
        System.out.println("O usuario digitou : "+terceiroValor);   //digitar o segundo valor e aparecer o primeiro

    }
   
   
    
   
       

}