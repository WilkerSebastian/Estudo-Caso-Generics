public class DataTeacher implements DataAcess {
 
    private Teacher[] teachers = new Teacher[10];
    private int index = 0;

    @Override
    public void save(Object obj) {

        if (obj != null) {
            
            Teacher teacher = (Teacher)obj;

            try {
            
                teachers[index] = teacher;
                index++;

            } catch (Exception e) {
                
                Teacher[] copia = teachers;

                teachers = new Teacher[copia.length + 10];

                for (int i = 0; i < copia.length; i++) {
                   
                    teachers[i] = copia[i];

                }

                teachers[index] = teacher;
                index++;

            }

        }

    }

    @Override
    public void update(Object obj, int id) {

        for (int i = 0; i < teachers.length; i++) {
            
            if (teachers[i].getId() == id) {
                
                teachers[i] = (Teacher)obj;
                return;

            }

        }

    }

    @Override
    public Object getById(int id) {

        for (Teacher teacher : teachers) {

            try {
             
                if (teacher.getId() == id) {
                
                    return teacher;

                }

            } catch (Exception e) {}

        }

        return null;

    }

    @Override
    public void delete(int id) {
        
        for (int i = 0; i < teachers.length; i++) {
         
            try {

                if (teachers[i].getId() == id) {
                
                    teachers[i] = null;
                    return;

                }
                
            } catch (Exception e) { }       

        }

    }

}
