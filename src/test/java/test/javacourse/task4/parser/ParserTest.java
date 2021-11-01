package test.javacourse.task4.parser;

import org.testng.annotations.Test;

import by.javacourse.task4.entity.TextComponent;
import by.javacourse.task4.entity.TextComponentType;
import by.javacourse.task4.entity.TextComposite;
import by.javacourse.task4.parser.AbstractTextParser;
import by.javacourse.task4.parser.TextParser;

public class ParserTest {
	
	@Test
	public void testMetod () {
		
		String text ="\u0009It has survived - not only (five) centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the “Динамо” (Рига) with the release of Letraset sheets.toString() containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker Faclon9 including versions of Lorem Ipsum!\n"
				+ "    It is a long a!=b established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Ipsum is that it has a more-or-less normal distribution ob.toString(a?b:c), as opposed to using (Content here), content here's, making it look like readable English?\n"
				+ "\u0009It is a established fact that a reader will be of a page when looking at its layout...\n"
				+ "\u0009Bye бандерлоги."; 
		
		TextComponent component = new TextComposite(TextComponentType.TEXT);
		
		AbstractTextParser parser = new TextParser ();
		parser.parse(component, text);
		
		System.out.println(component.createViewForm());
		
	}

}
