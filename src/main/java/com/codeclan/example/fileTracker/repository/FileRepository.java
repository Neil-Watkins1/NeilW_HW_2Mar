package com.codeclan.example.fileTracker.repository;

import com.codeclan.example.fileTracker.models.File;
import com.codeclan.example.fileTracker.projections.EmbedFolder;
import com.codeclan.example.fileTracker.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
