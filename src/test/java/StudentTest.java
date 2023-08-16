import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {

    private Student emptyStudent;
    private Student actualStudent;
    private double deltaValue = 0.000001;
    private ArrayList<Integer> emptyArrayList;

    @Before
    public void setup() {
        actualStudent = new Student("sam", 1L);
        emptyArrayList = new ArrayList<>();
    }

    @Test
    public void testStudentConstructor() {
        actualStudent = new Student();
        assertNull(emptyStudent);
        assertNotNull(actualStudent);
    }

    @Test
    public void testTwoArgConstructor() {
        assertNotNull(actualStudent);
    }

    @Test
    public void testStudentGetters() {
        assertEquals(actualStudent.getName(), "sam");
        assertEquals(actualStudent.getId(), 1L);
        assertNotNull(actualStudent.getGrades());
        assertEquals(actualStudent.getGrades(), emptyArrayList);
    }

    @Test

    public void testStudentSetter() {
        actualStudent.setName("sam");
        assertEquals(actualStudent.getName(), "sam");
        actualStudent.setId(1);
        assertEquals(actualStudent.getId(), 1L);
    }

    @Test
    public void testStudentAddGrade() {
        actualStudent.addGrades(50);
        actualStudent.addGrades(75);
        actualStudent.addGrades(100);

        ArrayList<Integer> expectedGrades = new ArrayList<>(Arrays.asList(50,75,100));

        assertEquals(actualStudent.getGrades(), expectedGrades);
    }

    @Test
    public void testStudentGetGradeAverage(){
        actualStudent.addGrades(50);
        actualStudent.addGrades(75);
        actualStudent.addGrades(100);

        assertEquals(actualStudent.getGradesAverage(), 75, deltaValue);
    }

}
