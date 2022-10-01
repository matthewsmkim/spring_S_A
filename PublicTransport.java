package S_A;

public class PublicTransport {
    int current_Oil = 100;
    int current_Speed = 0;
    boolean change_Speed;
    int fare = 1000;
    int taxiFare = 3000;

    int current_Passenger;
    int max_Passenger;
   
  
    String status;


    // change the speed
    public int getCurrent_speed(int power) {
        if (current_Oil >= 10) {
        
            this.status = "ing";
            this.current_Speed += power;
        } 
        else {
            post_states(false);
        }
        return current_Speed;
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
        this.current_Passenger += passengers;
        
        if (current_Passenger > max_Passenger) {
            System.out.println("Exceed the Limit");
            this.current_Passenger -= passengers;
        } 
        else {
            System.out.println("Passenger(s) is(are) = " + passengers);
            System.out.println("Now Passenger(s) = " + (this.max_Passenger - passengers));
            System.out.println("Check the payment = " + (this.taxiFare ));
        }
        
        
    }

    public void taxi_board(int passengers) {
        this.current_Passenger += passengers;
            
            if (current_Passenger > max_Passenger) {
                System.out.println("Exceed the Limit");
                this.current_Passenger -= passengers;
            } 
            else {
                System.out.println("Passenger(s) is(are) = " + passengers);
                System.out.println("Now Passenger(s) = " + (this.max_Passenger - passengers));
                System.out.println("Check the payment = " + this.fare);
            }
            
            
        }


        
}
