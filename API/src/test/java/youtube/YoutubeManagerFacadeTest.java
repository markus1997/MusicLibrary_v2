package youtube;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class YoutubeManagerFacadeTest {

    private YoutubeManagerFacade youtubeManagerFacade;

    @Before
    public void setup()
    {
        youtubeManagerFacade = new YoutubeManagerFacade("");
    }

    @Test
    public void connectToAPITest()
    {
       boolean result = youtubeManagerFacade.connectToAPI();

        Assert.assertTrue(result);
    }
}
