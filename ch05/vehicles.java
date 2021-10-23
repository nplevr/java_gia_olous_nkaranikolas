import java.lang.String;

class vehicle {
    int passengers;
    int distance;

    //constructors
    public vehicle(){
        passengers = 5;
        distance = 0;
    }
    public vehicle(int p){
        passengers = p;
        distance = 0;
    }
    //interface methods
    public void setPassengers(int p){
        passengers = p;
    }
    public void trip (int d) {
        distance = distance + d;
    }
    public String toString(){
        return getClass() + "\nΕπιβάτες:" + passengers +
        "\tΑπόσταση:" + distance;
    }
}
    
class automobile extends vehicle {
        private String fuel;
        private double consumption_per_km;

        //constructors
        public automobile() {
            passengers = 4;
            distance = 0;
            fuel = "gasoline";
            consumption_per_km = 0.1;
        }
        public automobile(int p, String f, double c){
            passengers = p;
            distance = 0;
            fuel = f;
            consumption_per_km = c;
        }
        //interface methods
        public String toString(){
            return getClass() + "\nΕπιβάτες:" + passengers +
            "\tΑπόσταση:" + distance + "\nΚατανάλωση: " + 
            distance * consumption_per_km +
            " ltr " + fuel;
        }
    }

class vessel extends vehicle {
        private String fuel;
        private double consumption_per_km;
        private String captain;
        private String chief_engineer;

        //constructors
        public vessel() {
            passengers = 300;
            distance = 0;
            fuel = "petroleum";
            consumption_per_km = 2.0;
            captain = "Unknown";
            chief_engineer = "Unknown";
        }
        public vessel(int p, String f, double con,
            String cap, String cen) {
            passengers = p;
            distance = 0;
            fuel = f;
            consumption_per_km = con;
            captain = cap;
            chief_engineer = cen;
        }
        //interface methods
        public String toString() {
            return getClass() + "\nCaptain: " + captain + 
            "\tEngineer: " + chief_engineer +
            "\nΕπιβάτες: " + passengers +
            "\tΑπόσταση: " + distance + "\nΚατανάλωση:" +
            distance * consumption_per_km +
            " ltr " + fuel;
        }
    }

class aircraft extends vehicle{
        private String fuel;
        private double consumption_per_km;
        private String captain;

        //constructors
        public aircraft(){
            passengers = 100;
            distance = 0;
            fuel = "kerosene";
            consumption_per_km = 1.0;
            captain = "Unknown";
        }
        public aircraft(int p, String f, double con,
                        String cap){
            passengers = p;
            distance = 0;
            fuel=f;
            consumption_per_km = con;
            captain = cap;
        }
        // interface methods
        public String toString(){
            return getClass() + "\nCaptain: " + captain +
            "\nΕπιβάτες:" + passengers +
            "\tΑπόσταση:" + distance +
            "\nΚατανάλωση:" + distance * consumption_per_km
            + " ltr " + fuel;
        }
}

public class vehicles {
    public static void main (String args[]){
        //construct vehicles
        automobile am0 = new automobile();
        automobile am1 = new automobile(5, "petroleum",
        0.08);
        automobile bus = new automobile(25, "petroleum",
        0.15);
        aircraft ac0 = new aircraft();
        aircraft ac1 = new aircraft(150, "kerosene",
        1.15, "Ιωάννης Ανεμίδης");
        aircraft airtaxi = new aircraft(8, "gasoline",
        0.35, "Γεώργιος Ταρίφας");
        vessel v0 = new vessel();
        vessel v1 = new vessel(150, "petroleum", 1.25,
            "Ιωάννης Θαλασσινός", "Παναγιώτης Μάστορας");
        //do trips
        am0.trip(20); am0.trip(15); am0.trip(185);
        am1.trip(10); am1.trip(12); am1.trip(42);
        am1.trip(17);
        bus.trip(40); bus.trip(250);
        ac0.trip(2000); ac0.trip(2500);
        ac1.trip(3200); ac1.trip(4800);
        airtaxi.trip(200); airtaxi.trip(320);
        v0.trip(500); v0.trip(550);
        v1.trip(300); v1.trip(320); v1.trip(300);
        // display results
        System.out.println(am0.toString());
        System.out.println(am1.toString());
        System.out.println(bus.toString());
        System.out.println(ac0.toString());
        System.out.println(ac1.toString());
        System.out.println(airtaxi.toString());
        System.out.println(v0.toString());
        System.out.println(v1.toString());

    }
}

