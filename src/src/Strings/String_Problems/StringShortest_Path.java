package Strings.String_Problems;

public class StringShortest_Path {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }
    public static float shortestPath(String path) {
        int x = 0,y = 0;

        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if (ch == 'E') {
                x++;
            }
            else if (ch == 'W') {
                x--;
            }
            else if (ch == 'N') {
                y++;
            }
            else if (ch == 'S') {
                y--;
            }
        }
        int X = x*x;
        int Y = y*y;
        return (float) Math.sqrt(X+Y);
    }
}
