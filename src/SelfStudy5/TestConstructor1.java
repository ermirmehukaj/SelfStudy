package SelfStudy5;

public class TestConstructor1 {
    public static void main(String[] args) {


        CydeoStudent constructor1 = new CydeoStudent("Ermir",31,'M',"A22",'A',2,11);

        System.out.println(constructor1);
constructor1.attendClass();
constructor1.study();
constructor1.printProgLanguage();
        System.out.println(CydeoStudent.magicWord);
        System.out.println(CydeoStudent.schoolName);

    }
}
