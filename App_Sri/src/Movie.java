import java.awt.Image;
import java.io.IOException;
import java.net.*;
import javax.imageio.ImageIO;
public class Movie {

	protected int id = 0;
	protected String title = "";
	protected String poster = "";
	protected int year = 1995;
	protected int Imdb =0 ;
	protected String genres = "";	
	protected String synopsis = "";	
	protected double rating = 0;	
	
	
	
	public Movie(int ID , int IMDB , String TITLE , String Gen, String SYNOPSIS , double Rat , int YEAR) {
		this.id =ID;
		this.Imdb=IMDB;
		this.title = TITLE;
		this.genres=Gen;
		this.synopsis=SYNOPSIS;
		this.rating= Rat;
		this.year=YEAR;
		
	}
	//La méthode toString définie dans la classe Object ne fait pas grand-chose : elle renvoie le nom de la classe de l'objet concerné suivi de l'adresse de cet objet.
	public String toString() {
		
		return "Movie{"+ "title=" + title + ", year=" +year + '}';
	}
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public Image getPoster() {
		Image image = null;
		try {
		URL url = new URL(this.poster);
		image = ImageIO.read(url);
		} catch (IOException e) {
		return image;
		}
		return image;
		}

public void setTitle(String title) {
	this.title = title;
}
public void setId(int id) {
	this.id = id;
}


public String getGenres() {
	return genres;
}
public int getImdb() {
	return Imdb;
}
public double getRating() {
	return rating;
}

public String getSynopsis() {
	return synopsis;
}
public void setGenres(String genres) {
	this.genres = genres;
}
public void setImdb(int imdb) {
	Imdb = imdb;
}

public void setRating(double rating) {
	this.rating = rating;
}

public void setSynopsis(String synopsis) {
	this.synopsis = synopsis;
}




}
