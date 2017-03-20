package fr.reactis;

/**
 * ceci est un commentaire pour la class
 *
 */
public class ClassTest {

	private String name;
	private String prenom;
	private Long age;

	public ClassTest() {
	}

	/**
	 * 
	 * @param name
	 * @param prenom
	 * @param age
	 */
	public ClassTest(String name, String prenom, Long age) {
		super();
		this.name = name;
		this.prenom = prenom;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

}
