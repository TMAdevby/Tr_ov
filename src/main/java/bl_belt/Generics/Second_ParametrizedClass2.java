package bl_belt.Generics;

public class Second_ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("privet", 20);
        System.out.println("Znacheniya pari: value1 = " + pair1.getFirstValue1() +
                ", value2 = " + pair1.getSecondValue2());
        Pair<Integer, Double> pair2 = new Pair<>(156, 3.14);
        System.out.println("Znacheniya pari: value1 = " + pair2.getFirstValue1() +
                ", value2 = " + pair2.getSecondValue2());
    }
}

class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue1() {
        return value1;
    }

    public V2 getSecondValue2() {
        return value2;
    }
}
