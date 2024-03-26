package homework.cube;

import homework.cube.model.Cube;

public class CubeAppl {
    public static void main(String[] args) {

        Cube cube1 = new Cube(10);
        Cube cube2 = new Cube(20);
        Cube cube3 = new Cube(100);

        System.out.println(cube1.perimeter());
        System.out.println(cube2.perimeter());
        System.out.println(cube3.perimeter());
        System.out.println("------------------------");
        System.out.println(cube1.square());
        System.out.println(cube2.square());
        System.out.println(cube3.square());
        System.out.println("------------------------");
        System.out.println(cube1.volume());
        System.out.println(cube2.volume());
        System.out.println(cube3.volume());

    }
}
