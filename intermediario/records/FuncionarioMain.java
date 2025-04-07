package intermediario.records;

public class FuncionarioMain {
    public static void main(String[] args) {
        FuncionarioClass funcionarioClass = new FuncionarioClass("Pedro", "123.456.789-00", "123456789");
        System.out.println(funcionarioClass);

        System.out.println("==========================================================================================");

        FuncionarioRecord funcionarioRecord = new FuncionarioRecord("Henrique", "987.654.321-00", "987654321");
        System.out.println(funcionarioRecord);
    }
}
