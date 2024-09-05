import com.todo.utils.Mapper;
import com.todo.utils.TaskPriority;
import com.todo.utils.TaskStatus;
import org.junit.Test;

import static org.junit.Assert.*;

public class MapperTest {

    protected void testCaseTaskPriority(String userInput, TaskPriority expectedResult){
        try{
            assertEquals(
                    Mapper.priorityMap(userInput),
                    expectedResult
            );
        }catch (Exception e){
            assertTrue(true);
        }
    }

    protected void testCaseTaskStatus(String userInput, TaskStatus expectedResult){
        try{
            assertEquals(
                    Mapper.statusMap(userInput),
                    expectedResult
            );
        }catch (Exception e){
            assertTrue(true);
        }
    }

    @Test
    public void testTaskPriority(){

        testCaseTaskPriority("RED", TaskPriority.RED);
        testCaseTaskPriority("YELLOW", TaskPriority.YELLOW);
        testCaseTaskPriority("GREEN", TaskPriority.GREEN);

        testCaseTaskPriority("red", TaskPriority.RED);
        testCaseTaskPriority("yellow", TaskPriority.YELLOW);
        testCaseTaskPriority("green", TaskPriority.GREEN);

        // TEST EXCEPTIONS
        String userInput = "OTHERINPUT";
        try{
            Mapper.priorityMap(userInput);
            assertFalse(true);
        }catch (Exception e){
            assertTrue(true);
        }

        userInput = ""; // test with empty strings
        try{
            Mapper.priorityMap(userInput);
            assertFalse(true);
        }catch (Exception e){
            assertTrue(true);
        }


    }




    @Test
    public void testTaskStatus(){

        testCaseTaskStatus("TODO", TaskStatus.TO_DO);
        testCaseTaskStatus("DOING", TaskStatus.DOING);
        testCaseTaskStatus("DONE", TaskStatus.DONE);

        testCaseTaskStatus("todo", TaskStatus.TO_DO);
        testCaseTaskStatus("doing", TaskStatus.DOING);
        testCaseTaskStatus("done", TaskStatus.DONE);

        // TEST EXCEPTIONS
        String userInput = "OTHERINPUT";
        try{
            Mapper.statusMap(userInput);
            assertFalse(true);
        }catch (Exception e){
            assertTrue(true);
        }

        userInput = ""; // test with empty strings
        try{
            Mapper.statusMap(userInput);
            assertFalse(true);
        }catch (Exception e){
            assertTrue(true);
        }


    }


}
