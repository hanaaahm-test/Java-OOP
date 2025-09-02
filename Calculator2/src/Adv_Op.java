public abstract class Adv_Op {
    //polymorphism
    public abstract double execute(double s);

    public static class squar extends Adv_Op
    {
        @Override
        public double execute(double a) {
            return a * a;
        }
    }

    public static class SquareRoot extends Adv_Op {
        @Override
        public double execute(double b ) {
            return Math.sqrt(b);
        }
    }
}


