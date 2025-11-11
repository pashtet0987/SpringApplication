package by.pashkavlushka.SpringApplication;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}
        
        @ParameterizedTest
        @ValueSource(ints = {1, 2, 3, 4, 5})
        void parameterizedTest(int value){
            System.out.println(value);
        }
        
        @RepeatedTest(10)
        void repeatedTest(RepetitionInfo repetitionInfo){
            System.out.println("repetition count is " + repetitionInfo.getCurrentRepetition());
            
        }
        
        @TestFactory
        List<DynamicTest> testFactory(){
            return List.of(DynamicTest.dynamicTest("test1", ()->{Assertions.assertEquals("abc", "abc");}),
                    DynamicTest.dynamicTest("test2", ()->{Assertions.assertEquals(3, 4);}),
                    DynamicTest.dynamicTest("test3", ()->{Assertions.assertEquals(3.14, 3.14);}));
        }
        
        @Test
        void someTest(){
            System.out.println("some test");
        }
        
        
        
        

}
