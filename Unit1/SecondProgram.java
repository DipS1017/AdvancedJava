package Unit1;
import java.awt.*;//for awt component
import java.awt.event.*;//for event
import javax.swing.*;//for event

class Controls extends JFrame{
    JLabel l1,l2,l3;//label
    JTextField t1,t2;//textfield
    JButton b1,b2;//button generates event when clicked

    public void setControls(){
        l1 = new JLabel("Enter the first number");
        l2 = new JLabel("Enter the second number");
        l3 = new JLabel("Result");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("Find Sum");
        b2 = new JButton("Find Sum of Primes");

        // Adding components (controls) into window
        add(l1); add(t1);
        add(l2); add(t2);
        add(b1); add(b2);
        add(l3);

        // Setting windows (JFrame) properties
        setVisible(true); // Shows the window
        setSize(300,200); // Sets the area window
        setLayout(new FlowLayout()); // Describes how the content should be shown
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // When the window is closed, the program will end

        // Handling events for buttons
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                l3.setText("Sum is: " + sum);
            }
        });

        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sumOfPrimes = sumPrimesBetween(num1, num2);
                l3.setText("Sum of primes is: " + sumOfPrimes);
            }
        });
    }

    // Method to check if a number is prime
     boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i ++) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    // Method to sum prime numbers between two given numbers
     int sumPrimesBetween(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}

public class SecondProgram {
    public static void main(String[] args) {
        Controls c1 = new Controls();
        c1.setControls();
    }
}