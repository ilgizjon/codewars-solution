package CodeWars;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] ints) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for(int i = 0; i<3; i++){
            sb.append(ints[i]);
        }
        sb.append(") ");
        for(int i = 3; i<6; i++){
            sb.append(ints[i]);
        }
        sb.append("-");
        for(int i =6; i<10; i++){
            sb.append(ints[i]);
        }

        return sb.toString();
    }
}
