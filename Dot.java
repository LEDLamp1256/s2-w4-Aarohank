public class Dot{
        public void scream(){
        System.out.println("s1");
        }
    public int move(){
        System.out.println("1");
        return 1;
    }
    }

    public void test(){
        System.out.println("here");
    }

    class FasterDot extends Dot{
        public void report(){
                System.out.println("r2");
        }
    public int move(){
        System.out.println("2");
        return 2;
    }
    }

    class VeryFastDot extends FasterDot{
        public void scream(){
        System.out.println("s4");
        }
        public void report(){
                System.out.println("r4");
        }

    public int move(){
        System.out.println("4");
        return 4;
    }       
    public static void main(String[] args){
        Dot d1 = new Dot();
        FasterDot d2 = new FasterDot();
        VeryFastDot d3 = new VeryFastDot();
        Dot d4 = new VeryFastDot();
        FasterDot d5 = new VeryFastDot();

        d1.move();
        d2.move();
        d3.move();
        d4.move();
        d5.move();
        d2.scream();
        d4.scream();
        d5.scream();
        //d1.report();
        d5.report();
    }
    }