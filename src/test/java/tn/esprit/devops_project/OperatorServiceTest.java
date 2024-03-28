package tn.esprit.devops_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.devops_project.entities.Operator;
import tn.esprit.devops_project.services.Iservices.IOperatorService;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest

public class OperatorServiceTest {
    @Autowired
    private IOperatorService operatorService;
    @Test
    public void AddOperatorTest(){
       /* @Mock
        private IOperatorService operatorService;

        @InjectMocks
        private OperatorServiceTest subject;

    public OperatorServiceTest() {
            MockitoAnnotations.openMocks(this);
        }

        @Test
        public void testAddOperator() {
            // Given
            Operator operator = new Operator();
            operator.setFname("boz");
            operator.setLname("boz");
            operator.setPassword("123456789");

            // Mock behavior of operatorService.addOperator
            when(operatorService.addOperator(any(Operator.class))).thenReturn(operator);

            // When
            Operator result = operatorService.addOperator(operator);

            // Then
            assertNotNull(result);
            assertNotNull(result.getIdOperateur());
            assertEquals(operator.getFname(), result.getFname());
            assertEquals(operator.getLname(), result.getLname());
            assertEquals(operator.getPassword(), result.getPassword());
        }*/

        Operator Operator = new Operator();
        Operator.setFname("boz");
        Operator.setLname("boz");
        Operator.setPassword("123456789");

        Operator result = operatorService.addOperator(Operator);
        assertEquals(Operator, result);
        assertNotNull(result.getIdOperateur());
        assertEquals(Operator.getFname(), result.getFname());
        assertEquals(Operator.getLname(), result.getLname());
        assertEquals(Operator.getPassword(), result.getPassword());
    }


}
