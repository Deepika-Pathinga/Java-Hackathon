package java_hackathon_feb_1_2020;

public class Q33_Person implements Comparable<Q33_Person> {
	int height;
    int weight;

    public Q33_Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Q33_Person p) {
        if(this.height>p.height) {
            return 1;
        } else if(this.height < p.height) {
            return -1;
        } else {
            return 0;
        }
    }
   
}
