package DataStructures.OrgraphWeight;

public class Node {
    int value, weight;

    public Node(int value, int weight){
        this.value = value;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return value + " (" + weight + ")";
    }

}