import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Formato: jdbc:firebirdsql://<host>:<porta>/<caminho_ou_alias>
        String url = "jdbc:firebirdsql:/localhost:3090/C:/Realtec/Agro/AGRO_4.2.1.000/Dados/AGRO.FDB?charSet=utf-8";
        String usuario = "SYSDBA";
        String senha = "masterkey";

        try (Connection conn = DriverManager.getConnection(url, usuario, senha)) {
            if (conn != null) {
                System.out.println("Conectado ao Firebird com sucesso!");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
        }
    }
}