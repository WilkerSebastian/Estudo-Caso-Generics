public class DataStudent implements DataAcess{
 
    private Student[] students = new Student[10];
    private int index = 0;

    @Override
    public void save(Object obj) {

        if (obj != null) {
            
            Student student = (Student)obj;

            try {
            
                students[index] = student;
                index++;

            } catch (Exception e) {
                
                Student[] copia = students;

                students = new Student[copia.length + 10];

                for (int i = 0; i < copia.length; i++) {
                   
                    students[i] = copia[i];

                }

                students[index] = student;
                index++;

            }

        }

    }

    @Override
    public void update(Object obj, int id) {

        for (int i = 0; i < students.length; i++) {
            
            if (students[i].getId() == id) {
                
                students[i] = (Student)obj;
                return;

            }

        }

    }

    @Override
    public Object getById(int id) {

        for (Student student : students) {

            try {
             
                if (student.getId() == id) {
                
                    return student;

                }

            } catch (Exception e) {}

        }

        return null;

    }

    @Override
    public void delete(int id) {
        
        for (int i = 0; i < students.length; i++) {
         
            try {

                if (students[i].getId() == id) {
                
                    students[i] = null;
                    return;

                }
                
            } catch (Exception e) { }       

        }

    }

}