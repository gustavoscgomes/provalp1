import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Aluno a = new Aluno();
        Professor p = new Professor();

        a.setNome("Joao");
        a.setSenha(123);
        p.setEspecializacao("programacao");
        p.setNome("José");

        System.out.print("Digite 1 para exibir informacoes do professor e 2 para aluno: ");
        int x = input.nextInt();

        switch (x) {
            case 1:
                System.out.printf("professor nome: %s%nprofessor especializacao: %s", p.getNome(), p.getEspecializacao());
                break;
            case 2:
                System.out.printf("aluno nome: %s%naluno senha: %d%n", a.getNome(), a.getSenha());
                break;


        }

    }
}
