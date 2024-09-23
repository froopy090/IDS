public class Main{
    public static void main(String [] args){
        int x = 1; //tipo primitivo, si comporta come in C, stack
        Data d = new Data(); //puntatore in stack, quando chiamo costruttore mi fa la malloc per me in heap

        Data d1 = d; //entrambi puntano allo stesso oggetto in heap
        d.capodanno();
        System.out.println(d1.getAnno());

        d1 = null;
        d = null; //non è un problema perché java automaticamente fa la free
    }
}
