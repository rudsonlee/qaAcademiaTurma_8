import javax.swing.JOptionPane;

public class exe1 {
    public static void main(String[] args) {
        
    

    String nome = JOptionPane.showInputDialog("Digite seu nome: ");
    String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");
    String rua = JOptionPane.showInputDialog("Digite o nome da sua rua: ");
    System.out.println("Exbindo as variaveis do tipo String: \n nome:"+nome+ "\n sobrenome: " +sobrenome+"\n rua: "+rua);

    
}

}