class Solution {
    //creating an adjaceny list to keep a track of all the connected nodes
        List<List<Integer>> adjacencyList = new ArrayList<>();

        //set of visited nodes
        HashSet<Integer> visited = new HashSet<>();

    public int countComponents(int n, int[][] edges) {
        
        //output result;
        int components = 0;
        
        //adding the no of lists needed
        for(int i = 0; i < n; i++){
            adjacencyList.add(new ArrayList<>());
        }

        //filling up adjacency lists
        for(int[] edge : edges){
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        //calling DFS recursively on nodes
        for(int node = 0; node < n; node++){
            if(!visited.contains(node)){
                dfs(node);
                components++;
            }
        }
        return components;
    }


    private void dfs(int node){
        visited.add(node);
        //call DFS recursively on every node connected

        for(int neighbour: adjacencyList.get(node)){
           if(!visited.contains(neighbour)){
               dfs(neighbour);
           }
        }
    }
}