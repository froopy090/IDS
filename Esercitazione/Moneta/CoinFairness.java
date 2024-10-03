public class CoinFairness{
    public static boolean isFair(Coin coin, double tolerance){
        int nHeads = 0;
        for(int i = 0; i < 1000; i++){
            coin.toss();
            if(coin.showSide() == CoinType.HEADS){
                nHeads++;
            }
        }
        double p = (double)nHeads/1000;
        if(0.5 - tolerance / 2 < p && p < 0.5 + tolerance / 2){
            return true;
        }
        return false;
    }
}
