public class ModifiedString {

    public static String getModifiedStringChar(String inputString) {
        final int len = inputString.length();
        char[] newChar = new char[len];
        int j = 0;

        for (int i = 0; i < len; i++) {
            char ch = inputString.charAt(i);
            if (ch == '\"'){
                newChar[j] = '\'';
                j++;
            } else
            if (ch == '[' && (i + 1) < len && inputString.charAt(i+1) == ']') {
                newChar[j] = '{';
                j++;
                newChar[j] = '}';
                j++;
                i++;
            } else if (ch != '\n'){
                newChar[j] = ch;
                j++;
            }
        }
        return new String(newChar, 0, j);
    }
}
