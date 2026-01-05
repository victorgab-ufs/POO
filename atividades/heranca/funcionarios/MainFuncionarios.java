public class MainFuncionarios {
    public static void main(String[] args){

        Terceirizado ter = new Terceirizado("Joao", 7, 9, 1984, 147147147);
        ter.setDependencia("CCET");
        System.out.println("Dependencia terceirizado: "+ter.getDependencia());

        DocenteDedExc dde = new DocenteDedExc("Carlos", 12, 11, 1997, 123123123);
        dde.setSalarioFixo(5000);
        dde.addDisciplina("PI");
        dde.addDisciplina("PF");
        System.out.println("Disciplinas DDE:");
        dde.listarDisciplinas();
        dde.removerDisciplina("PI");
        System.out.println("Disciplinas apos remocao:");
        dde.listarDisciplinas();

        DocenteTempoParc dtp = new DocenteTempoParc("Luzia", 15, 5, 1970, 486486684);
        dtp.setHoras(80);
        dtp.setSalarioHora(50);

        DocenteSubs20h ds20 = new DocenteSubs20h("Hugo", 19, 5, 1984, 753357753);
        ds20.setSalarioHora(100);

        DocenteSubs40h ds40 = new DocenteSubs40h("Marta", 28, 3, 1975, 478478874);
        ds40.setSalarioHora(150);

        Administrativo adm = new Administrativo("Maria", 1, 1, 1980, 321321321);
        adm.setBeneficios(1200);
        adm.setSalarioBase(2000);
        
        FuncionarioUFS[] funcionarios = {dde, adm, dtp, ds20, ds40};

        for (FuncionarioUFS fUFS : funcionarios){
            System.out.printf("%s de %d anos recebe R$ %.2f\n", fUFS.getNome(), fUFS.calcularIdade(), fUFS.calcularPagamento());
        }
    }
}
