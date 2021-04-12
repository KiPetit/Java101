package Abstraction;

public class ChildUkraine extends ParentAirCraft {
    public static void main(String[] args) {
        ChildUkraine ac = new ChildUkraine();
        ac.engine();
        ac.safetyGuidelines();
        ac.bodyColor();
    }

    @Override
    public void bodyColor() {
        System.out.println("Color is Blue");
    }
}
