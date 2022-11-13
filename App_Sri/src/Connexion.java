import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSet;

public class Connexion {
// changer les informations de la base de donnes
	public String host = "localhost"; //localhost
	public int port = 3306;
	public String db = "myapp";
	public String user = "root";
	public String pass = "";
	private Boolean connected = false; 
	private Connection connexion;
	private Statement sql;
	private List<Integer> MoviesId = new ArrayList<Integer>();
	private int currentId = 0;
	
	public Connexion() {
		try{ 
		Class.forName("com.mysql.jdbc.Driver"); 
		String lien = "jdbc:mysql://" + host + ":" + port + "/" + db;
		System.out.println(lien);
		this.connexion=DriverManager.getConnection(lien,this.user,this.pass); 
		this.connected = true;
		// interroger la base et récupérer tous les films
		sql = this.connexion.createStatement();
		ResultSet rs=(ResultSet) sql.executeQuery("select * from movie");
		MoviesId.clear();
		// currentId pointe sur le premier film
		currentId = 0;
		while(rs.next()) { 
		// l’identifiant est le 1er champ, et il est de type int
		MoviesId.add(rs.getInt(1));
		} 
		 
		//con.close(); //cette comande permet de fermer la connexion avec la base
		System.out.println("connected ...");
		this.connected = true;
		}catch(Exception e){ 
		System.out.println(e); 
		} 
		}
	public Movie getMovie() {
		Movie movie = new Movie(currentId, currentId, db, db, db, currentId, currentId);
		try {
		sql = this.connexion.createStatement();
		ResultSet rs=(ResultSet) sql.executeQuery("select * from movie WHERE mov_id = " +
		this.MoviesId.get(this.currentId));
		while(rs.next()) { 
			
			movie = new Movie(currentId, currentId, db, db, db, currentId, currentId);
			movie.setImdb(rs.getInt(2));
			movie.setTitle(rs.getString(3));
			movie.setId(rs.getInt(1));
			movie.setRating(rs.getDouble(9));
			movie.setGenres(rs.getString(5));
			movie.setYear(rs.getInt(10));
			movie.setSynopsis(rs.getString(8));
		// On sait que le 1er argument est l’id et que le 3ème est le titre
		
		// On sait que le 4ème argument est le poster
		movie.setPoster(rs.getString(4));
		// On peut aussi appeler l’argument par son nom
		movie.setYear(rs.getInt("year"));
	
		}
		} catch (SQLException e) {
		e.printStackTrace();
		} 
		return movie;
		}
	
	public void desconnecte() {
		try {
		this.connexion.close();
		connected = false;
		} catch (SQLException e) {
		e.printStackTrace();
		}
		
		}
	public Movie nextMovie() {
		this.currentId = (this.currentId + 1) % this.MoviesId.size();
		return this.getMovie();
		}

	
	
	
}
