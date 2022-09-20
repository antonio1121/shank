public class mathOpNode extends node {
    enum Op {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    private Op Op ;
    private node left, right ;

    public mathOpNode(node left, node right, Op Op) {

        this.left = left ;
        this.right = right ;
        this.Op = Op ;
    }

    public node getLeft() {
        return left ;
    }
    public node getRight() {
        return right ;
    }

    @Override
    public String toString() {
        return "MathNode(" + Op + "," + left + "," + right + ")" ;
    }
}
