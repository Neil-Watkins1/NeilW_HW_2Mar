package com.codeclan.example.fileTracker.projections;

import com.codeclan.example.fileTracker.models.File;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {

    String getFileName();
    String getExtension();
    int getSize();

}



