import java.util.*;

public class DFS {
    public static List<Integer> dfs(Map<Integer, List<Integer>> graph, int start){

        List<Integer> list=new ArrayList<>();//to get the traversal order
        Set<Integer> visited=new HashSet<>();//to keep track of visiting nodes
        Stack<Integer> stack=new Stack();// A stack to manage the nodes that need to be explored, following LIFO

        stack.push(start);
        visited.add(start);
        while(!stack.isEmpty()) {
            int node = stack.pop();
            System.out.println("node:" + node);
            list.add(node);


            for (int neighbour : graph.get(node)) {
                if(!visited.contains(neighbour)){
                    visited.add(neighbour);
                    stack.push(neighbour);
                }

            }

        }
        return list;
    }

    public static void main(String[] args){
        Map<Integer, List<Integer>> graph=new HashMap<>();
        graph.put(1,Arrays.asList(2,3));
        graph.put(2,Arrays.asList(1,4,5));
        graph.put(3,Arrays.asList(1,6));
        graph.put(4,Arrays.asList(2));
        graph.put(5,Arrays.asList(2));
        graph.put(6, Arrays.asList(3));



        System.out.println(graph);
        List<Integer> result=dfs(graph,1);//1 is for traversal starts with node 1
        System.out.println(result);
    }
}
