/* class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing"); //members
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class OOPS {public static void main(String args[]) {
    Pen pen1 = new Pen();
    pen1.color = "blue";
    pen1.type = "gel";

    Pen pen2 = new Pen();
    pen2.color = "Black";
    pen2.type = "ballpoint";

    pen1.printColor();
    pen2.printColor();
}
    
} 

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2) { //constructor
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){

    }
}
public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student(); // constructors: makes a object
        s1.name = "Baibhab";
        s1.age = 21;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
} 

//POLYMORPHISM
//compile time polymorphism

class student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name+ " " + age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Baibhab";
        s1.age = 21;

        s1.printInfo(s1.age);

    }
}

//INHERITANCE

class Shape {       //inheritance class
    String color;
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape { //sub class/child class
    
}

public class OOPS {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
} 

class Shape {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void area(int l,int h) {
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

public class OOPS {
    public static void main(String[] args) {

    }
} */

// ABSTRACTION

/*class Animal

public class OOPS {
    public static void main(String[] args) {
        
    }
} */

// import java.util.*;
// public class OOPS {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
        
        
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         System.out.println(a+"+"+b+"i");
        
//         int c=sc.nextInt();
//         int d=sc.nextInt();
//         System.out.println(c+"+"+d+"i");
        
//         System.out.println("choose option between1 to 4");
//         System.out.println("1 for addition");
//         System.out.println("2 for substraction");
//         System.out.println("3 for multiplication");
//         System.out.println("4 for division");
//         int n=sc.nextInt();
//         switch(n) {
//             case 1:System.out.println((a+c)+"+"+(b+d)+"i");
//             break;
//             case 2:System.out.println((a-c)+"+"+(b-d)+"i");
//             break;
//             case 3:System.out.println((a*c-b*d)+"+"+(a*d+b*c)+"i");
//             break;
//             case 4:System.out.println((a*c+b*d)/(c*c+d*d)+"+"+(b*c-a*d)/(c*c+d*d)+"i");
//             break;

//         }
//     }
// }

// import java.awt.*;
// import java.awt.event.*;

// public class OOPS extends Frame implements ActionListener {

//     private final Label label = new Label("Enter text:");
//     private final TextField field = new TextField(20);
//     private final Button copy = new Button("Copy");

//     public OOPS() {
//         super("Mini AWT");
//         setLayout(new FlowLayout());
//         add(label);
//         add(field);
//         add(copy);
//         copy.addActionListener(this);
//         setSize(300, 100);
//         setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         new TextArea(field.getText()).setVisible(true);
//     }

//     public static void main(String[] args) {
//         new OOPS();
//     }
// }

// import javax.swing.*;
// import java.awt.FlowLayout;
// import java.awt.event.*;

// public class OOPS extends JFrame implements ActionListener {

//     private final JLabel label = new JLabel("Enter text:");
//     private final JTextField field = new JTextField(20);
//     private final JButton copy = new JButton("Show");

//     public OOPS() {
//         super("Mini Swing");
//         setLayout(new FlowLayout());
//         add(label);
//         add(field);
//         add(copy);
//         copy.addActionListener(this);
//         pack();
//         setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         JOptionPane.showMessageDialog(this, field.getText());
//     }

//     public static void main(String[] args) {
//         new OOPS();
//     }
// }

public class OOPS {
    public static void main(String[] args) {

    }
}

