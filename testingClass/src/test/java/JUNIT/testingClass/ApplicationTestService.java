package JUNIT.testingClass;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import JUNIT.testingClass.mockito.DBDAO;
import JUNIT.testingClass.mockito.NetworkLayer;
import JUNIT.testingClass.mockito.ServiceLayer;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTestService
{
    @InjectMocks
    ServiceLayer service;
     
    @Mock
    DBDAO dbMock;
     
    @Mock
    NetworkLayer networkMock;
     
    @Test
    public void saveTest()
    {
        boolean saved = service.save("temp.txt");
        assertEquals(true, saved);
         
        verify(dbMock, times(1)).save("temp.txt");
        verify(networkMock, times(1)).save("temp.txt");
    }


}
