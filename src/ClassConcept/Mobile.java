package ClassConcept;

public class Mobile {
    Sim1 s1;
    Sim2 s2;
    MemoryCard m;
    Battery b;
    Screen s;
    Mobile(){
        b=new Battery();
        s=new Screen();
        m=new MemoryCard();
        s1=new Sim1();
        s2=new Sim2();
        b.charging();
        b.discharging();
        b.initializeBattery();
        s.touch();
        s.typeT1();
        s.scroll();
        s.initializeScreen();
        s1.dialedCall();
        s1.recievedCall();
        s1.missedCall();
        s1.initialiseSim1();
        s2.recievedCall();
        s2.dialedCall();
        s2.missedCall();
        s2.initialiseSim2();
        m.storeMovie();
        m.storeMusic();
        m.intializeMemory();
    }
    /*public void insertSim1(Sim1 s1){
        this.s1=s1;
    }
    public void insertSim2(Sim2 s2){
        this.s2=s2;
    }
    public void insertMemoryCard(MemoryCard m){
        this.m=m;
    }*/

}
