package homework.equation;

import homework.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        double a = 1.0;
        double b = -5.0;
        double c = 6.0;

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        quadraticEquation.display();
        double d = quadraticEquation.delta();
        System.out.println("Discriminant = " + d);
        int n = quadraticEquation.quantityRoots();
        System.out.println("Numbers of roots = " + n);
    }
}
