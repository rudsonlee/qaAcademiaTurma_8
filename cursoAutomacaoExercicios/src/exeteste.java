import javax.swing.JOptionPane;

public class exeteste { //2 - faça um algoritmo para somar dois numeros e exibir o resultado

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero1+numero2);

        //3 - faça um algoritmo para multiplicar dois numeros do usuario e exibir o resultado
        int numero3 = 2;
        int numero4 = 4;
        System.out.println(numero3*numero4);

        // dividir
        int numero5 = 25;
        int numero6 = 4;
        System.out.println(numero5*numero6);

        //somar duas palavras
        String nome = "Rudson Lee";
        String sobrenome = "Bruno";
        System.out.println(nome +" "+sobrenome);

        //exibir de 7 a 15
        int num = 7;
        while(num<=15){
            System.out.println("num: "+num);
            num =  num+1;

         //exibir a palavra casa 10 vezes
         String casa = "casa";
         int i = 1;
         while(i<=10){
            System.out.println(casa);
            i = 1+1;
        }

        //Receber  um numero do usuario, somar por 210 e exibir o resultado
        int number = Integer.parseInt(JOptionPane.showInputDialog(" Digite o primeiro numero"));
        int resultado = number+210;
        System.out.println(resultado);

        }
    
}
}