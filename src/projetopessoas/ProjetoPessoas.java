package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p2.setCurso("Infomática");
        p3.setNome("João");
        p4.setNome("Gláucio");
        p4.setIdade(26);
        p4.setSexo("Masculino");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
        
    }
    
}
