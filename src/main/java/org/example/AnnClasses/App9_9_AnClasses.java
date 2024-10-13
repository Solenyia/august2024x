package org.example.AnnClasses;

class Machine{
    public void start(){
        System.out.println("Machine starting");
    }
}

interface Plant{
    public void grow();
}

public class App9_9_AnClasses {
    public static void main(String[] args) {
        Machine machine = new Machine() {
            @Override public void start() {

                System.out.println("Machine started");
            }
        };

        machine.start();

        // neda sa spravit objekt z interfacu
        Plant plant = new Plant(){
            @Override public void grow() {
                System.out.println("Plant growing");
            }
        };

        plant.grow();
    }
}
