public class exe9VETOR {
    public static void main(String[] args) {
        String [] vetorMeses;
        vetorMeses = new String [12];

        vetorMeses[0] = "Janeiro"; 
        vetorMeses[1] = "Fevereiro"; 
        vetorMeses[2] = "Março"; 	
        vetorMeses[3] = "Abril"; 
        vetorMeses[4] = "maio";
        vetorMeses[5] = "junho";
        vetorMeses[6] = "julho";
        vetorMeses[7] = "agosto"; 
        vetorMeses[8] = "Setembro";
        vetorMeses[9] = "Outubro"; 
        vetorMeses[10] = "Novembro"; 
        vetorMeses[11] = "Dezembro";
        
int i = 0;
while (i<=12) {
    System.out.println(vetorMeses[i]);
    i++;
    
}
    }
}