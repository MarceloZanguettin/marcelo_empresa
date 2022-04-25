public class Principal {

    public static void main(String[] args){

        Vendedor v = new Vendedor();
        v.setNome("Roberta");
        v.setDataDeEntrada("10/01/2010");
		v.setDepartamento("Vendas");
		v.setEstaNaEmpresa(true);
		v.setRg("45");
        v.setSalario(3200);

        Gerente g = new Gerente();
        g.setNome("Giovana");
        g.setLogin("giovana123");
        g.setSenha("giovana123");
        v.setDataDeEntrada("23/11/2007");
		v.setDepartamento("Produção");
		v.setEstaNaEmpresa(true);
		v.setRg("83");
        v.setSalario(6700);

        Supervisor s = new Supervisor();
        s.setNome("Douglas");
        s.setLogin("douglas123");
        s.setSenha("douglas123");
        v.setDataDeEntrada("04/07/2003");
		v.setDepartamento("Vendas");
		v.setEstaNaEmpresa(true);
		v.setRg("54");
        v.setSalario(7400);

        Funcionario f = new Funcionario();
        f.setNome("Juliano");
        v.setDataDeEntrada("19/04/2012");
		v.setDepartamento("Produção");
		v.setEstaNaEmpresa(true);
		v.setRg("32");
        v.setSalario(2100);

    }
    
}
