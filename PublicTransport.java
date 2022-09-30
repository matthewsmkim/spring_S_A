package S_A;
public class PublicTransport {
    int Now_Oil = 100;
    int Now_speed = 0;
    boolean change_speed;
    int Pay;

    int Now_passenger;
    int Max_passenger = 30;
   
  
    String status;


    // change the speed
    public int getNow_speed(int power) {
        if (Now_Oil >= 10) {
        this.status = "ing";
        this.Now_speed += power;
        
        } else {
        post_states(false);
        }
        return Now_speed;
        }






    // change Status
    public boolean post_states(boolean change) {
        if (change == false || this.Now_Oil == 0) {
        status = "Final";
        }
        return change;
    }


     // change oil
     public void now_oil(int use_oil) {
        this.Now_Oil += use_oil;
        System.out.println("cc = " + this.Now_Oil);
    }


    // on board
    public void board(int passengers) {
        this.Now_passenger += passengers;
        
        if (Now_passenger > Max_passenger) {
        System.out.println("Exceed the Limit");
        this.Now_passenger -= passengers;
        } else {
        System.out.println("Passenger(s) is(are) = " + passengers);
        System.out.println("Now Passenger(s) = " + (this.Max_passenger - passengers));
        System.out.println("Check the payment = " + (this.Pay * passengers));
        }
        
        
        }


        
}
