public class exe7VETOR { // 7 Faça um algoritmo para ler todos os meses do ano, armazene em um vetor
    public static void main(String[] args){
        exe7VETOR x = new exe7VETOR();
        x.preencheVetorMeses();
      
  
    }
    public String[] preencheVetorMeses() {
        String[] vetorMeses;
        vetorMeses = new String[12];
        vetorMeses[0] = "Janeiro";
        vetorMeses[1] = "Fevereiro";
        vetorMeses[2] = "Março";
        vetorMeses[3] = "Abril";
        vetorMeses[4] = "Maio";
        vetorMeses[5] = "Junho";
        vetorMeses[6] = "Julho";
        vetorMeses[7] = "Agosto";
        vetorMeses[8] = "Setembro";
        vetorMeses[9] = "Outubro";
        vetorMeses[10] = "Novembro";
        vetorMeses[11] = "Dezembro";
        System.out.println(vetorMeses[0]+"\n"+vetorMeses[1]+"\n"+vetorMeses[2]+"\n"+vetorMeses[3]+"\n"+vetorMeses[4]+"\n"+vetorMeses[5]+"\n"+vetorMeses[6]+"\n"+vetorMeses[7]+"\n"+vetorMeses[8]+"\n"+vetorMeses[9]+"\n"+vetorMeses[10]+"\n"+vetorMeses[11]);
        return vetorMeses;
    
    }

}
