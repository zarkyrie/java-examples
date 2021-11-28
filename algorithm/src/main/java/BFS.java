import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BFS {
    public static void bfs(TreeNode node) {
        List<String> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            TreeNode tn = queue.poll();
            res.add(tn.getValue());
            if (tn.getChildren() != null && tn.getChildren().size() != 0) {
                queue.addAll(tn.getChildren());
            }
        }

        res.forEach(System.out::println);
    }

    public static class TreeNode {
        private String value;
        private List<TreeNode> children;

        public TreeNode(String value) {
            this.value = value;
            this.children = null;
        }

        public TreeNode(String value, List<TreeNode> children) {
            this.value = value;
            this.children = children;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public List<TreeNode> getChildren() {
            return children;
        }

        public void setChildren(List<TreeNode> children) {
            this.children = children;
        }
    }

    public static void main(String[] args) {
        TreeNode node_d = new TreeNode("d", null);
        TreeNode node_c = new TreeNode("c", List.of(node_d));
        TreeNode node_b = new TreeNode("b", null);
        TreeNode node_a = new TreeNode("a", List.of(node_b, node_c));
        bfs(node_a);
    }
}
