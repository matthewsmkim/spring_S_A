package S_A;
public class PublicTransport {
    int current_Oil = 100;
    int current_speed = 0;
    boolean change_speed;
    int fare;

    int current_passenger;
    int max_passenger = 30;
   
  
    String status;


    // change the speed
    public int getCurrent_speed(int power) {
        if (current_Oil >= 10) {
        this.status = "ing";
        this.current_speed += power;
        
        } else {
        post_states(false);
        }
        return current_speed;
        }






    // change Status
    public boolean post_states(boolean change) {
        if (change == false || this.current_Oil == 0) {
        status = "Final";
        }
        return change;
    }


     // change oil
     public void current_oil(int use_oil) {
        this.current_Oil += use_oil;
        System.out.println("cc = " + this.current_Oil);
    }


    // on board
    public void board(int passengers) {
        this.current_passenger += passengers;
        
        if (current_passenger > max_passenger) {
        System.out.println("Exceed the Limit");
        this.current_passenger -= passengers;
        } else {
        System.out.println("Passenger(s) is(are) = " + passengers);
        System.out.println("Now Passenger(s) = " + (this.max_passenger - passengers));
        System.out.println("Check the payment = " + (this.fare * passengers));
        }
        
        
        }


        
}
