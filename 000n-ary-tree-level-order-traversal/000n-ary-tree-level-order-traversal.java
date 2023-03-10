/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
         //creating result variable
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        //creating a queue to store Node
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);

        while(!queue.isEmpty()){
            //creating a list to store value in results as per the level
            List<Integer> level = new ArrayList();
            int size = queue.size();

            for(int i = 0; i < size; i++){
                Node currNode = queue.poll();
                level.add(currNode.val);

                for(Node nextNode : currNode.children){
                    if(nextNode != null){
                    queue.offer(nextNode);
                    }
                }
            }
        result.add(level);
        }
        
        return result;
}
}