package DataStructures.Orgraph;

public class Edge {
    int src, dest;

    Edge(int src, int dest)
    {
        this.src = src;
        this.dest = dest;
    }

    @Override
    public String toString(){
        return "(" + src + ";" + dest + ")";
    }

}
