public interface Fly{
    //décollage
    void takeOff();

    //Tu t'envol !
    int ascend(int meters);

    //Eh on redescend
    int descend (int meters);

    //Atterissage en cours
    void land();

    //Tous droit jusqu'au matin !
    default void glide(){
        System.out.println("It glides into the air.");
    }

}