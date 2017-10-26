package BlackNight;


import GeneralProblem.Node;

public class BlackNode extends Node<Action> {
    public BlackNode(BlackState currentState, Node<Action> parentNode, Action action) {
        super(currentState, parentNode, action);
    }

    @Override
    public BlackState getCurrentState() {
        return (BlackState) super.getCurrentState();
    }

    @Override
    public double farFromGoal() {
        BlackState currentState = (BlackState) this.currentState;
        boolean[] liste = currentState.getListe();
        double val = 0;
        int left = 0;
        int right = 0;
        boolean boat =liste[liste.length-1];
        for (boolean b : liste) {
            if (b)right++;
            else left++;
        }
        if (goalTest())return 0;
        if (boat){
            val += maxLeft(liste);
        }else val += maxLeft(liste)+minRight(liste);

        return val;
    }

    private double minRight(boolean[] liste) {
        int min = 0;
        if (!liste[3])min = 10;
        if (!liste[2])min = 5;
        if (!liste[1])min = 2;
        if (!liste[0])min = 1;
        return min;
    }

    private double maxLeft(boolean[] liste) {
        int max = 0;
        if (liste[0])max = 1;
        if (liste[1])max = 2;
        if (liste[2])max = 5;
        if (liste[3])max = 10;
        return max;
    }

    public boolean goalTest() {
        BlackState currentState = getCurrentState();
        boolean[] liste = currentState.getListe();
        for (boolean b : liste) {
            if (b) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" +currentState + " cost "+cost;
    }
}
