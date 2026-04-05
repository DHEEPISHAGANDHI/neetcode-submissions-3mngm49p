/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        Map<Node,Node> newest=new HashMap<>();
        return dfs(node,newest);
    }
    private Node dfs(Node node,Map<Node,Node> newest)

    {
        if(node==null)
        {
            return null;
        }
        if(newest.containsKey(node))
        {
            return newest.get(node);
        }
        Node copy= new Node(node.val);
        newest.put(node,copy);

        for(Node ngh : node.neighbors)
        {
            copy.neighbors.add(dfs(ngh,newest));
        }
        return copy;
    }
}