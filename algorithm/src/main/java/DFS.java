import java.util.ArrayList;
import java.util.List;

public class DFS {
    public static void dfs(TreeNode node, List<String> res) {
        res.add(node.value);
        if (node.getChildren() == null) {
            return;
        }

        for (TreeNode child : node.getChildren()) {
            dfs(child, res);
        }
    }

    public static class TreeNode {
        private String value;
        private List<TreeNode> children;

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
        TreeNode node_e = new TreeNode("e",null);
        TreeNode node_b = new TreeNode("b", List.of(node_e));
        TreeNode node_a = new TreeNode("a", List.of(node_b, node_c));

        List<String> res = new ArrayList<>();
        dfs(node_a, res);
        res.forEach(System.out::println);
    }
}
