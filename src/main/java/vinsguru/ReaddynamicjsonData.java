package vinsguru;

import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;
import org.testng.annotations.Test;

public class ReaddynamicjsonData {


    @Test
        public void temaplate(){
        JtwigTemplate template = JtwigTemplate.classpathTemplate("src/main/java/vinsguru/contact.json");

        JtwigModel model = JtwigModel.newModel()
                .with("name","nameguru")
                .with("email", "nameguru@gmail.com");

        template.render(model);
        }
}
