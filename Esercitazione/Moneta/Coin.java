import java.util.Random;

public class Coin{
    private CoinType side;
    private final Random rand;
    private final double pHead; //probability to land on heads

    public Coin(){
        this.side = null;
        this.rand = new Random();
        this.pHead = 0.5;
    }
    
    public Coin(CoinType side){
        this.side = side;
        this.rand = new Random();
        this.pHead = 0.5;
    }

    public Coin(double pHead){
        this.side = null;
        this.rand = new Random();
        this.pHead = pHead;
    }

    public void toss(){
        if(rand.nextDouble() <= pHead){
            side = CoinType.HEADS;
        }
        else{
            side = CoinType.TAILS;
        }
    }

    public CoinType showSide(){
        return side;
    }

    public void printSide(){
        if(side == CoinType.HEADS){
            System.out.println("Coin landed on HEADS");
        }
        else if(side == CoinType.TAILS){
            System.out.println("Coin landed on TAILS");
        }
    }
}
