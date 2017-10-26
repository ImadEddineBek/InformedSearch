package BlackNight;

import GeneralProblem.Node;
import search.GreedySearch;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        treeSearch();
    }

    private static void treeSearch() {
        System.out.println("GreedySearch the original");
        GreedySearch<Action, BlackProblem> treeSearch = new GreedySearch<>();
        boolean[] liste = new boolean[5];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new BlackProblem(new BlackNode(new BlackState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("GreedySearch the original\n");
    }
}
