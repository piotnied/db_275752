package pl.edu.agh.tkk17.sample;

/**
 * Created by Piotrek on 2017-06-20.
 */
public class NodeSub extends Node {

    public NodeSub(Node left, Node right)
    {
        super(left, right);
    }

    public void accept(NodeVisitor visitor)
    {
        visitor.visit(this);
    }
}
