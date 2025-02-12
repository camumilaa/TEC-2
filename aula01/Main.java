import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1. Inserir novo aluno");
        System.out.println("2. Listar todos os alunos");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha em branco após o número da opção

        try (var con = DB.connect()) {
            System.out.println("Conectado com sucesso");

            if (opcao == 1) {
                // Inserir novo aluno
                System.out.print("Digite o CPF do aluno: ");
                String cpf = scanner.nextLine();
                System.out.print("Digite o nome do aluno: ");
                String nome = scanner.nextLine();

                String query = "INSERT INTO aluno(cpf, nome) VALUES(?, ?)";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setString(1, cpf);
                stmt.setString(2, nome);
                stmt.executeUpdate();
                System.out.println("Aluno inserido com sucesso!");

            } else if (opcao == 2) {
                // Listar todos os alunos
                List<Aluno> alunos = new ArrayList<>();
                String query = "SELECT * FROM aluno";
                PreparedStatement stmt = con.prepareStatement(query);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Aluno aluno = new Aluno(rs.getString("cpf"), rs.getString("nome"));
                    alunos.add(aluno);
                }
                alunos.forEach(System.out::println);
            } else {
                System.out.println("Opção inválida!");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
