package youtube;

import org.springframework.context.annotation.Configuration;

import java.util.List;

public class YoutubeManagerFacade {

    private static final String YOUTUBE_URL = "http://gdata.youtube.com/feeds/api/videos";
    private static final String YOUTUBE_EMBEDDED_URL = "http://www.youtube.com/v/";

    private String clientId;

    public YoutubeManagerFacade(String clientId)
    {
        this.clientId = clientId;
    }

    public boolean connectToAPI(){
        return true;
    }
}
