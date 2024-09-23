public class Data{
    //attributi
    private int giorno;
    private int mese;
    private int anno;
    

    //costruttore
    public Data(int giorno, int mese, int anno){
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public Data(int mese, int anno){
        this.giorno = 1;
        this.mese = mese;
        this.anno = anno;
    }


    //metodi
    public void capodanno(){
        giorno = 1;
        mese = 1;
        anno++;
    }

    //getters
    public int getGiorno(){
        return this.giorno; //qui non ti serve this ma sono abbituato così
    }

    public int getMese(){
        return this.mese;
    }

    public int getAnno(){
        return this.anno;
    }
}
