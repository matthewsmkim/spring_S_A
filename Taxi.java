package S_A;
public class Taxi extends PublicTransport {

    int taxi_number;
    String destination;
    int distance_to_destination;
    int basicDistance = 1;
    int basicFare = 3000;
    int fare_per_distance = 1000;


    Taxi(){
        
        this.max_passenger = 4;
        this.fare = 3000;
        this.status = "Normal";
   

        
       
    }

    

    
    
  
    // taxi number
    public int get_Taxi_Number() {
        this.taxi_number = (int) (Math.random()) * 9999 + 1;
        return this.taxi_number;
        }
    
    // Charge
    public int surCharge(int distance){      

        return fare_per_distance * distance;
    
        
    }
    



    // pay
    public int get_payment(int distance){
    
    return basicFare+(fare_per_distance * distance);
    }
    
    
    
    public static void main(String[] args){

        Taxi taxi1 = new Taxi();
        
        taxi1.board(2);
    
    // bus1.current_oil(-50);
    // bus1.post_states(false);
    // bus1.current_oil(10);
    // bus1.get_bus_states_info();
    // bus1.post_states(true);
    // bus1.board(45);
    // bus1.board(5);
    // bus1.current_oil(-55);
    // bus1.get_bus_states_info();
    
    
    }
}
