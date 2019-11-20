package online.shixun.project.pojo;

import java.util.List;

public class Theme {

	private int id;
	private String theme_name;
	private List<Title> title;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTheme_name() {
		return theme_name;
	}
	public void setTheme_name(String theme_name) {
		this.theme_name = theme_name;
	}
	public List<Title> getTitle() {
		return title;
	}
	public void setTitle(List<Title> title) {
		this.title = title;
	}
	
}
