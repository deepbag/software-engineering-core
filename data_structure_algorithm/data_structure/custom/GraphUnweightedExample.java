package data_structure_algorithm.data_structure.custom;

import java.util.*;

public class GraphUnweightedExample {
    Map<String, ArrayList<String>> facebook = new HashMap<>();

    public void print(){
        System.out.println("----------------");
        for(String user: facebook.keySet()){
            System.out.println(user+" --> "+facebook.get(user));
        }
    }

    public void registerPerson(String name){
        facebook.putIfAbsent(name, new ArrayList<>());
    }

    public void addConnection(String friendOf, String friend){
        facebook.get(friendOf).add(friend);
        facebook.get(friend).add(friendOf);
    }

    public void bfs(String name){
        if(!facebook.containsKey(name)){
            System.out.println("User not found!");
            return;
        }
        System.out.println("--------BFS--------");

        Set<String> visited = new HashSet<>();
        List<String> queue = new ArrayList<>();

        visited.add(name);
        queue.add(name);

        System.out.println("Traverse Started: "+ name);
        while (!queue.isEmpty()){
            String userName = queue.removeFirst();

            for(String user_Name:facebook.get(userName)){
                System.out.print(user_Name + "-->");
                if(!visited.contains(user_Name)){
                    visited.add(user_Name);
                    queue.add(user_Name);
                }
            }
        }
        System.out.println();
    }

    public void dfs(String name){
        if(!facebook.containsKey(name)){
            System.out.println("User not found!");
            return;
        }
        System.out.println("--------DFS--------");

        Set<String> visited = new HashSet<>();
        Stack<String> stck = new Stack<>();

        stck.add(name);
        System.out.println("Traverse Started: "+ name);

        while (!stck.isEmpty()){
            String userName = stck.pop();

            if(!visited.contains(userName)){
                visited.add(userName);
                System.out.print(userName + "-->");
                for(String user_name: facebook.get(userName)){
                    if(!visited.contains(user_name)){
                        stck.add(user_name);
                    }
                }
            }
        }
        System.out.println();
    }

    public void removePerson(String name){
        if(!facebook.containsKey(name)){
            System.out.println("User is not found!");
            return;
        }

        // Remove 'name' from everyone's friend list
        for (String user : facebook.keySet()) {
            facebook.get(user).remove(name);
        }

        // Finally, remove the user from facebook
        facebook.remove(name);
    }

    public void removeConnection(String name1, String name2){
        if(!facebook.containsKey(name1) && !facebook.containsKey(name2)){
            System.out.println("User is not found!");
            return;
        }

        facebook.get(name1).remove(name2);
        facebook.get(name2).remove(name1);
    }

    public void hasConnection(String name1, String name2){
        if(!facebook.containsKey(name1) || !facebook.containsKey(name2)) {
            System.out.println("User is not found!");
            return;
        }

        if (facebook.get(name1).contains(name2) && facebook.get(name2).contains(name1)) {
            System.out.println("Yes, both have a connection!");
            return;
        }

        System.out.println("No connection!");
    }

    public void numberOfConnections(String name){
        if(!facebook.containsKey(name)){
            System.out.println("User is not found!");
            return;
        }
        System.out.println(name+" - Total Number of Connection: "+ facebook.get(name).size());
        for(String user_name: facebook.get(name)){
            System.out.println(user_name+" -> ");
        }
    }

    public void isConnected(String start, String end){
        if (facebook.get(start).contains(end) && facebook.get(end).contains(start)) {
            System.out.println("Yes, both have a connection!");
            return;
        }
        System.out.println("No connection!");
    }

    public static void main(String[] arg){
        GraphUnweightedExample gp = new GraphUnweightedExample();
        gp.print();
        gp.registerPerson("Deep");
        gp.registerPerson("Sharad");
        gp.registerPerson("Saloni");
        gp.registerPerson("Diksha");
        gp.registerPerson("Malik");
        gp.registerPerson("Utkarsh");
        gp.print();
        gp.addConnection("Deep","Sharad");
        gp.print();
        gp.addConnection("Deep","Saloni");
        gp.addConnection("Sharad","Malik");
        gp.addConnection("Utkarsh","Deep");
        gp.print();
        gp.bfs("Deep");
        gp.dfs("Deep");
        gp.removePerson("Sharad");
        gp.print();
        gp.removeConnection("Saloni","Deep");
        gp.print();
        gp.hasConnection("Utkarsh","Deep");
        gp.hasConnection("Malik","Deep");
        gp.numberOfConnections("Deep");
        gp.isConnected("Utkarsh","Deep");
    }
}