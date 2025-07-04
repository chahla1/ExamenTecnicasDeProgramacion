//se pide ampliar una clase Grafo tipica y se quiere complementar con un metodo q devuelva un ciclo como secuencia de nodos

import java.util.*;

public class Grafo {
    private Map<Integer, List<Integer>> adjList;

    public Grafo() {
        adjList = new HashMap<>();
    }

    public void addEdge(int source, int destination) {
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }

    public List<Integer> findCycle() {
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> parent = new HashMap<>();
        List<Integer> cycle = new ArrayList<>();

        for (Integer node : adjList.keySet()) {
            if (!visited.contains(node)) {
                if (dfs(node, visited, parent, cycle)) {
                    return cycle;
                }
            }
        }
        return null; // no se encuentra el ciclo
    }

    private boolean dfs(int current, Set<Integer> visited, Map<Integer, Integer> parent, List<Integer> cycle) {
        visited.add(current);

        for (Integer neighbor : adjList.getOrDefault(current, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                parent.put(neighbor, current);
                if (dfs(neighbor, visited, parent, cycle)) {
                    return true;
                }
            } else if (!neighbor.equals(parent.get(current))) {
                // Cycle detected
                cycle.add(neighbor);
                int temp = current;
                while (temp != neighbor) {
                    cycle.add(temp);
                    temp = parent.get(temp);
                }
                cycle.add(neighbor);
                Collections.reverse(cycle);
                return true;
            }
        }
        return false;
    }
}