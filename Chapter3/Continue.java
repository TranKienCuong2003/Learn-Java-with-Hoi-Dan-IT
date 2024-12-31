package Chapter3;

public class Continue {
    public static void main(String[] args) {
        System.out.println("\nCac so chan tu 0 den 20 (bo qua so 10):");
        for (int j = 0; j <= 20; j += 2) {
            if (j == 10) {
                continue;
            }
            System.out.println(j);
        }
    }
}

