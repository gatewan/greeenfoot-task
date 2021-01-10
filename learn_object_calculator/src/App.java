
public class App {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        k.setBilangan1(10);
        k.setBilangan2(5);
        k.setOperator('*');
        k.proses();
        
    }
}

class Kalkulator {
    // properti
    private int bilangan1;
    private int bilangan2;
    private char operator;

   
    public int getBilangan1() {
        return bilangan1;
    }

    
    public void setBilangan1(int bilangan1) {
        this.bilangan1 = bilangan1;
    }

   
    public int getBilangan2() {
        return bilangan2;
    }

  
    public void setBilangan2(int bilangan2) {
        this.bilangan2 = bilangan2;
    }

  
    public char getOperator() {
        return operator;
    }

   
    public void setOperator(char operator) {
        this.operator = operator;
    }
    
    public void proses() {
        System.out.println(bilangan1 + " " + operator + " " + bilangan2 + " = " + hitung());
    }
    
    private float hitung() {
        if(operator == '+') {
            return bilangan1 + bilangan2;
        }
        else if(operator == '-') {
            return bilangan1 - bilangan2;
        }
        else if(operator == '/') {
            return bilangan1 / bilangan2;
        }
        else if(operator == '*'){
            return bilangan1 * bilangan2;
        }
        return 0;
    }
}