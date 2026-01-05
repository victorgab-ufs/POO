public class MainFuncionario{

    public static void main(String[] args) {
        
        Funcionario funcionario1 = new AssistenteAdministrativo("victor", "22222222");

        String nome1 = funcionario1.getNome();
        System.out.println(nome1);

        String matricula1 = funcionario1.getMatricula();
        System.out.println(matricula1);

        funcionario1.setSalario(650);
        funcionario1.setFuncao("assessor");

        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario1.getFuncao());

    }
}
