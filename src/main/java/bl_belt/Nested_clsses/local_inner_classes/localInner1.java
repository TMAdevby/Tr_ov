package bl_belt.Nested_clsses.local_inner_classes;

public class localInner1 {

}

class Math{
    public void getResult(){
        class Delenie{
            private int delimoe;
            private int delitel;

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getChastnoe(){
                return delimoe / delitel;
            }

            public int getOstatok(){
                return delimoe % delitel;
            }
        }
    }
}
