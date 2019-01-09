package shopping;

// Declare the type variable (before use :)
public class Pair<E> {
    E left;
    E right;

    public Pair(E left, E right) {
        this.left = left;
        this.right = right;
    }

    public E getLeft() {
        return left;
    }

    public E getRight() {
        return right;
    }

    public void setLeft(E left) {
        this.left = left;
    }

    public void setRight(E right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}