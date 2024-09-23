public class Data{
    //attributi
    private int giorno;
    private int mese;
    private int anno;

    //metodi
    public void capodanno(){
        giorno = 1;
        mese = 1;
        anno++;
    }

    //getters
    public int getGiorno(){
        return this.giorno;
    }

    public int getMese(){
        return this.mese;
    }

    public int getAnno(){
        return this.anno;
    }
}
