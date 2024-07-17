package io.peerislands;

public class DroolsExample {
    public static void main(String[] args) {
        try {
            DroolsEngine engine = new DroolsEngine();
            engine.executeRules(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
