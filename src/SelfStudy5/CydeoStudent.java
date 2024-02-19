package SelfStudy5;

public class CydeoStudent {

public String name;
public int age;
public char gender;

public String id;

public char grade;

public int batchNumber;

public int groupNumber;

public static String schoolName = "Cydeo School";

public static String magicWord = "Magic Student";

    public CydeoStudent(String name, int age, char gender, String id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + " is studying Java");
    }

    public void attendClass(){
        System.out.println(name + " " + batchNumber + " please attend the class");
    }

    public static String printSchoolName(){
        return schoolName;
    }

    public void printProgLanguage(){
        System.out.println("Java");
    }

    @Override
    public String toString() {
        return "Constructor1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}


/*
CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of the programming language
					toString()

 */