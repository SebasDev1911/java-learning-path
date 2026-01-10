package operators;

public class ArithmeticAssignmentOpertator {
    public static void main(String[] args) {
        int i = 5; // = Assigment value to variable

        i += 9; // Combined operator i = i + 9
        System.out.println("i = " + i);

        i += 5; // i = i + 5
        System.out.println("i = " + i);

        int j = 7;
        j -= 2; // j = j - 2
        System.out.println("j = " + j);

        j *= 5; // j = j * 5
        System.out.println("j = " + j);

        // SQL query as an example of an assigment operator
        String sqlQuery = "select * from clients as cl";
        sqlQuery += " where cl.name='Sebastian'";
        sqlQuery += " and cl.status='1'";

        System.out.println("sqlQuery = " + sqlQuery);
    }
}
