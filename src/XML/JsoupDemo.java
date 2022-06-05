package XML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupDemo {

    public static void main(String[] args) throws IOException {
        final ClassLoader classLoader = JsoupDemo.class.getClassLoader();
        final URL resource = classLoader.getResource("XML/students.xml");
        final String path = resource.getPath();
        final File file = new File(path);
        final Document document = Jsoup.parse(file, "UTF-8");
        System.out.println("document: " + document);

        /*
        * getElementsByTag
        * getElementsByAttribute
        * getElementsByClass
        * getElementsByAttributeStarting
        * getElementsByAttributeValue
        * */

        final Elements nameElements = document.getElementsByTag("name");
        System.out.println("size: " + nameElements.size());

        for (Element nameElement : nameElements) {
            String name = nameElement.text();
            System.out.println(name);
        }

        System.out.println("----------");
        final Elements numberElements = document.getElementsByAttribute("number");
        for (Element numberElement : numberElements) {
            final Elements ageElements = numberElement.getElementsByTag("age");
            for (Element ageElement : ageElements) {
                System.out.println(ageElement.text());
            }
        }


    }
}
