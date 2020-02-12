public class Three implements Comparable<Three>{
    private int height;
    private String breed;

    @Override
    public int compareTo(Three o) {
        if (this.breed == o.breed &&
            this.height == o.height) {
            return 0;
        } else if (this.height > this.height){
            return 1;
        } else return -1;
    }
}
