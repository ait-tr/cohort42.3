package homework.equation;

import homework.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        double a = -2.5;
        double b = 1.3;
        double c = -7.0;

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        quadraticEquation.display();
        double d = quadraticEquation.delta();
        System.out.println("Discriminant = " + d);
        int n = quadraticEquation.quantityRoots();
        System.out.println("Numbers of roots = " + n);
    }
}
