import javax.swing.JOptionPane;

public class ExamplesJOP {
    public static void main(String[] args){
        int i;
        double d;
        boolean b;
        String s;

        s = JOptionPane.showInputDialog("Digite uma palavra: ");
        JOptionPane.showMessageDialog(null, "Palavra inserida: " + s);
        // System.out.println(s);
        
        i = Integer.parseInt(JOptionPane.showInputDialog("Insert a Int number: "));
        d = Double.parseDouble(JOptionPane.showInputDialog("Insert a double number: "));
        b = Boolean.parseBoolean(JOptionPane.showInputDialog("Insert a boolean: "));
        
        JOptionPane.showMessageDialog(null, "Int: " + i);
        JOptionPane.showMessageDialog(null, "Double: " + d);
        JOptionPane.showMessageDialog(null, "Boolean: " + b);
        // /n é para pularlinha
        JOptionPane.showMessageDialog(null, "Palavra: " + s + "\nInteiro: " + i + "\nDouble: " + d + "\nBoolean: " +b);
        System.out.printf("Palavra: " + s + "\nInteiro: " + i + "\nDouble: " + d + "\nBoolean: " +b);

    }
}
