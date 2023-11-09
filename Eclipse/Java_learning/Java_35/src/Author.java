
public class Author {
	private String authorName;
	private Date dateBorn;
	
	
	public Author(String authorName, Date dateBorn) {
		this.authorName = authorName;
		this.dateBorn = dateBorn;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public Date getDateBorn() {
		return dateBorn;
	}


	public void setDateBorn(Date dateBorn) {
		this.dateBorn = dateBorn;
	}
	
	
	

}
