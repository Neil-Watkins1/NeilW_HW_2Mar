package com.codeclan.example.fileTracker.projections;


import com.codeclan.example.fileTracker.models.File;
import com.codeclan.example.fileTracker.models.Folder;
import com.codeclan.example.fileTracker.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types = Folder.class)

public interface EmbedUser {

    String getTitle();
    User getUser();
    List<File> getFiles();


}
