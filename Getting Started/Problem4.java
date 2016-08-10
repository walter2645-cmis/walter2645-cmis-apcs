import javax.swing.JOptionPane;

public class Problem4
    {
    public static void main( String[] args )
        {
        float sum = 0;
        float diff1 = 0;
        float diff2 = 0;
        float product = 0;
        float div1 = 0;
        float div2 = 0;
        float mod1 = 0;
        float mod2 = 0;       
        
        String input1 = JOptionPane.showInputDialog( "Type a number, decimals are fine." );
        String input2 = JOptionPane.showInputDialog( "Type another number." );
        float num1 = Integer.parseInt( input1 );
        float num2 = Integer.parseInt( input2 );
        sum = num1 + num2;
        diff1 = num1 - num2;
        diff2 = num2 - num1;
        product = num1 * num2;
        div1 = num1 / num2;
        div2 = num2 / num1;
        mod1 = num1 % num2;
        mod2 = num2 % num1;
        System.out.println( num1 + " + " + num2 + " = " + sum + "\n" + num2 + " + " + num1 + " = " + sum + "\n" + num1 + " - " + num2 + " = " + diff1 + "\n" + num2 + " - " + num1 + " = " + diff2 + "\n" + num1 + " * " + num2 + " = " + product + "\n" + num2 + " * " + num1 + " = " + product + "\n" + num1 + " / " + num2 + " = " + div1 + "\n" + num2 + " / " + num1 + " = " + div2 + "\n" + num1 + " % " + num2 + " = " + mod1 + "\n" + num2 + " % " + num1 + " = " + mod2);
        } //end method main
    } //end class Problem4