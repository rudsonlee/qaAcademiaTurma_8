import javax.swing.JOptionPane;

public class ExerCasa1 { //Faça um Algoritmo para somar tres numeros e exibir o resultado
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;
        System.out.println(numero1+numero2+numero3);

    
        //Faça um algoritmo para exibir de 30 a 45
        int num = 30;
        while(num<=45){
            System.out.println("num: "+num);
            num =  num+1;

        }
            //faça um algoritmo para exibir de 100 a 0 (decrescente)
            int number = 100;
            while(number>=0){
                System.out.println(number);
                number =  number-1;
}




            //Faça um algoritmo para receber uma palavra do usuario, altere o valor dela e exiba a variavel com valor trocado

String sabado = JOptionPane.showInputDialog("Digite uma palavra");
 sabado = "Domingo";
System.out.println("Voce digitou: "+sabado);
    


}
}
