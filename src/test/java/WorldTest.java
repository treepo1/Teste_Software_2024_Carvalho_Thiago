import org.junit.jupiter.api.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;



class WorldTest {
    @Test
    public void testWorld(){
        World mockWorld = mock(World.class);
        doAnswer(invocation -> {
            Object[] args = invocation.getArguments();
            System.out.println("called with arguments: " + Arrays.toString(args));
            return null;
        }).when(mockWorld).setState(anyString());

        mockWorld.setState("String de teste");
    }

    @Test
    public void testWorldNumberOfArguments(){
        World mockWorld = mock(World.class);
        doAnswer(invocation -> {
            Object[] args = invocation.getArguments();
            System.out.println("Called with number of arguments " + args.length);
            assert(args.length == 1);
            return null;
        }).when(mockWorld).setState(anyString());

        mockWorld.setState("teste");
    }


}


