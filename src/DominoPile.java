import java.util.ArrayList;
import java.lang.Math.*;
import java.util.Random;

public class DominoPile {
    private ArrayList<Domino> pile = new ArrayList<>();
    public ArrayList<Domino> getPile(){
        return pile;
    }

    public void newStack6() {

        for (int i = 0; i <= 6; i++) {
            for (int l = i; l <= 6; l++) {
                Domino dom = new Domino(i, l);
                pile.add(dom);
            }
        }
    }

    public void shuffleOptionOne(){
        Random rand = new Random();
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Domino> temp = new ArrayList<>();
        int ind = -1;
        for (int i = 0; i < pile.size(); i++){
            while (ind == -1 || (index.contains(ind))) {
                ind = rand.nextInt(pile.size());
            }
            temp.add(pile.get(ind));
            index.add(ind);
        }

        pile.clear();
        for (Domino t: temp){
            pile.add(t);
        }

    }

    public void shuffleOptionTwo() {
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            int index = rand.nextInt(pile.size());
            int index2 = index;
            while (index2 == index) {
                index2 = rand.nextInt(pile.size());
            }
        }

    }
    }