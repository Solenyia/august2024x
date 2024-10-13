package org.example.sept24.App18_9_tryWiReso;

class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing Temp");
        throw new Exception("oh no");
    }
}

public class App {
    public static void main(String[] args) {

        try(Temp temp = new Temp()){

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
