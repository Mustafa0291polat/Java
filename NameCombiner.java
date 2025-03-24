public class NameCombiner {
    public static void main(String[] args) {      
        String[][] names = {
            {"cihat", "ali", "duhan"},
            {"kemal", "samet", "cc"}
        };

        String[] combinedNames = new String[names[0].length];

        for (int j = 0; j < combinedNames.length; j++) {
            combinedNames[j] = "";  // NullPointerException'ı önlemek için boş string atandı.
        }

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[0].length; j++) {
                combinedNames[j] += names[i][j];
            }
        }

        for (String name : combinedNames) {
            System.out.println(name);
        }
    }
}
