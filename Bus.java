package S_A;
public class Bus extends PublicTransport {
    
    

    int busNumber;

    Bus(){
        this.max_passenger = 30;
        this.fare = 1000;
    }

    

    
    
    // Bus number
    public int get_Bus_Number() {
    this.busNumber = (int) (Math.random()) * 9999 + 1;
    return this.busNumber;
    }
    
 
    
   
    
    // Bus Status
    public void get_Bus_States_Info() {
    System.out.println(("State = " + status));
    System.out.println("cc = " + this.current_Oil);
    if (this.current_Oil < 10) {
    System.out.println("Now Empty");
    }
    
    }
    
  
    
    public int getCurrent_speed(int power) {
    if (current_Oil >= 10) {
    this.status = "ing";
    this.current_speed += power;
    
    } else {
    post_states(false);
    }
    return current_speed;
    }

    public static void main(String[] args)
    {
    Bus bus1 = new Bus();
    
    bus1.board(2);
    bus1.current_oil(-50);
    bus1.post_states(false);
    bus1.current_oil(10);
    bus1.get_Bus_States_Info();
    bus1.post_states(true);
    bus1.board(45);
    bus1.board(5);
    bus1.current_oil(-55);
    bus1.get_Bus_States_Info();
    
    
    
    
    
    
    
    }




}
    