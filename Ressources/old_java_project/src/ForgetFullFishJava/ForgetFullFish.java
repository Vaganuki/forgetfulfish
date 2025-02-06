package ForgetFullFishJava;

import java.util.Random;

public class ForgetFullFish {
    public static void initDeck(int[] deck, int[] stock){
        Random r=new Random();
        for(int i=0; i<deck.length; i++){
            do{
                int c=r.nextInt(26);
                if (stock[c]>0) {
                    deck[i]=c;
                    stock[c]--;
                }
            }while(deck[i]==-1);
        }
    }
    public static void melangeDeck(int[] deck, int[] stock){
        Random r=new Random();
        int tempR=0;
        do{
            tempR=r.nextInt(20);
            for(int i=0; i<deck.length; i++){
                int tempA=r.nextInt(84);
                int tempB=r.nextInt(84);
                int tempS=deck[tempA];
                deck[tempA]=deck[tempB];
                deck[tempB]=tempS;
            }
        }while(tempR!=5);
    }
    public static void main(String[] args) {
        String carte[]={"Dandân","Chart a Course","Diminishing Returns","Gone Missing","Mystic Retrieval","Take Inventory","Brainstorm","Magical Hack","Memory Lapse","Metamorphose","Mind Bend","Mystical Tutor","Narset's Reversal","Piracy Charm","Predict","Repulse","Supplant Form","Unsubstantiate","Flood Plain","Halimar Depths","Island","Izzet Boilerworks","Lonely Sandbar","Mystic Sanctuary","Remote Isle","Temple of Epiphany"};
        int carteStock[]={10,2,2,2,2,4,2,2,8,2,2,2,2,2,2,2,2,2,2,2,18,2,2,2,2,2};
        int[] deck=new int[84];
        int c=0;
        for(int i=0; i<deck.length; i++){
            deck[i]=-1;
        }
        for(int i=0; i<carte.length; i++){
            c=c+carteStock[i];
            System.out.println(carteStock[i]+" "+carte[i]);
        }
        System.out.println("Soit un deck de "+c+" cartes.\n");
        initDeck(deck, carteStock);
        melangeDeck(deck, carteStock);
        for(int i=0; i<deck.length; i++){
            int carteEmp=deck[i];
            System.out.println(carte[carteEmp]);
        }
    }
}