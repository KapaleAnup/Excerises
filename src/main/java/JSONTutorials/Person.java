package JSONTutorials;

import java.util.List;
import java.util.Map;

public class Person {

    private String name;
    private Integer age;
    List<String> hobbies;
    List<String> mobile;
    Map<String, String> langauges;


    public List<String> getMobile() {
        return mobile;
    }

    public void setMobile(List<String> mobile) {
        this.mobile = mobile;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getLangauges() {
        return langauges;
    }

    public void setLangauges(Map<String, String> langauges) {
        this.langauges = langauges;
    }



}
