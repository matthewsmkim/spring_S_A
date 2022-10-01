package S_A;
public class Taxi extends PublicTransport {

    int taxi_Number;
    
    int basicDistance = 1;
    int basicFare = 3000;
    int fare_Per_distance = 1000;


    Taxi(){
        
        this.max_Passenger = 4;
        this.status = "Normal";
   

        
       
    }

    

    
    
  
    // taxi number
    
    public int get_taxi_number() {
        this.taxi_Number = (int) (Math.random()) * 9999 + 1;
        
        return this.taxi_Number;
        }
    



    
    
    
        // Charge
    public int surcharge(int distance){      

        return fare_Per_distance * distance;
    
        
    }

    public void location(String destination, int distance_To_destination){

        System.out.println("Destination = "+ destination);
        System.out.println("The distance to destination = " + distance_To_destination);

    }
    



    // pay
    public int get_payment(int distance){
    
        return basicFare+(fare_Per_distance * distance);
    }
    
    public void get_taxi_states_info() {
        System.out.println(("State = " + status));
        System.out.println("cc = " + this.current_Oil);
        if (this.current_Oil < 10) {
        System.out.println("Now Empty");
        }
        
        }
    
    
    

}

