package TextEditor;
/**
 * @author Owais
 * @author Mohsin
 * @author Hasin
 */
public class Rope {

    RopeNode root;

    public Rope() {
        root = new RopeNode("");
    }

    public void Empty() {
        root = new RopeNode("");
    }

    public void add(String str) {
        RopeNode nptr = new RopeNode(str);
        RopeNode newRoot = new RopeNode();
        newRoot.left = root;
        newRoot.right = nptr;
        newRoot.weight = newRoot.left.weight;
        if (newRoot.left.right != null) {
            newRoot.weight += newRoot.left.right.weight;
        }
        root = newRoot;
    }

    public char indexAt(int ind) {
        RopeNode t = root;
        if (ind > t.weight) {
            ind -= t.weight;
            return t.right.data.charAt(ind);
        }
        while (ind < t.weight) {
            t = t.left;
        }
        ind -= t.weight;
        return t.right.data.charAt(ind);
    }

    public String substring(int start, int end) {
        String str = "";
        boolean found = false;
        RopeNode tmp = root;
        if (end > tmp.weight) {
            found = true;
            end -= tmp.weight;
            if (start > tmp.weight) {
                start -= tmp.weight;
                str = tmp.right.data.substring(start, end);
                return str;
            } else {
                str = tmp.right.data.substring(0, end);
            }
        }
        if (!found) {
            while (end <= tmp.weight) {
                tmp = tmp.left;
            }
            end -= tmp.weight;
            if (start >= tmp.weight) {
                start -= tmp.weight;
                str = tmp.right.data.substring(start, end) + str;
                return str;
            }
            str = tmp.right.data.substring(0, end);
        }
        tmp = tmp.left;
        while (start < tmp.weight) {
            str = tmp.right.data + str;
            tmp = tmp.left;
        }
        start -= tmp.weight;
        str = tmp.right.data.substring(start) + str;

        return str;

    }

    public void print() {
        print(root);
        System.out.println();
    }

    private void print(RopeNode r) {
        if (r != null) {
            print(r.left);
            if (r.data != null) {
                System.out.print(r.data);
            }
            print(r.right);
        }
    }
    public static void main(String [] args){
        Rope r = new Rope();
        r.add("Hello World");
        r.add(" What");
        r.add(" is");
        r.add(" life?");
        r.print();
    }
}
