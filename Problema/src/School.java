public class School {
    
    public static void main(String[] args) {
        
        DataStudent dataStudent = new DataStudent();
        DataTeacher dataTeacher = new DataTeacher();

        dataStudent.save(new Student(15, "luciano", "informatica", 20));
        dataStudent.save(new Student(18, "lucas", "informatica", 32));
        dataStudent.save(new Student(22, "luquinhas", "informatica", 25));

        dataTeacher.save(new Teacher(34, "amaruy", "engenharia elétrica", 40));
        dataTeacher.save(new Teacher(37, "lucas", "ciência da computação", 20));
        dataTeacher.save(new Teacher(56, "everton", "física", 45));

        System.out.println(dataTeacher.getById(34));

        Teacher amaury = (Teacher)dataTeacher.getById(34);
        amaury.setFormacao("ciência da computação");

        dataTeacher.update(amaury, 34);

        System.out.println(dataTeacher.getById(34));

        dataTeacher.delete(34);

        System.out.println(dataTeacher.getById(34));

    }

}
