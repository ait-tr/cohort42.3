package homework21.computer_shop.computershop.controller;

import homework21.computer_shop.computershop.model.Computer;

public class Stock {
    private Computer[] computers;
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public Stock(int capacity) {
        this.computers = new Computer[capacity];
        this.size = 0;
    }

    public boolean addComputer(Computer computer) {
        if (computer == null || size == computers.length || findComputer(computer.getMsn()) != null) {
            return false;
        }
        computers[size] = computer;
        size++;
        return true;
    }

    private Computer findComputer(long msn) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getMsn() == msn) {
                return computers[i];
            }
        }
        return null;
    }

    public Computer removeComputer(long msn) {
        Computer victim = null;
        for (int i = 0; i < size; i++) {
            if (computers[i].getMsn() == msn) {
                victim = computers[i];
                computers[i] = computers[size - 1];
                computers[size - 1] = null;
                size--;
                break;
            }
        }
        return victim;
    }

    public int getSize() {
        return size;
    }

    public void printComputer(){
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
        System.out.println("______________________________________________ ");
    }
}
