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

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTestNetwork {

	@InjectMocks
	NetworkLayer network;

	@Mock
	DBDAO dbMock;

	@Test
	public void saveTest() {
		boolean saved = network.save("temp.txt");
		assertEquals(true, saved);

		verify(dbMock, times(1)).save("temp.txt");

	}
}
