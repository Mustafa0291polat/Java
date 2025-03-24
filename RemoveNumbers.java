public class RemoveNumbers {
    public static void main(String[] args) {
        String[][] words = {
            {"hello", "world", "123", "java"},
            {"apple", "banana", "4567", "test123"},
            {"java123", "code", "100", "Duhan Kose"}
        };

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                String textOnly = "";
                for (int k = 0; k < words[i][j].length(); k++) {
                    if (words[i][j].charAt(k) < '0' || words[i][j].charAt(k) > '9') {
                        textOnly += words[i][j].charAt(k);
                    }     
                }
                System.out.println(textOnly);
            }
        }
    }
}
