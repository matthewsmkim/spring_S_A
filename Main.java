package S_A;

public class Main {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi();

        taxi1.taxi_board(2);
        taxi1.location("Seoul Station", 2);
        taxi1.get_payment(2);
        taxi1.get_taxi_states_info();



        Bus bus1 = new Bus();

        bus1.board(2);
        bus1.current_oil(-50);
        bus1.post_states(false);
        bus1.current_oil(10);
        bus1.get_bus_states_info();
        bus1.post_states(true);
        bus1.board(45);
        bus1.board(5);
        bus1.current_oil(-55);
        bus1.get_bus_states_info();

    }
}
