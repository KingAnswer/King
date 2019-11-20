package online.shixun.project.pojo;

public class Title {

	private int id;
	private String title_name;
	private int theme_id;
	private Theme theme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle_name() {
		return title_name;
	}
	public void setTitle_name(String title_name) {
		this.title_name = title_name;
	}
	public int getTheme_id() {
		return theme_id;
	}
	public void setTheme_id(int theme_id) {
		this.theme_id = theme_id;
	}
	public Theme getTheme() {
		return theme;
	}
	public void setTheme(Theme theme) {
		this.theme = theme;
	}
	
}
