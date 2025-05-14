package data_structure_algorithm.data_structure.custom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GraphWeightedExample {
    Map<Location, HashMap<Location, Integer>> googlemap = new HashMap<>();

    public void addLocation(Location location){
        googlemap.putIfAbsent(location,new HashMap<>());
    }

    public void printLiftOfLocation(){
        System.out.println("---------------------------------------");
        for(Location location: googlemap.keySet()){
            System.out.println("Location: "+location.getName());
        }
    }

    public void addTravelDistanceTime(Location fromLocationName, Location toLocationName, int timeInHour){
        googlemap.get(fromLocationName).put(toLocationName, timeInHour);
        googlemap.get(toLocationName).put(fromLocationName, timeInHour);
    }

    public void print(){
        System.out.println("---------------------------------------");
        for(Location location: googlemap.keySet()){
            System.out.print("Location: "+location.getName()+" --> ");
            for(Location mappedLocation: googlemap.get(location).keySet()){
                // System.out.print("{ "+"name: "+mappedLocation.getName()+", travelTime: "+googlemap.get(location).get(mappedLocation)+" Hour }"+", ");
                System.out.print("["+mappedLocation.getName()+","+googlemap.get(location).get(mappedLocation)+" Hours] - ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] arg){
        GraphWeightedExample gw = new GraphWeightedExample();
        Location korba = new Location("Korba");
        Location champa = new Location("Champa");
        Location bilaspur = new Location("Bilaspur");
        Location raipur = new Location("Raipur");
        Location bhilai = new Location("Bhilai");

        gw.addLocation(korba);
        gw.addLocation(champa);
        gw.addLocation(bilaspur);
        gw.addLocation(raipur);
        gw.addLocation(bhilai);
        gw.printLiftOfLocation();
        gw.addTravelDistanceTime(korba,champa,1);
        gw.addTravelDistanceTime(korba,bilaspur,2);
        gw.addTravelDistanceTime(korba,raipur,3);
        gw.addTravelDistanceTime(korba,bhilai,4);
        gw.addTravelDistanceTime(champa,bilaspur,1);
        gw.addTravelDistanceTime(champa,raipur,2);
        gw.addTravelDistanceTime(champa,bhilai,3);
        gw.addTravelDistanceTime(bilaspur,raipur,1);
        gw.addTravelDistanceTime(bilaspur,bhilai,2);
        gw.addTravelDistanceTime(raipur,bhilai,1);
        gw.printLiftOfLocation();
        gw.print();
    }
}

class Location {
    String name;

    Location(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}