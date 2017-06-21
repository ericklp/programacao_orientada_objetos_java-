import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContatoDAO {
	private Connection conn;

	public ContatoDAO() throws SQLException
	{
		this.conn = (Connection) new ConnectionFactory().getConnection();
	}

	private void seleciona() throws SQLException {
		String sql = "SELECT * from CONTATO;";
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet res = stmt.executeQuery();

			ArrayList <Contato> contatolist = new ArrayList <Contato>();

			while (res.next())
			{
				Contato contato = new Contato();
				contato.setNome(res.getString(2));
				contatolist.add(contato);
			}
			
			System.out.println("Executed: "+ contatolist.toString());
		}
		catch (SQLException e)
		{
			System.out.println("erro: "+e);
		}
		
		
	}
	
	public void remove(Contato contato) throws SQLException {
		String sql = "DELETE from CONTATO WHERE idCONTATO=(?);";
		
		try
		{
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1,contato.getId());
			stmt.executeUpdate();
			System.out.println("deleted "+stmt.getUpdateCount()+" rows");
		}
		catch (SQLException e)
		{
			System.out.println("error(remove): "+e);
		}
	}
	
	public void altera(Contato contato) throws SQLException {
		String sql = "UPDATE CONTATO SET nome=(?) WHERE idCONTATO=(?);";
		try
		{
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setInt(2, contato.getId());
			stmt.executeUpdate();
			System.out.println("altered "+stmt.getUpdateCount()+" rows");
		}
		catch (SQLException e)
		{
			System.out.println("error(remove): "+e);
		}		
	}
}
