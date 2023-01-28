package 临时软件包;
import java.util.ArrayList;
public class 圣诞树 {
    public static void main(String[] args) {
        TreeObject treeObject = new TreeObject();
        treeObject
                .addNode(1,23,4)
                .addNode(5,41,6)
                .addNode(9,65,9)
                .addNode(5,5,9);
        treeObject.printTree();
    }
}

class TreeObject {
    private ArrayList<Node> nodes = new ArrayList<>();
    private int maxWidth = 0;

    public TreeObject addNode(int topWidth,int bottomWidth,int height) {
        Node node = new Node(topWidth, bottomWidth, height);
        if (node.getMaxWidth() > maxWidth) {
            maxWidth = node.getMaxWidth();
        }
        nodes.add(node);
        return this;
    }

    /**
     * 打印圣诞树
     */
    public void printTree() {
        for (Node node : nodes) {
            int topWidth = node.getTopWidth();
            int bottomWidth = node.getBottomWidth();
            int height = node.getHeight();

            //每层左侧增量
            int leftIncrement = (int) ((float) (bottomWidth - topWidth) / 2 + 1) / height;

            for (int i = 0; i < height; i++) {
                int symbolCount = (topWidth + (i * leftIncrement)) * 2 - 1;
                int spaceCount = (maxWidth - symbolCount)/2;

                printSpace(spaceCount);
                printSymbol(symbolCount);
                System.out.println();
            }
        }
    }

    private void printSpace(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(" ");
        }
    }

    private void printSymbol(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("@");
        }
    }

    private int getMaxWidth() {
        return this.maxWidth;
    }
}

/**
 * 圣诞树每个节点
 */
class Node {
    private int topWidth;
    private int bottomWidth;
    private int height;

    public Node() {
    }

    public Node(int topWidth, int bottomWidth, int height) {
        this.topWidth = topWidth;
        this.bottomWidth = bottomWidth;
        this.height = height;
    }

    public int getTopWidth() {
        return topWidth;
    }

    public void setTopWidth(int topWidth) {
        this.topWidth = topWidth;
    }

    public int getBottomWidth() {
        return bottomWidth;
    }

    public void setBottomWidth(int bottomWidth) {
        this.bottomWidth = bottomWidth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMaxWidth() {
        return topWidth > bottomWidth ? topWidth : bottomWidth;
    }

}


