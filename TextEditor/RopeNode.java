package TextEditor;
/**
 * @author Owais
 * @author Mohsin
 * @author Hasin
 */
public class RopeNode {

    RopeNode left, right;
    String data;
    int weight;

    public RopeNode(String data) {
        this.data = data;
        weight = data.length();
    }

    public RopeNode() {
        data = null;
        weight = 0;
    }
}
