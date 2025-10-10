package org.example.sandbox.comparable;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
    public int compareTo(Person that){
        //handle null cases
        if (that == null){
            return 1;
        }

        //Compare by age
        int ageCmp =Integer.compare(this.age, that.age);
        if (ageCmp != 0){
            return ageCmp;
        }
        //compare by name handling nulls
        if(this.name == null && that.name == null){
            return 0;
        }

        //Consider null less than non-nulls
        if(this.name == null){
            return -1;
        }
        //now both non-nolls, safe to compare
        if(that.name == null){
            return 1;
        }
        return this.name.compareTo(that.name);
    }
}
