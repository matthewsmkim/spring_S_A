package S_A;
public class Bus extends PublicTransport {
    
    

    int busNumber;

    Bus(){
        this.max_Passenger = 30;
        this.fare = 1000;
    }

    

    
    
    // Bus number
    public int get_bus_number() {
    this.busNumber = (int) (Math.random()) * 9999 + 1;
    return this.busNumber;
    }
    
 
    
   
    
    // Bus Status
    public void get_bus_states_info() {
        System.out.println(("State = " + status));
        System.out.println("cc = " + this.current_Oil);
        if (this.current_Oil < 10) {
            System.out.println("Now Empty");
     }
    
    }
    
  
    
    public int getCurrent_speed(int power) {
    if (current_Oil >= 10) {
    this.status = "ing";
    this.current_Speed += power;
    
    } else {
    post_states(false);
    }
    return current_Speed;
    }





}
    