public class Three implements Comparable<Three>{
    private int height;
    private int width;

    //constructor
    public Three(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // compare
    @Override
    public int compareTo(Three o) {
        if ((this.width == o.width) &&
        (this.height == o.height)) {
            return 0;
        } else if (this.height >= this.height){
            return 1;
        } else return -1;
    }
}
