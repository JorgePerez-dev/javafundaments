package datastructure;

import java.util.List;

public class RecursiveAlgorithms {
	
	public static void draw(int n) {
        if (n <= 0) {
            return;
        }
        draw(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

	public static void pattern(int n) {
        if (n <= 0) {
            System.out.print("|");
            return;
        }
        System.out.print(n);
        pattern(n - 1);
        System.out.print(n);
    }
	
	//  MODIFICADO (sin recursión)
	public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
    }
	
	/**
	 * 
	 * @param rows the number of rows that we want to print
	 * @param colss
	 */
    // 🔁 MODIFICADO (sin recursión)
    public static void drawGrid(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            printStars(cols);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawGrid(3, 5);
    }
	
	public static int paths(int row, int col) {
        if (row == 0 || col == 0) {
            return 1;
        }
        return paths(row - 1, col) + paths(row, col - 1);
    }
	
	public static int transform(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + transform(n / 10);
    }
	
	public static int process(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        
        int head = list.get(0);
        List<Integer> rest = list.subList(1, list.size());
        
        if (head % 2 != 0) {
            return head + process(rest);
        } else {
            return process(rest);
        }
    }
	
	public static <T> int analyze(Node<T> node) {
        if (node == null) {
            return 0;
        }
        
        int a = analyze(node.left);
        int b = analyze(node.right);
        
        return 1 + Math.max(a, b);
    }
	
	public static String execute(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return execute(s.substring(1)) + s.charAt(0);
    }
	
	private class Node<T> {
		public Node<T> left;
		public Node<T> right;
	}
}