package Interfaces;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {
    public static void main(String[] args){
        CentralTraffic ct=new AustralianTraffic();
        AustralianTraffic at=new AustralianTraffic();
        ContinentalTraffic cot=new AustralianTraffic();
        ct.redStop();
        ct.flashYellow();
        ct.greenGo();
        at.walkOnSymbol();
        cot.trainSymbol();
    }
public void walkOnSymbol(){
    System.out.println("Walking");
}
    @Override
    public void greenGo() {
        System.out.println("Move");

    }

    @Override
    public void redStop() {
        System.out.println("Stop");
    }

    @Override
    public void flashYellow() {
        System.out.println("You can (not) do it");
    }

    @Override
    public void trainSymbol() {
        System.out.println("Slow down!");
    }
}
