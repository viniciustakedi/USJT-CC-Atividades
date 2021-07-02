package vetores;

public class Vetores {

    public static void main(String[] args) {
        //Declarar um vetor de valores inteiros
        
        int[] v1 = new int[5];
        int[] v2 = new int[500];      
        int[] v3 = {32, -993, 3923, -1, 12, 17, -19, 135, -90};
        
        for (int i = 0; i < v3.length; i++) {
            System.out.println(v3[i]);
            
            try {
                Thread.sleep(300);
            }
            catch(Exception ex){}
                
        }
        
        //Vetor 4
        int[] v4 = {35, 20, 18, 0, 9, -1, 89732, 423, 9392, 43};
        
        //criar vetor temporario
        int[] temp = new int[20];
        
        for (int i = 0; i < v4.length; i++) {
            temp[i] = v4[i];
        }
        
        //Atualizando referencia do v4 para um novo vetor
        v4 = temp;
        
        v4[12] = 832;
        
    }
    
}
