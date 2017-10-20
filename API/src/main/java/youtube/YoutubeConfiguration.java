package youtube;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YoutubeConfiguration {

    @Bean
    public YoutubeManagerFacade youtubeLoaderFacade()
    {
        return new YoutubeManagerFacade("");
    }
}
