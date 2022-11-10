import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Dijkstra {
    private class GraphNode{
        int id;
//        ArrayList<GraphNode> neighbors = new ArrayList<>();
        HashMap<GraphNode, Integer> neighbors = new HashMap<>();
    }

    private static int dijkstra(GraphNode start, int destID){
        HashMap<Integer, Integer> distances = new HashMap<>();
        HashMap<Integer, GraphNode> nodes = new HashMap<>();
        HashSet<Integer> completed = new HashSet<>();

        GraphNode cursor = start;

        while(!completed.contains(destID)){
            //cursor id as a key and value is a cursor
            nodes.put(cursor.id, cursor);
            for(GraphNode neighbor: cursor.neighbors.keySet()){
                nodes.put(neighbor.id, neighbor);
                if (!distances.containsKey(neighbor.id) ||
                        distances.get(cursor.id) + cursor.neighbors.get(neighbor) < distances.get(neighbor.id)){
                    //will update the neighbour
                    //distances at our neighbourID
                    distances.put(neighbor.id, distances.get(cursor.id) + cursor.neighbors.get(neighbor));
                }
                completed.add(cursor.id);
            }

            int minDistance = Integer.MAX_VALUE, minID = 0; //Max number int can store
            for(Integer id: distances.keySet()){
                if(!completed.contains(id)){
                    if(minDistance > distances.get(id)){
                        minDistance = distances.get(id);
                        minID = id;
                    }
                }
            }
            cursor = nodes.get(minID);
        }
    return distances.get(destID);
    }
}
