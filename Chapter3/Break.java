package Chapter3;

public class Break {
    public static void main(String[] args) {
        System.out.println("\nCac so chan tu 0 den 20 (toi da 10):");
        for (int j = 0; j <= 20; j += 2) {
            if (j > 10) {
                break;
            }
            System.out.println(j);
        }
    }
}

