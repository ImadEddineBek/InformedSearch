package BlackNightAStar;

import GeneralProblemAStar.Node;
import search.AStarSearch;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        treeSearch();
    }

    private static void treeSearch() {
        System.out.println("A* Search the original");
        AStarSearch<Action, BlackProblem> treeSearch = new AStarSearch<>();
        boolean[] liste = new boolean[5];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new BlackProblem(new BlackNode(new BlackState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("A* Search the original\n");
    }
}
