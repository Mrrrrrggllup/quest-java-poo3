public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude){
        this.altitude = altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    public void takeOff(){
        System.out.println("L'oiseau de proie décolle majestueusement");
    }

    public int ascend(int meters){
        
        setAltitude(getAltitude() + meters);
        System.out.println("Le rapace prend de l'altitude à une vitesse incroyable et est maintenant à " +getAltitude()+" mettres de haut" );
        return this.altitude;
    }

    public int descend(int meters){
        
        setAltitude(getAltitude() - meters);
        System.out.println("Le rapace descend lentement et est maintenant à " +getAltitude()+" mettres de haut" );
        return this.altitude;
    }

    public void land(){
        System.out.println("L'aigle va atterrir !");
    }
}
