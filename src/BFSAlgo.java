import java.util.*;

public class BFSAlgo {
    public static List<Integer> bfs(Map<Integer, List<Integer>> graph, int start){
        //list is used for get the Bfs traversal order
        List<Integer> bfsOrder = new ArrayList<>();
        //to track the visted nodes
        Set<Integer> visited=new HashSet<>();
        //to check next visited node
        Queue<Integer> queue=new LinkedList<>();

        //adding the start node
        queue.add(start);
        visited.add(start);


        while(!queue.isEmpty()){

            int node=queue.poll();
            bfsOrder.add(node);//add the node to bfsOrder to get traversal result
            System.out.println("Node is :" +node);
            //to find unvisited nodes

            for(int nextNode:graph.get(node)){
                if(!visited.contains(nextNode)){
                    visited.add(nextNode);
                    queue.add(nextNode);
                }
            }

        }

return bfsOrder;

    }

    public static void main(String[] args){
        Map<Integer,List<Integer>> graph=new HashMap<>();
        graph.put(1,Arrays.asList(2,3));

        graph.put(3,Arrays.asList(1,4,5));
        graph.put(4,Arrays.asList(1,6));
        graph.put(5,Arrays.asList(2));
        graph.put(2,Arrays.asList(2));
        graph.put(6,Arrays.asList(3));

        System.out.println("graph result is:" +graph);

        List<Integer> Ans=bfs(graph,1);
        System.out.println(Ans);

    }
}
