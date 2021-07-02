
package vetores;

public class SomaVetores {
    public static void main(String[] args) {
        int[] valores = {200, 32, 58, 40, 65, 77, 0, -8};
        
        int total = 0;
        
        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        
        System.out.println(total);
    }
}
