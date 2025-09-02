public abstract class basic_opCalc {
    //polymorphism
    public abstract int execute(int a, int b);

    public static class Addition extends basic_opCalc {
        @Override
        public int execute(int a, int b) {
            return a + b;
        }
    }

    public static class Substraction extends basic_opCalc {
        @Override
        public int execute(int a, int b) {
            return a - b;
        }
    }

}
