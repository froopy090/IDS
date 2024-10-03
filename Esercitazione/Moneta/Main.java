public class Main{
    public static void main(String[] args){
        Coin coin1 = new Coin();
        coin1.toss();
        
        int nTosses = 50;
        //tossing multiple times
        int nHeads = 0;
        System.out.println("Tossing coin1");
        for(int i = 0; i < nTosses; i++){
            coin1.toss();
            if(coin1.showSide() == CoinType.HEADS){
                nHeads++;
            }
        }
        System.out.println("Total heads: " + nHeads + "\nTotal tails:" + (50 - nHeads));

        //creating an unbalanced coin 
        Coin coin2 = new Coin(0.8);
        nHeads = 0;
        System.out.println("Tossing coin2");
        for(int i = 0; i < nTosses; i++){
            coin2.toss();
            if(coin2.showSide() == CoinType.HEADS){
                nHeads++;
            }
        }
        System.out.println("Total heads: " + nHeads + "\nTotal tails:" + (50 - nHeads));
    
        if(CoinFairness.isFair(coin2, 0.05)){
            System.out.println("This coin is fair");
        }
        else{
            System.out.println("This coin is not fair");
        }

        if(CoinFairness.isFair(coin1, 0.05)){
            System.out.println("This coin is fair");
        }
        else{
            System.out.println("This coin is not fair");
        }
    }
}
