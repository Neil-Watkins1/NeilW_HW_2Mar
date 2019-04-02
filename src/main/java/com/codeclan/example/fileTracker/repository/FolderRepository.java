package com.codeclan.example.fileTracker.repository;

import com.codeclan.example.fileTracker.models.Folder;
import com.codeclan.example.fileTracker.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
