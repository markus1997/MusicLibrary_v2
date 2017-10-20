import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import youtube.YouTubeVideo;
import youtube.YouTubeMedia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootTest
public class YoutubeVideoTest {

    private YouTubeVideo youTubeVideo;

    @Test
    public void retrieveHttpLocationNullTest()
    {
        youTubeVideo = new YouTubeVideo();

        String result = youTubeVideo.getWebPlayerUrl();

        Assert.assertNull(result);

        youTubeVideo.setMedias(Collections.emptyList());

        Assert.assertNull(result);
    }

    @Test
    public void retrieveHttpLocationTest()
    {
        youTubeVideo = new YouTubeVideo();
        List<YouTubeMedia>  youTubeMediaList  = new ArrayList<>();
        youTubeMediaList.add(new YouTubeMedia("",""));
        youTubeMediaList.add(new YouTubeMedia("http://test",""));

        youTubeVideo.setMedias(youTubeMediaList);

        String result = youTubeVideo.retrieveHttpLocation();

        Assert.assertEquals("http://test",result);
    }
}
