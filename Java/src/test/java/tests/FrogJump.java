package tests;

public class FrogJump {
    public int frogjump (int X, int Y, int Z){
        int distance = Y - X;
        int jumps = (int)Math.ceil(distance / (double)Z);


        return jumps;
    }

    public static void main(String[] args) {
        FrogJump fr = new FrogJump();
        System.out.println(fr.frogjump(10,85,30));

    }
}
