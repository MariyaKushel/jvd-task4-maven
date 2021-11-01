package by.javacourse.task4.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextComposite implements TextComponent {

	static Logger logger = LogManager.getLogger();

	private TextComponentType type;
	private List<TextComponent> components = new ArrayList<TextComponent>();

	public TextComposite(TextComponentType type) {
		this.type = type;
	}

	public String createViewForm() {

		StringBuilder viewForm = new StringBuilder();

		viewForm.append(type.getPrefix());
		
		components.forEach(c -> viewForm.append(c.createViewForm()));
		
		viewForm.append(type.getPostfix());

		return viewForm.toString();
	}

	public boolean add(TextComponent component) {
		return components.add(component);
	}

	public boolean remove(TextComponent component) {
		return components.remove(component);
	}

	public TextComponentType getType() {
		return type;
	}

	@Override
	public String toString() {
		return components.toString();
	}
}
