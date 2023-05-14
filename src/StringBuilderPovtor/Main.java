package StringBuilderPovtor;

public class Main {
    public static void main(String[] args) {
        StringBuilder str = createSomeString(3, 56);
        System.out.println(str);
        modify(str, "=", "равно");
        System.out.println(str);


    }

    public static StringBuilder createSomeString(int a, int b) {
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        result.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        result.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return result;
    }

    public static StringBuilder modify(StringBuilder str, String Old, String New) {
        int pos;
       while ((pos = str.indexOf(Old)) != -1) {
            /* str.deleteCharAt(pos);
            str.insert(pos, "равно");*/
        str.replace(pos, pos+1, New);
    }
        return str;
    }
}
