import java.sql.SQLException;


public class Teste {
	public static void main(String[] args) throws SQLException {
		Contato contato = new Contato();
		contato.setNome("outronome");
		contato.setId(0);

		ContatoDAO dao = new ContatoDAO();
		try {
			dao.altera(contato);
			System.out.println("Contato alterado com sucesso");
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		
		contato.setId(1);
		try {
			dao.remove(contato);
			System.out.println("removido com sucesso");
		} catch (Exception e) {
			System.out.println("Erro: "+e);
		}
	}
}
