import javax.swing.JOptionPane;

public class exe9 {

    public static void main(String[] args) throws Exception {
        int i = 0;
        int num =  Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int resultado;
        while(i<=10){
            resultado = num*i;
            i=i+1;
            System.out.println(resultado);


        }

        }

     
    }

// fim da classe